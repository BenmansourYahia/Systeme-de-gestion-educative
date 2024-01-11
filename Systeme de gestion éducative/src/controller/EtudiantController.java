package controller;
import Classes.Etudiant;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EtudiantController {

    private static Scanner scanner = new Scanner(System.in);
    private static List<Etudiant> etudiants = new ArrayList<>();

    public void showMenu() {
        int choix;
        do {
            System.out.println("\n----- Menu Étudiant -----");
            System.out.println("1. Ajouter un étudiant");
            System.out.println("2. Afficher les étudiants");
            System.out.println("3. Modifier un étudiant");
            System.out.println("4. Supprimer un étudiant");
            System.out.println("0. Retourner au menu principal");
            System.out.print("Entrez votre choix : ");
            choix = scanner.nextInt();

            switch (choix) {
                case 1:
                    ajouterEtudiant();
                    break;
                case 2:
                    afficherEtudiants();
                    break;
                case 3:
                    modifierEtudiant();
                    break;
                case 4:
                    supprimerEtudiant();
                    break;
            }
        } while (choix != 0);
    }

    private void ajouterEtudiant() {
        System.out.print("Entrez le nom de l'étudiant : ");
        String nom = scanner.next();
        System.out.print("Entrez le prénom de l'étudiant : ");
        String prenom = scanner.next();

        Etudiant etudiant = new Etudiant(nom, prenom, 0, null);
        etudiants.add(etudiant);
        System.out.println("Étudiant ajouté avec succès.");
    }

    private void afficherEtudiants() {
        if (etudiants.isEmpty()) {
            System.out.println("Aucun étudiant enregistré.");
        } else {
            for (Etudiant etudiant : etudiants) {
                System.out.println(etudiant);
            }
        }
    }

    private void modifierEtudiant() {
        afficherEtudiants();
        System.out.print("Entrez l'apogee de l'étudiant à modifier : ");
        int apogee = scanner.nextInt();

        if (apogee >= 0 && apogee < etudiants.size()) {
            System.out.print("Entrez le nouveau nom de l'étudiant : ");
            String nom = scanner.next();
            System.out.print("Entrez le nouveau prénom de l'étudiant : ");
            String prenom = scanner.next();

            Etudiant etudiant = etudiants.get(apogee);
            etudiant.setNom(nom);
            etudiant.setPrenom(prenom);
            System.out.println("Étudiant modifié avec succès.");
        } else {
            System.out.println("apogee invalide.");
        }
    }

    private void supprimerEtudiant() {
        afficherEtudiants();
        System.out.print("Entrez l'apogee de l'étudiant à supprimer : ");
        int apogee = scanner.nextInt();

        if (apogee >= 0 && apogee < etudiants.size()) {
            etudiants.remove(apogee);
            System.out.println("Étudiant supprimé avec succès.");
        } else {
            System.out.println("apogee invalide.");
        
    }
}
}
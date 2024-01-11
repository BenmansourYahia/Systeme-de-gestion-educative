package controller;
import Classes.Enseignant;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EnseignantsController {

    private static Scanner scanner = new Scanner(System.in);
    private static List<Enseignant> enseignants = new ArrayList<>();

    public void showMenu() {
        int choix;
        do {
            System.out.println("\n----- Menu Enseignant -----");
            System.out.println("1. Ajouter un enseignant");
            System.out.println("2. Afficher les enseignants");
            System.out.println("3. Modifier un enseignant");
            System.out.println("4. Supprimer un enseignant");
            System.out.println("0. Retourner au menu principal");
            System.out.print("Entrez votre choix : ");
            choix = scanner.nextInt();

            switch (choix) {
                case 1:
                    ajouterEnseignant();
                    break;
                case 2:
                    afficherEnseignants();
                    break;
                case 3:
                    modifierEnseignant();
                    break;
                case 4:
                    supprimerEnseignant();
                    break;
            }
        } while (choix != 0);
    }

    private void ajouterEnseignant() {
        System.out.print("Entrez le nom de l'enseignant : ");
        String nom = scanner.next();
        System.out.print("Entrez le prénom de l'enseignant : ");
        String prenom = scanner.next();
        System.out.print("Entrez l'email de l'enseignant : ");
        String email = scanner.next();
        System.out.print("Entrez le grade de l'enseignant : ");
        String grade = scanner.next();



        Enseignant enseignant = new Enseignant(nom, prenom,email,grade);
        enseignants.add(enseignant);
        System.out.println("Enseignant ajouté avec succès.");
    }

    private void afficherEnseignants() {
        if (enseignants.isEmpty()) {
            System.out.println("Aucun enseignant enregistré.");
        } else {
            for (Enseignant enseignant : enseignants) {
                System.out.println(enseignant);
            }
        }
    }

    private void modifierEnseignant() {
        afficherEnseignants();
        System.out.print("Entrez l'ID de l'enseignant à modifier : ");
        int id = scanner.nextInt();

        if (id >= 0 && id < enseignants.size()) {
            System.out.print("Entrez le nouveau nom de l'enseignant : ");
            String nom = scanner.next();
            System.out.print("Entrez le nouveau prénom de l'enseignant : ");
            String prenom = scanner.next();
            System.out.print("Entrez le nouveau email de l'enseignant : ");
            String email = scanner.next();
            System.out.print("Entrez le nouveau grade de l'enseignant : ");
            String grade = scanner.next();

            Enseignant enseignant = enseignants.get(id);
            enseignant.setNom(nom);
            enseignant.setPrenom(prenom);
            enseignant.setEmail(email);
            enseignant.setGrade(grade);
            System.out.println("Enseignant modifié avec succès.");
        } else {
            System.out.println("ID invalide.");
        }
    }

    private void supprimerEnseignant() {
        afficherEnseignants();
        System.out.print("Entrez l'ID de l'enseignant à supprimer : ");
        int id = scanner.nextInt();

        if (id >= 0 && id < enseignants.size()) {
            enseignants.remove(id);
            System.out.println("Enseignant supprimé avec succès.");
        } else {
            System.out.println("ID invalide.");
        }
    }
}


package controller;

import Classes.Filiere;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class FiliereController {

    private static Scanner scanner = new Scanner(System.in);
    private static List<Filiere> filieres = new ArrayList<>();

    public void showMenu() {
        int choix;
        do {
            System.out.println("\n----- Menu Filière -----");
            System.out.println("1. Ajouter une filière");
            System.out.println("2. Afficher les filières");
            System.out.println("3. Modifier une filière");
            System.out.println("4. Supprimer une filière");
            System.out.println("0. Retourner au menu principal");
            System.out.print("Entrez votre choix : ");
            choix = scanner.nextInt();

            switch (choix) {
                case 1:
                    ajouterFiliere();
                    break;
                case 2:
                    afficherFilieres();
                    break;
                case 3:
                    modifierFiliere();
                    break;
                case 4:
                    supprimerFiliere();
                    break;
            }
        } while (choix != 0);
    }

    private void ajouterFiliere() {
        System.out.print("Entrez l'intitule de la filière : ");
        String intitule = scanner.next();

        Filiere filiere = new Filiere(intitule, null);
        filieres.add(filiere);
        System.out.println("Filière ajoutée avec succès.");
    }

    private void afficherFilieres() {
        if (filieres.isEmpty()) {
            System.out.println("Aucune filière enregistrée.");
        } else {
            for (Filiere filiere : filieres) {
                System.out.println(filiere);
            }
        }
    }

    private void modifierFiliere() {
        afficherFilieres();
        System.out.print("Entrez le departement de la filière à modifier : ");
        int departement = scanner.nextInt();

        if (departement >= 0 && departement < filieres.size()) {
            System.out.print("Entrez le nouveau intitule de la filière : ");
            String intitule = scanner.next();

            Filiere filiere = filieres.get(departement);
            filiere.setIntitule(intitule);
            System.out.println("Filière modifiée avec succès.");
        } else {
            System.out.println("departement invalide.");
        }
    }

    private void supprimerFiliere() {
        afficherFilieres();
        System.out.print("Entrez le departement de la filière à supprimer : ");
        int departement = scanner.nextInt();

        if (departement >= 0 && departement < filieres.size()) {
            filieres.remove(departement);
            System.out.println("Filière supprimée avec succès.");
        } else {
            System.out.println("departement invalide.");
        }
    }
}

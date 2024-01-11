package controller;

import Classes.Departement;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DepartementsController {

    private static Scanner scanner = new Scanner(System.in);
    private static List<Departement> departements = new ArrayList<>();

    public void showMenu() {
        int choix;
        do {
            System.out.println("\n----- Menu Département -----");
            System.out.println("1. Ajouter un département");
            System.out.println("2. Afficher les départements");
            System.out.println("3. Modifier un département");
            System.out.println("4. Supprimer un département");
            System.out.println("0. Retourner au menu principal");
            System.out.print("Entrez votre choix : ");
            choix = scanner.nextInt();

            switch (choix) {
                case 1:
                    ajouterDepartement();
                    break;
                case 2:
                    afficherDepartements();
                    break;
                case 3:
                    modifierDepartement();
                    break;
                case 4:
                    supprimerDepartement();
                    break;
            }
        } while (choix != 0);
    }

    private void ajouterDepartement() {
        System.out.print("Entrez l'intitule du département : ");
        String intitule = scanner.next();

        Departement departement = new Departement(intitule);
        departements.add(departement);
        System.out.println("Département ajouté avec succès.");
    }

    private void afficherDepartements() {
        if (departements.isEmpty()) {
            System.out.println("Aucun département enregistré.");
        } else {
            for (Departement departement : departements) {
                System.out.println(departement);
            }
        }
    }

    private void modifierDepartement() {
        afficherDepartements();
        System.out.print("Entrez l'ID du département à modifier : ");
        int id = scanner.nextInt();

        if (id >= 0 && id < departements.size()) {
            System.out.print("Entrez le nouveau intitule du département : ");
            String intitule = scanner.next();

            Departement departement = departements.get(id);
            departement.setIntitule(intitule);
            System.out.println("Département modifié avec succès.");
        } else {
            System.out.println("ID invalide.");
        }
    }

    private void supprimerDepartement() {
        afficherDepartements();
        System.out.print("Entrez l'ID du département à supprimer : ");
        int id = scanner.nextInt();

        if (id >= 0 && id < departements.size()) {
            departements.remove(id);
            System.out.println("Département supprimé avec succès.");
        } else {
            System.out.println("ID invalide.");
        }
    }
}

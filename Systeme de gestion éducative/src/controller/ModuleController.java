package controller;
import Classes.Module;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ModuleController {

    private static Scanner scanner = new Scanner(System.in);
    private static List<Module> modules = new ArrayList<>();

    public void showMenu() {
        int choix;
        do {
            System.out.println("\n----- Menu Module -----");
            System.out.println("1. Ajouter un module");
            System.out.println("2. Afficher les modules");
            System.out.println("3. Modifier un module");
            System.out.println("4. Supprimer un module");
            System.out.println("0. Retourner au menu principal");
            System.out.print("Entrez votre choix : ");
            choix = scanner.nextInt();

            switch (choix) {
                case 1:
                    ajouterModule();
                    break;
                case 2:
                    afficherModules();
                    break;
                case 3:
                    modifierModule();
                    break;
                case 4:
                    supprimerModule();
                    break;
            }
        } while (choix != 0);
    }

    private void ajouterModule() {
        System.out.print("Entrez l'intitule du module : ");
        String intitule = scanner.next();

        Module module = new Module(intitule, null);
        modules.add(module);
        System.out.println("Module ajouté avec succès.");
    }

    private void afficherModules() {
        if (modules.isEmpty()) {
            System.out.println("Aucun module enregistré.");
        } else {
            for (Module module : modules) {
                System.out.println(module);
            }
        }
    }

    private void modifierModule() {
        afficherModules();
        System.out.print("Entrez la filiere du module à modifier : ");
        int filiere = scanner.nextInt();

        if (filiere >= 0 && filiere < modules.size()) {
            System.out.print("Entrez le nouveau intitule du module : ");
            String intitule = scanner.next();

            Module module = modules.get(filiere);
            module.setIntitule(intitule);
            System.out.println("Module modifié avec succès.");
        } else {
            System.out.println("ID invalide.");
        }
    }

    private void supprimerModule() {
        afficherModules();
        System.out.print("Entrez la filiere du module à supprimer : ");
        int filiere = scanner.nextInt();

        if (filiere >= 0 && filiere < modules.size()) {
            modules.remove(filiere);
            System.out.println("Module supprimé avec succès.");
        } else {
            System.out.println("filiere invalide.");
        }
    }
}

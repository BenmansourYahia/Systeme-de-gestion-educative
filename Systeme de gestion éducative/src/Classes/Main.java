package Classes;
public class Main {
    public static void main(String[] args) {
        // Créer des enseignants
        Enseignant enseignant1 = new Enseignant("Durand", "Alice", "alice.durand@email.com", "Professeur");
        Enseignant enseignant2 = new Enseignant("Lefebvre", "Bernard", "bernard.lefebvre@email.com", "Maître de conférences");

        // Créer des départements
        Departement departement1 = new Departement("Informatique");
        departement1.setResponsable(enseignant1);

        Departement departement2 = new Departement("Mathématiques");
        departement2.setResponsable(enseignant2);

        // Créer des filières
        Filiere filiere1 = new Filiere("Génie Logiciel", departement1);
        Filiere filiere2 = new Filiere("Data Science", departement1);

        // Ajouter les filières aux départements
        departement1.getFilieres().add(filiere1);
        departement1.getFilieres().add(filiere2);

        // Créer des modules
        Module module1 = new Module("Programmation Java", filiere1);
        Module module2 = new Module("Machine Learning", filiere2);

        // Assigner des enseignants aux modules
        module1.setEnseignant(enseignant1);
        module2.setEnseignant(enseignant2);

        // Créer des étudiants
        Etudiant etudiant1 = new Etudiant("Moreau", "Julie", 12345, filiere1);
        // Afficher les informations
        System.out.println("Département: " + departement1.getIntitule() + ", Responsable: " + departement1.getResponsable().getNom());
        System.out.println("Filières dans le département:");
        for (Filiere filiere : departement1.getFilieres()) {
            System.out.println(" - " + filiere.getIntitule());
        }

        System.out.println("\nModule: " + module1.getIntitule() + ", Enseignant: " + module1.getEnseignant().getNom());
        System.out.println("Étudiant dans la filière '" + filiere1.getIntitule() + "': " + etudiant1.getNom() + " " + etudiant1.getPrenom());
    }
}

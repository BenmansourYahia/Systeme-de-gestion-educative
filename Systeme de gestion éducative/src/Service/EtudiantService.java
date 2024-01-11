package Service;
import Classes.Etudiant;
import Classes.Filiere;
import java.util.ArrayList;
import java.util.List;

public class EtudiantService {
    private static List<Etudiant> etudiants = new ArrayList<>();

    public static void addEtudiant(Etudiant etudiant) {
        etudiants.add(etudiant);
    }

    public static List<Etudiant> getAllEtudiants() {
        return new ArrayList<>(etudiants);
    }

    public static Etudiant getEtudiantByFiliere(Filiere filiere) {
        return etudiants.stream()
            .filter(etudiant -> etudiant.getFiliere() == filiere)
            .findFirst()
            .orElse(null);
    }

    public static void updateEtudiant(Filiere filiere, Etudiant newEtudiant) {
        for (int i = 0; i < etudiants.size(); i++) {
            if (etudiants.get(i).getFiliere() == filiere) {
                etudiants.set(i, newEtudiant);
                return;
            }
        }
    }

    public static void deleteEtudiant(Filiere filiere) {
        etudiants.removeIf(etudiant -> etudiant.getFiliere() == filiere);
    }
}

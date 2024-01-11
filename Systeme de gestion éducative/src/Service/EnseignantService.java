package Service;
import Classes.Departement;
import Classes.Enseignant;
import java.util.ArrayList;
import java.util.List;

public class EnseignantService {
    private static List<Enseignant> enseignants = new ArrayList<>();

    public static void addEnseignant(Enseignant enseignant) {
        enseignants.add(enseignant);
    }

    public static List<Enseignant> getAllEnseignants() {
        return new ArrayList<>(enseignants);
    }

    public static Enseignant getEnseignantByDepartement(Departement departement) {
        return enseignants.stream()
            .filter(enseignant -> enseignant.getDepartement() == departement)
            .findFirst()
            .orElse(null);
    }

    public static void updateEnseignant(Departement departement, Enseignant newEnseignant) {
        for (int i = 0; i < enseignants.size(); i++) {
            if (enseignants.get(i).getDepartement() == departement) {
                enseignants.set(i, newEnseignant);
                return;
            }
        }
    }

    public static void deleteEnseignant(Departement departement) {
        enseignants.removeIf(enseignant -> enseignant.getDepartement() == departement);
    }
}



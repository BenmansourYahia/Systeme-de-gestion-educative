package Service;
import Classes.Departement;
import Classes.Filiere;
import java.util.ArrayList;
import java.util.List;

public class FiliereService {
    private static List<Filiere> filieres = new ArrayList<>();

    public static void addFiliere(Filiere filiere) {
        filieres.add(filiere);
    }

    public static List<Filiere> getAllFilieres() {
        return new ArrayList<>(filieres);
    }

    public static Filiere getFiliereByDepartement(Departement departement) {
        return filieres.stream()
            .filter(filiere -> filiere.getDepartement() == departement)
            .findFirst()
            .orElse(null);
    }

    public static void updateFiliere(Departement departement, Filiere newFiliere) {
        for (int i = 0; i < filieres.size(); i++) {
            if (filieres.get(i).getDepartement() == departement) {
                filieres.set(i, newFiliere);
                return;
            }
        }
    }

    public static void deleteFiliere(Departement departement) {
        filieres.removeIf(filiere -> filiere.getDepartement() == departement);
    }
}


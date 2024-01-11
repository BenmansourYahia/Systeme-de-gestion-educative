package Service;
import Classes.Filiere;
import Classes.Module;
import java.util.ArrayList;
import java.util.List;

public class ModuleService {
    private static List<Module> modules = new ArrayList<>();

    public static void addModule(Module module) {
        modules.add(module);
    }

    public static List<Module> getAllModules() {
        return new ArrayList<>(modules);
    }

    public static Module getModuleByFiliere(Filiere filiere) {
        return modules.stream()
            .filter(module -> module.getFiliere() == filiere)
            .findFirst()
            .orElse(null);
    }

    public static void updateModule(Filiere filiere, Module newModule) {
        for (int i = 0; i < modules.size(); i++) {
            if (modules.get(i).getFiliere() == filiere) {
                modules.set(i, newModule);
                return;
            }
        }
    }

    public static void deleteModule(Filiere filiere) {
        modules.removeIf(module -> module.getFiliere() == filiere);
    }
}

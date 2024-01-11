package Classes;
import java.util.ArrayList;
import java.util.List;

public class Filiere {
    private String intitule;
    private Enseignant responsable;
    private Departement departement;
    private List<Module> modules;
    // Constructeur, getters et setters

    public Filiere(String intitule, Departement departement) {
        this.intitule = intitule;
        this.departement = departement;
        this.modules = new ArrayList<>();
    }
   
    public String getIntitule() { 
    	return intitule; }
    public void setIntitule(String intitule) { 
    	this.intitule = intitule; }

    public Enseignant getResponsable() { 
    	return responsable; }
    public void setResponsable(Enseignant responsable) { 
    	this.responsable = responsable; }

    public Departement getDepartement() { 
    	return departement; }
    public void setDepartement(Departement departement) { 
    	this.departement = departement; }

    public List<Module> getModules() { 
    	return modules; }
    // Pas de setter pour la liste des modules, utilisez des méthodes pour modifier la liste
}

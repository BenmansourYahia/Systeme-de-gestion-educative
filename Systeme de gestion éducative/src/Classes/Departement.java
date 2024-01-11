package Classes;
import java.util.ArrayList;
import java.util.List;

public class Departement {
    private String intitule;
    private Enseignant responsable;
    private List<Filiere> filieres;
    
//constructeur getters et setters
    
    public Departement(String intitule) {
        this.intitule = intitule;
        this.filieres = new ArrayList<>();
    }
    public String getIntitule() {
    	return intitule; }
    public void setIntitule(String intitule) { 
    	this.intitule = intitule; }

    public Enseignant getResponsable() { 
    	return responsable; }
    public void setResponsable(Enseignant responsable) { 
    	this.responsable = responsable; }

    public List<Filiere> getFilieres() { 
    	return filieres; }
    // Pas de setter pour la liste des filières, utilisez des méthodes pour modifier la liste
}

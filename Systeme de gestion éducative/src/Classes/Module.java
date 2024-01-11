package Classes;
public class Module {
    private String intitule;
    private Filiere filiere;
    private Enseignant enseignant;
    
    
    
    // Constructeur, getters et setters
    public Module(String intitule, Filiere filiere) {
        this.intitule = intitule;
        this.filiere = filiere;
    }
    public String getIntitule() { 
    	return intitule; }
    public void setIntitule(String intitule) { 
    	this.intitule = intitule; }

    public Filiere getFiliere() { 
    	return filiere; }
    public void setFiliere(Filiere filiere) { 
    	this.filiere = filiere; }

    public Enseignant getEnseignant() { 
    	return enseignant; }
    public void setEnseignant(Enseignant enseignant) { 
    	this.enseignant = enseignant; }
    }


package Classes;
public class Enseignant {
    private String nom;
    private String prenom;
    private String email;
    private String grade;
    private Departement departement;

    // Constructeur, getters et setters
    public Enseignant(String nom, String prenom, String email, String grade) {
        this.nom = nom;
        this.prenom = prenom;
        this.email = email;
        this.grade = grade;
    }
    public String getNom() { 
    	return nom; }
    
    public void setNom(String nom) { 
    	this.nom = nom; }


public String getPrenom() { 
	return prenom; }

public void setPrenom(String prenom) { 
	this.prenom = prenom; }


public String getEmail() { 
	return email; }

public void setEmail(String email) { 
	this.email = email; }


public String getGrade() { 
	return grade; }

public void setGrade(String grade) { 
	this.grade = grade; }


public Departement getDepartement() {
	return departement; }

public void setDepartement(Departement departement) {
	this.departement = departement; }
}
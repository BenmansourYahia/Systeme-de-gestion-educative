package Classes;
public class Etudiant {
    private String nom;
    private String prenom;
    private String email;
    private int apogee;
    private Filiere filiere;

    // Constructeur, getters et setters
        public Etudiant(String nom, String prenom, int apogee, Filiere filiere) {
            this.nom = nom;
            this.prenom = prenom;
            this.apogee = apogee;
            this.filiere = filiere;
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

        public int getApogee() { return apogee; }
        public void setApogee(int apogee) { 
        	this.apogee = apogee; }

        public Filiere getFiliere() { 
        	return filiere; }
        public void setFiliere(Filiere filiere) { 
        	this.filiere = filiere; }
    }



package bo;

public class Personne {
	private int id;
	private String prenom;
	private String nom;
	private static int i =0;
	
	public Personne(int id, String prenom, String nom) {
		this.id = id;
		this.prenom = prenom;
		this.nom = nom;
		Personne.i++ ;
	}
	public Personne() {
		this.i++;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public static int getI() {
		return Personne.i;
	}
	@Override
	public String toString() {
		return "Personne [id=" + id + ", prenom=" + prenom + ", nom=" + nom + "]";
	}
	
	
}

package banque;

public class Personne {

	private String nom;
	private String prenom;
	private int cin;
	private int age;
	public Personne(String nom, String prenom, int cin, int age) {
		this.nom=nom;
		this.prenom=prenom;
		this.cin=cin;
		this.age=age;
	}
	public String getNom() {
		return this.nom;
	}
	public void setNom(String nom) {
		this.nom=nom;
	}
	public String getPrenom() {
		return this.prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom=prenom;
	}
	public int getCin() {
		return this.cin;
	}
	public int getAge() {
		return this.age;
	}
	public String afficherPersonne() {
		return ("nom: "+this.nom+" prenom: "+this.prenom+" cin: "+this.cin+" age: "+this.age);
	}

}

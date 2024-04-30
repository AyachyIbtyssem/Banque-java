package banque;

public class Compte {
	private double solde;
	private int numero;
	private Personne titulaire;
	public Compte(double solde, int numero, Personne titulaire) {
		this.solde=solde;
		this.numero = numero;
		this.titulaire=titulaire;
	}
	public double getSolde() {
		return this.solde;
	}
	public void setSolde(double solde) {
		this.solde=solde;
	}
	public int getNumero() {
		return this.numero;
	}
	public Personne getTitulaire() {
		return this.titulaire;
	}
	public String afficherCompte() {
	    String compteInfo = "solde: " + this.solde + " numero: " + this.numero;
	    String titulaireInfo = this.titulaire.afficherPersonne();
	    return compteInfo + "\n" + titulaireInfo;
	}
	public void deposer(int numero,double solde) {
				double solde1=this.solde;
				solde1=solde1+solde;
				setSolde(solde1);
			
	}
	public void retirer(int numero,double solde) {
				double solde1=this.solde;
				if(solde1>solde) {
					solde1=solde1-solde;
					setSolde(solde1);
				
				}
				else setSolde(0);
		}



}

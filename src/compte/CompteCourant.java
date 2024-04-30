package compte;

import banque.Personne;

public class CompteCourant extends Compte{
	public CompteCourant(double solde, int numero, Personne titulaire) {
		super(solde,numero,titulaire);
	}
	public void deposer(int numero,double solde) {
		double solde1=getSolde();
		solde1=solde1+solde;
		setSolde(solde1);
	
	}
	public void retirer(int numero,double solde) {
		double solde1=getSolde();
		if(solde1>solde) {
			solde1=solde1-solde-1;
			setSolde(solde1);
		
		}
		else setSolde(0);
	}


}

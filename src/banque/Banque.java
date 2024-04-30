package banque;

public class Banque {
	private String nom;
	private Compte[] compte=new Compte[20];
	private int n;		//nombre de compte
	public Banque(String nom, Compte[] compte) {
		this.nom=nom;
		this.compte=compte;
		n++;
	}
	public String getNom() {
		return this.nom;
	}
	public Compte getCompte() {
		if(compte.length>0) 
			return compte[0];
		else return null;
	}
	public int getN() {
		return n;
	}
	public Compte rechercherCompte(int numero) {
		for(int i=0;i<n;i++) {
			if(this.compte[i].getNumero()==numero)
				return this.compte[i];
		}
		return null;
	}
	public int rechercherIndexCompte(int numero) {
		for(int i=0;i<n;i++) {
			if(this.compte[i].getNumero()==numero)
				return i;
		}
		return 0;
	}
	public void ouvrirCompte(Compte compte) {
		this.compte[n]=compte;
		n++;
	}
	public void fermerCompte(int numero) {
		Compte comp=rechercherCompte(numero);
		if(comp!=null) {
			int index=rechercherIndexCompte(numero);
			for(int i=index;i<n-1;i++) {
				this.compte[i]=this.compte[i+1];
			}
			n--;
		}
		else
			System.out.println("compte avec ce numero "+numero+" n'exite pas");
	}

}




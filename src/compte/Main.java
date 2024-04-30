package compte;

import banque.Personne;

public class Main {

	public static void main(String[] args) {
		Personne p=new Personne("bty","ayachi",12345,21);
		CompteCourant comp=new CompteCourant(123333,4,p);
		System.out.println(comp.getSolde());
		comp.retirer(4,3l);
		System.out.println(comp.getSolde());

	}

}
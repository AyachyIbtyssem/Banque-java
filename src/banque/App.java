package banque;

public class App {

	public static void main(String[] args) {
		Personne p=new Personne("bty","ayachy",111111,22);
		Compte comp=new Compte(1234,5,p);
		System.out.println(comp.getSolde());
		comp.retirer(5, 23);
		System.out.println(comp.getSolde());
		comp.deposer(5, 123000);
		System.out.println(comp.getSolde());
	}

}

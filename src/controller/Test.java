package controller;

import bo.Personne;

public class Test {

	public static void main(String[] args) {
		System.out.println("hello");
		Personne personne1 = new Personne(42,"Tom","CRUISE");
		Personne personne2 = new Personne();
		personne2.setId(54);
		personne2.setPrenom("Nicolas");
		personne2.setNom("CAGE");
		System.out.println(personne2);
		System.out.println(personne1.getI()); // 0  2
		System.out.println(personne2.getI()); // 0  2
		System.out.println(Personne.getI()); // 0   2
	}

}

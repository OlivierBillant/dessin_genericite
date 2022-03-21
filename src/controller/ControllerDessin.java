package controller;

import bo.*;

public class ControllerDessin {
	public static void main(String[] args) {
		Rectangle rec = new Rectangle(0,0,40,10);
		Carre car = new Carre(1,1,10);
		Cercle cer = new Cercle(0,0,10);
		car.setLargeur(1);
		// interdit !!
		//Forme f = new Forme(2,2);
		System.out.println(Forme.getInfo());
		
		System.out.println(car);
		System.out.println(rec.getSuperficie());
		System.out.println(cer.getSuperficie());
		System.out.println(rec.decrisToi());
	}
}

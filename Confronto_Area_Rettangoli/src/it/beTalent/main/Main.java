package it.beTalent.main;

import it.beTalent.entity.Rettangolo;

public class Main {

	public static void main(String[] args) {
		
		Rettangolo r1 = new Rettangolo(4.5 , 3.4);
		
		Rettangolo r2 = new Rettangolo (6.5 , 5.4);
		
		double a1 = r1.calcolo_Area(r1.base, r1.altezza);
		double a2 = r2.calcolo_Area(r2.base, r2.altezza);
		
		if (a1 > a2) {
			
			System.out.println("L'area del primo rettangolo"
					+ " è maggiore dell'area del secondo: "+ a1 + " > " + a2 );
		}
		else if (a2 > a1) {
			System.out.println("L'area del secondo rettangolo"
					+ " è maggiore dell'area del primo: "+ a2 + " > " + a1 );
		}
		
		else {
			System.out.println("I due rettangoli hanno la stessa area: "+ a2 + " = " + a1 );
		}

	}

}

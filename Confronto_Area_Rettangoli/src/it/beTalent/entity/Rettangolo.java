package it.beTalent.entity;


public class Rettangolo {
	
	public double base;
	public double altezza;
	
	public Rettangolo(double base, double altezza) {
		super();
		this.base = base;
		this.altezza = altezza;
	}
	
	public Rettangolo() {
		super();
	}
	
	public double calcolo_Area(double b, double h) {
		
		double area = b * h;
		
		return area;
		
	}
	
	

}

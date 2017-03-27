package linie;

import linie.Punkt.Linie;

public class test {

	
	public static void main(String[] args) {
		Punkt Punkt00=new Punkt(0,0);
		Punkt Punkt01=new Punkt(0,1);

		Linie linie00=Punkt00.new Linie(Punkt00,Punkt01);
		System.out.println(linie00.Punkt1.getX());
		System.out.println(linie00.Punkt1.getY());
		System.out.println(linie00.Punkt2.getX());
		System.out.println(linie00.Punkt2.getY());
		
		
	}

}

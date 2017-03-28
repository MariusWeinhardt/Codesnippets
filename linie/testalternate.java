package linie;

import linie.ppalternate.Linie;

public class testalternate {
	
	public void main(String[] args){
		ppalternate p1;
		ppalternate p2;
		Linie linie1;
		
		p1= new ppalternate(0,0);
		p2 = new ppalternate(1,1);
		linie1= p1.new Linie(p1,p2);
		try {
			System.out.println(linie1.clone());
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}

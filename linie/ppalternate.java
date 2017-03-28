package linie;

public class ppalternate {
	double x;
	double y;
	
	
	
	public ppalternate(double x, double y) {
		this.x = x;
		this.y = y;
	}
	public double getX() {
		return x;
	}
	public void setX(double x) {
		this.x = x;
	}
	public double getY() {
		return y;
	}
	public void setY(double y) {
		this.y = y;
	}
	
	
	
	
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return super.equals(obj);
	}




	public class Linie{
		ppalternate punkt1;
		ppalternate punkt2;
		
		
		
		
		public Linie(ppalternate p1, ppalternate p2) {
			this.punkt1 = p1;
			this.punkt2 = p2;
		}

		public ppalternate getPunkt1() {
			return punkt1;
		}
	
		public void setPunkt1(ppalternate punkt1) {
			this.punkt1 = punkt1;
		}
		public ppalternate getPunkt2() {
			return punkt2;
		}
		public void setPunkt2(ppalternate punkt2) {
			this.punkt2 = punkt2;
		}
		
	
		@Override
		protected Object clone() throws CloneNotSupportedException {
			// TODO Auto-generated method stub
			return super.clone();
		}
		@Override
		public boolean equals(Object arg0) {
			// TODO Auto-generated method stub
			return super.equals(arg0);
		}
		
	}
	
}

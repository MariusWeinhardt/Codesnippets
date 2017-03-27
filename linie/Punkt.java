package linie;


	
	
public class Punkt {

	private int x;
	private int y;
		
	public Punkt(int x,int y){
		this.x=x;
		this.y=y;
	}
	
	
	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}


	@Override
	public boolean equals(Object punkt){
		if((((Punkt) punkt).getX()!=this.x || ((Punkt) punkt).getY()!=this.y))
		return false;
		
		
		if(punkt==null)
		return false;
		
		
		return true;
		
	}
	

	
	public class Linie {
		Punkt Punkt1;
		Punkt Punkt2;
		
		public Linie(Punkt Punkt1,Punkt Punkt2){
			this.Punkt1=Punkt1;
			this.Punkt2=Punkt2;
		}
		
		@Override
		public  boolean equals(Object linie){
			if(linie==null){
			return false;
			}
			
			if(Punkt1.equals(((Linie) linie).getPunkt1()) && Punkt2.equals(((Linie) linie).getPunkt2()))
				return true;
			
			return false;	
		}
		
		
		public Punkt getPunkt1(){
			return Punkt1;
		}
		
		public Punkt getPunkt2(){
			return Punkt2;
		}
		
		
		@Override
		public Linie clone()
		{
			//three variants
			//first
			return new Linie(this.getPunkt1(),this.getPunkt2());
			
			//second
			// return (Linie) super.clone();
			//third
			//return this;
		}
	
}

}	


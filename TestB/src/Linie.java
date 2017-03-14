
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
		
		return true;	
	}
	
	
	@Override
	public Object clone()
	{
		
		return this;
		
	}
	
}

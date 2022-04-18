package Abstraction_concept;

public class Yamaha extends Government {
    
	
	@Override
	public void Colour() {
		System.out.println("Grey");
	}
	
	@Override
	public void Model() {
	   System.out.println("Fz");
		
	}
	
	  public static void main(String[] args) {
		
		  
		Yamaha Bike= new Yamaha() ;
		
		
		Bike.Engine();
		Bike.Brake();
		Bike.Colour();
		Bike.Model();
		  
	}
	
	
	} 
      
	



package OOPS_concept;

public class Overloading {

	private void details(int a){
		System.out.println(a);
	}
	 private void details(int b,int c){
		 System.out.println(b*c);
	 }
	 private void details(String s, char c){
		 System.out.println(s+c);
	 }
	 
	 public static void main(String[] args) {
		            
		Overloading det=new Overloading() ;
		 
		det.details(123456); 
		det.details(123, 2); 
		det.details("niv",'i'); 
	}
	 
	 
	 
		
	}
	
	
	
	


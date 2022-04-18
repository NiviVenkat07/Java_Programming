package Keywords_concept;

public class Static_keyword {
	
	int a= 99 ;
	
	public static void main(String[] args) {
		
	System.out.println("main method");	
		
	Static_keyword S = new Static_keyword ();
	
	S.Key ();
		
	System.out.println(S.a);
	
	}
	
	public Static_keyword() {
		
	System.out.println("constructor");	
		
	}
	
	public void Key () {
		  
		System.out.println("method");
	
	
	}
	
	static {
	
	
	System.out.println("static block");
	
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

package Exception_Concept;

public class Exception_Handling {

	public static void main(String[] args) {
		
	
			int a = 1000;
				    
			try {
				System.out.println(a / 0);
			}
			catch (ArithmeticException e) {
				
				System.out.println("handle Arithmetic");
			}	
			
			finally {
				int b = 4000;
				int c = 2000;
			  int d= b+c;
				
			   System.out.println("Finally "+d);
			}
				
				}
				
			
		
		
		
		
		
		
		
		
		
		
		
		
		
		}		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	



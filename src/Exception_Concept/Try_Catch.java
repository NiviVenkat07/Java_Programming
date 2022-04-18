package Exception_Concept;

public class Try_Catch {

	public static void main(String[] args) {
		
		
	
			try {
				int a = 10 ;
				System.out.println(a/0);
				
			} catch (NullPointerException e) {
				System.out.println("handle null pointer");
				e.printStackTrace();
			}
			
			catch (Exception e) {
				
				System.out.println("handle Arithmetic");
			
				
			    System.out.println("Execution success");
			
			
			
		}
	
	
	
		
	
	
	}
	
	
	
	
	
	
	
	
}

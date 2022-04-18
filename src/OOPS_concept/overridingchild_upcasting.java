package OOPS_concept;

public class overridingchild_upcasting extends overriding_parentclass{
			
		@Override
		public void bank(int a) {
		super.bank(a);
		} 
			
		 public static void main(String[] args) {
			
			 overridingchild_upcasting d=new overridingchild_upcasting();
			  
			 d.bank(6000);
			// up casting parent to child (accepted )
			 
			overriding_parentclass s=new overridingchild_upcasting(); 
			 s.bank(6500); 
			 
			//down casting child to parent (not accepted)
			 
			
			
			 
			 
		}
	
		 
	}
	
	
	


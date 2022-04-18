package Variables_concept;

public class variables {

	int a = 2000;
	
	public void add () {
		
		int a = 1000;
			System.out.println(a);
	}
	
	public void multi() {
		System.out.println(a);
	}
	
	public static void main(String[] args) {
		
		variables s = new variables ();
		
		s.add();
		s.multi();
	}
	
	
	
	
	
}

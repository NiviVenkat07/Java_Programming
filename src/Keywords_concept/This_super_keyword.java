package Keywords_concept;

public class This_super_keyword extends Static_keyword {

	int a =87;
	
	private void No () {
	
	System.out.println(this.a );
	
	System.out.println(super.a);

}
	public static void main(String[] args) {
		
		This_super_keyword S= new This_super_keyword ();
		
		S.No();
	}
	
	

}
package Interface_concept;

public class Son implements Dad ,Mom {

	@Override
	public void gift2() {
		System.out.println("bike 1");
		
	}

	@Override
	public void gift1() {
	 System.out.println("bike 2");
		
}

	public static void main(String[] args) {
		
		Son gift=new Son ();
		
		gift.gift1();
		gift.gift2();
		
		
	}
	
	
	
	
}


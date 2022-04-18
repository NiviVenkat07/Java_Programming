package String_concepts;

public class String_Buffer {

	public static void main(String[] args) {
		
	StringBuffer S = new StringBuffer ("Welcome");
	System.out.println(S);
    System.out.println(System.identityHashCode(S)); 
	
   StringBuffer S1 = new StringBuffer ("Welcome");
	System.out.println(S1);
	System.out.println(System.identityHashCode(S1));
	
	StringBuffer append =S.append(S1);
	System.out.println(append);
	System.out.println(System.identityHashCode(append));
	
	StringBuffer reverse =S.reverse();
	System.out.println(reverse);
	System.out.println(System.identityHashCode(reverse));
	
	}

}

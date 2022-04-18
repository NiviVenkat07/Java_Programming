package String_concepts;

public class String_types {
public static void main(String[] args) {
	
	//Im mutable
	
	String S = "Welcome";
	System.out.println(S);
	System.out.println(System.identityHashCode(S));
	
	String S1 = "Welcome";
	System.out.println(S1);
	System.out.println(System.identityHashCode(S1));
	
	
	S=S+S1;
	System.out.println(S);
	System.out.println(System.identityHashCode(S));
	
}
	
	
	
	
	
	
	
	
	
	
	
}

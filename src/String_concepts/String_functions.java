package String_concepts;

public class String_functions {

	public static void main(String[] args) {
		
      String a = "Welcome to java";		
	//length 
     int length = a.length();
		System.out.println(length);
	//equals
		String a1 = "Welcome to Java";
		boolean equals =a.equals(a1);
	      System.out.println(equals);
	//equals ignore case
	     boolean equalsignorecase = a.equalsIgnoreCase(a1);
	     System.out.println(equalsignorecase); 
	//startswith 
	    boolean startsWith = a.startsWith("Wel");
		System.out.println(startsWith);
	//endswith
		boolean endsWith=a.endsWith("ava");
		System.out.println(endsWith);
	//contains	
		boolean contains =a.contains("me to ja");
		System.out.println(contains);
	//indexof=1st of e
		int indexof =a.indexOf('e');
		System.out.println(indexof);
	//indexof= 2nd e;	
       int indexof2= a.indexOf('e',2);	
		System.out.println(indexof2);
		         //(OR)
	//lastindexof	=middle of the e 
		int lastindexof =a.lastIndexOf('e');
		System.out.println(lastindexof);
	//charAt=letter of 12 is printed
     	char charAt	=a.charAt(13);
	    System.out.println(charAt);	
	//replace	
	String a2 = "Welcome Chennai To Java";
	
       String replace=a2.replace("Chennai", "Python");    
	   System.out.println(replace);  
	   
	//Substring
	   String b = "Green Technologies Porur DLF opp";
	    String substring=  b.substring(18) ;
	    System.out.println(substring);
	    
	//isEmpty
	   boolean isempty= a.isEmpty();
	   System.out.println(isempty);
	   
	//split= e removed
	 String[] split  =b.split("e");
	  for (String string : split) {
		System.out.println(string);
	}
	  
	//trim=unwanted space removed like " Green Technologies Porur DLF opp " 
	String trim  = b.trim();
	 System.out.println(trim); 
	 
	 //Compare to
	 
	  String s = "apple";
	  String s1 ="pineapple"; 
	int compareto =s.compareTo(s1) ;
	  System.out.println(compareto); 
	
	  
	  //How to convert int to string
	  
	  int c = 524;
	String valueof = String.valueOf(c);
	 System.out.println(valueof);
	 
	 //How to convert String to  int 
	 
	 String S = "143";
	int parseint = Integer.parseInt(S);
	 System.out.println(parseint);
	 
 // concat = merging two	 
	String concat  =a.concat(b);
	System.out.println(concat); 
	 //(OR)
	a = a+b;  
	System.out.println(a);  
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	}
	
	
	
	
	
	
	
}

package List_concept;

import java.util.ArrayList;
import java.util.List;

public class Array_List {

	public static void main(String[] args) {

	List<Integer> L = new ArrayList<Integer>()	;
	
	// Add - to insert the value 
	
	L.add(20);
	L.add(53);
	L.add(78);
	L.add(92);
	L.add(64);
	L.add(36);
		
	System.out.println(L);	
		
	List<Object> L1 = new ArrayList <Object> ();
	L1.add(53);
	L1.add(20);
	L1.add(36);
	L1.add(3.2);
	L1.add(4.8);
	L1.add(0.1);
		
	System.out.println(L1);	
		
	// size = to get size of index
	
	 int l =L.size();	
	   System.out.println(l);
	 
	int S =L1.size();	
		System.out.println(S);
		
	//Get = to get the particular value by using index
		
	 Integer I =L.get(3);
	   System.out.println(I); 
	
	//Set =to set the particular value by using index
	   
	   Integer set =L.set(3,20);
	      System.out.println(L);
	      
    //Remove = to remove the value fro the list
	      
	     Integer r = L.remove(2);
	     System.out.println(L);
	
	 // indexof = to get the index value
	     
	   int indexof  =  L.indexOf(53);
	  System.out.println(indexof);
	  
	  //Contains = to check the content 
	   boolean  c =L.contains(36);
	   System.out.println(c);
	
	   //Clear= To clear the Particular value
	   
	      // L.clear();
	  //  System.out.println(L);
	     
	     // Addall = To add L1 values and L
	     
	    boolean addAll = L1.addAll(L);
	       System.out.println(L1);
	
	//RetainAll - to get the Common values
	   
	//boolean  retainall =L1.retainAll(L);
	//System.out.println(L1);
	
	//RemoveAll - to remove  the Common values
	
  boolean removeAll  = L1.removeAll(L);
	System.out.println(L1);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
		
	}
}
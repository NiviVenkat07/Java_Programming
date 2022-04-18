package Set_concept;

import java.util.HashSet;
import java.util.Set;

public class Hash_set {

	public static void main(String[] args) {
		
		Set <Integer> S = new HashSet <Integer>();
		
		//add= to add the values
		
		S.add(90);
		S.add(22);
		S.add(58);
		S.add(46);
		S.add(32);
		S.add(02);
		System.out.println(S);
		
		Set<Object> S1 = new HashSet <Object> ();		
		
		S1.add(3.0);
		S1.add(22);
		S1.add(2.8);
		S1.add(46);
		System.out.println(S1);
		
	//size = to get the size
		
		int i =S.size();
		System.out.println(i);
		
		int I =S1.size();
		System.out.println(I);
	 
	//get,set,remove,index of not allow
		
	//Contains= to check the Content
		
		boolean contains =S.contains(46);
		System.out.println(contains);
		
	//Clear= to clear the data
		
		//S.clear();
		//System.out.println(S);
		
	//Addall = to add the values S and S1	
		
		//boolean addall =S1.addAll(S);
		//System.out.println(S1);
		
		//Retainall= to get the common values
		
		//boolean retainall =S1.retainAll(S);
		//System.out.println(S1);
		
		//Removeall =to remove thecommon values
		boolean removeall =S1.removeAll(S);		
		 System.out.println(S1);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

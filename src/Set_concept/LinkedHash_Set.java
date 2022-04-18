package Set_concept;

import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHash_Set {

	public static void main(String[] args) {
		
		Set<Integer> s = new LinkedHashSet <Integer>();
		
		s.add(20);
		s.add(36);
		s.add(45);
		s.add(58);
		s.add(78);
		System.out.println(s);
		
		Set<Object> s1 = new LinkedHashSet <Object>();
		
		s1.add(36);
		s1.add(2.0);
		s1.add(52);
		s1.add(4.2);
		System.out.println(s1);
		
		//size = to get the size
		
		int size =s.size();
		System.out.println(size);
		
	//Get,set,indexof,remove	
		
		//Contains= to check the content 
		
		boolean contains =s.contains(20);
		System.out.println(contains);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

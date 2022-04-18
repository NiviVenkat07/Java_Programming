package Map_concept;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class map {
public static void main(String[] args) {
	
	
	Map<Integer,String> M = new HashMap <Integer,String>();
	
	//put = to set the values
	//M.put(key,value)
	
	M.put(1, "c++");
	M.put(2, "Java");
	M.put(3, "C#");
	M.put(4, "c");
	M.put(5, "PHP");
	M.put(6, "Python");
	M.put(7,"c#");
	System.out.println(M);
	
	//size = to get the size of the index in curley brases{}
	int size =M.size();
	System.out.println(size);
	
	//Get = to get the particular values
	String get =M.get(1);
	System.out.println(get);
	
	//keySet = to get the integer values
	
	Set<Integer> keyset=M.keySet();
	System.out.println(keyset);
	
	//Values = to get the string values
	
		Collection <String> c =M.values();
	   System.out.println(c);
	   
	//containsKey = to check the key (like 1,2 )values 
	   
	boolean  contain =M.containsKey(6);
	System.out.println(contain);
	
	// Containsvalue= to check the values (string)
	
	boolean values =M.containsValue("PHP");
	System.out.println(values);
	
	//EntrySet = set itterate after get the values in square brases[]
	
    Set<Entry<Integer,String>> Entryset  =M.entrySet();
	System.out.println(Entryset);
	
	//(change vertical font )
	
	for (Entry<Integer, String> entry : Entryset) {
		
	System.out.println(entry);
	
	}
	
	
	
	
	
	
	
	
	
	
}
	
	
	
	
	
	
	
	
	
	
	
	
}

package collectionpractice;

import java.util.HashMap;

public class MapDisc {

	public static void main(String[] args) 
	{
    //  MAP:   It is an Interface comes from java.util package in wich we have a provision
		       // To add value in terms of key And Value pairs 
		    //   value can be duplicate but key cannot duplicate see following example
		//classes implement are 1) HashMap 2) LinkedHashmap 3) TreeMap
		
		
		HashMap<Integer, String> hm = new HashMap<Integer, String>();
		
		
		     hm.put(12, "pune");
		     hm.put(43, "Borivali");
		     hm.put(13, " Solapur");
		     hm.put(14, "Chinchwad");
		     hm.put(20, "pune");
		     hm.put(14, "Wakad");
	      System.out.println(hm);
	      
	      
	   // Output: {20=pune, 43=Borivali, 12=pune, 13= Solapur, 14=Wakad }
	
	
	
	}

}

package collectionpractice;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class MethodsInsideHashMap {

	public static void main(String[] args)
	{
		HashMap<String, Character> hm =new HashMap<String, Character>();
		
		
		hm.put("abc",'a');
		hm.put("def",'d');
		hm.put("xyz",'x');
		hm.put("wxy",'w');
		
		
	  System.out.println(hm);     //{abc=a, def=d, xyz=x, wxy=w}
	       
	   Set<String> keys = hm.keySet();
	   System.out.println(keys);        //[abc, def, xyz, wxy]
		
	  
	   
	   Collection<Character> values = hm.values();
	     System.out.println(values);                   // [a, d, x, w]
	
	 
	     
	     boolean keyispresent = hm.containsKey("xyz");
	     System.out.println(keyispresent);                 //true
	 
	       
	       
	       
	       boolean valueispresent = hm.containsValue('a') ;
	     System.out.println(valueispresent);           // true
	     
	             
	     
	         Character returnkeyvalue = hm.get("def");
	            System.out.println(returnkeyvalue);     //d
	            
	
	            
	            // To iterate the Hashmap Class
	         
	  Set<Entry<String, Character>> keyvalue = hm.entrySet();
	          for( Entry<String, Character> kv:keyvalue)
	          {
	        	 String key = kv.getKey();
	        	  Character valuee = kv.getValue();
	        	 
				
			//	if( valuee =='w')     : if we want to particular key 
				
	        	  System.out.println(key);
				
	        	  System.out.println(valuee);   //output:  key and value return in Array form
	        	 
		        	                                          
	          }      
	            
	            
	            
	            
	            
	            
	            
	            
	            
	}

}

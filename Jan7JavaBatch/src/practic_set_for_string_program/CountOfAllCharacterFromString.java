package practic_set_for_string_program;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class CountOfAllCharacterFromString 
{

	
	public static void main(String[] args)
	{
       //  4. WAP to count the number of occurrence of characters in a String:

	
		String s = "abcdefabcdefaabb";
	
	
	HashMap<Character, Integer> hm =new HashMap<Character, Integer>();  // empty 
	 
	  for(int i=0; i<s.length(); i++)
	  {
	      char ch =s.charAt(i);
	    
	      if( hm.containsKey(ch))
	      {
	     
	    	  hm.put(ch,hm.get(ch)+1);      // if already present char then additionaly count 
	      }
	      else
	      {
	    	  hm.put(ch,1);    // add in Hashmap 
	      }
	    
	  }
	        System.out.println(hm);
	  

	  
//   finding those characters which repeats themselves atleast 3 times  
	  
	     Set<Entry<Character, Integer>> kv = hm.entrySet();
	 
	       for(Entry<Character, Integer> keyvalue:kv)
	      {
		        Character key = keyvalue.getKey();
		         Integer value = keyvalue.getValue();
		         if( value>=3)
		         {
		        	  System.out.println(key);
		         }
	   }
	  }

   }     // output:   {a=4, b=4, c=2, d=2, e=2, f=2}    // a   // b


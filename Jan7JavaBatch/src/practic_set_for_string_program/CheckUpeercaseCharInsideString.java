package practic_set_for_string_program;

import java.awt.RenderingHints.Key;
import java.io.ObjectInputStream.GetField;
import java.util.HashMap;

import javax.xml.crypto.dsig.keyinfo.KeyValue;

public class CheckUpeercaseCharInsideString
{
	
	

	public static void main(String[] args) 
	{
		
		String s ="chcigADSSGCUjhudhud";
		  
		String UpperString = s.replaceAll("[^A-Z]", "");
		 
	
	HashMap<Character, Integer> hm = new HashMap<Character, Integer>();
		
	          for(int i=0; i<UpperString.length(); i++)
		      {
			     char charvalue = UpperString.charAt(i); 
	        	  
	        	  if(hm.containsKey(charvalue))
			     {
			    	 hm.put(charvalue, hm.get(charvalue)+1);
			     }
	        	  else
	        	  {
	        		  hm.put(charvalue, 1);
	        	  }
	        	  
	        	  
		}
		 System.out.println(hm);
		
		
		
		
		
		
	}
	
	

}

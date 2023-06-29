package practic_set_for_string_program;


import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map.Entry;
import java.util.Set;



public class CountCharacterAndPrintFront {



	public static void main(String[] args)
	{

   // 7. WAP to remove the duplicate character from String and represent 
		//the character count next to it e.g. abcdefabcdef--- expected output a2b2c2d2e2f2

		String s = "asjchgjqdksdhsdkasassaa";
	
	   HashMap<Character, Integer> hm=new HashMap<Character, Integer>();
	   
	   
	   for(int i=0; i<s.length(); i++)
	   {
		   
		       char charvalue = s.charAt(i);
	   
		       if(hm.containsKey(charvalue))
		       {
		    	   hm.put(charvalue, hm.get(charvalue)+1);   //get method will return keyvalue (4,2 keyvalue)  like a  4   b= 2
		    	
		    	   
		       }
		       else
		       {
		    	   hm.put(charvalue, 1);
		    	   
		       }
		       
		      }
	
	             System.out.println(hm);   // {a=5, q=1, s=6, c=1, d=3, g=1, h=2, j=2, k=2}
	
	  
	       Set<Entry<Character, Integer>> kv =hm.entrySet();
	     
	      for( Entry<Character, Integer> e:kv)
	     {
	    	  
	    	   Character k = e.getKey();
	    	    Integer  v = e.getValue();
	    	  
	    	System.out.print(""+k+"="+v+"   ");// a=5   q=1   s=6   c=1   d=3   g=1   h=2   j=2   k=2
	      }
	              
     }
	

}

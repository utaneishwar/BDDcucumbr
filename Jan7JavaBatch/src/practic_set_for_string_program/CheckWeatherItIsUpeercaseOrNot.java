package practic_set_for_string_program;

import java.util.ArrayList;

public class CheckWeatherItIsUpeercaseOrNot 
{

	public static void main(String[] args) 
	{  
		
	//   remove Duplicate from string  
	        
		
		String s = "eAnfkeBEjjRODOKOD";
            
	         
	      ArrayList <Character>  al  = new ArrayList<Character>();
	        
	          for(int i=0; i<s.length(); i++)
	         {
	        	   char ch=s.charAt(i);
	              if(al.contains(ch))
	              {
	            	 
	              }
	              else
	              {
	            	  al.add(ch);
	              }
	        	  
	          }
	          
	          System.out.println(al);
	
	}

}

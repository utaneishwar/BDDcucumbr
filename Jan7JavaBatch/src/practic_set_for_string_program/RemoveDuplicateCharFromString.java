package practic_set_for_string_program;

public class RemoveDuplicateCharFromString 
{

	public static void main(String[] args) 
	{
		// duplicate char remove from string
		
		String s = "manmad";
	     char[] Arry = s.toCharArray();
		
	     
	     // System.out.println(Arry[1]);
		      
		      for(int i =0; i<=Arry.length; i++)
		      {
		    	    for(int j =i+1; j<Arry.length-1; j++)  
		    	    {
		    		       if(!(Arry[i]== Arry[j]))  //m==a
		    				 {
		    		       System.out.println(Arry[i]);
		    		         }
		    		     
		    	      }
		      }
		      
		
	}

}

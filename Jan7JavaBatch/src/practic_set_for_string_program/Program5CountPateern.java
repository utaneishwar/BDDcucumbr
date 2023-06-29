package practic_set_for_string_program;

public class Program5CountPateern 
{

	private static final Object[] String = null;

	public static void main(String[] args)
	{
		//5. WAP to count a pattern to be available in a given String
		
		
		String s ="abcdefabcdefabcdef";
		
   String[] sarray =new String[s.length()-2];     // create new array  
		
	  String pattern ="abc";
		
		int end =3;
		int count = 0;
		
		for(int start=0; end<=s.length(); start++)    // end position taken for last iteration 
		{
	      String s1 = s.substring(start, end);   // "abc" in s1
	      
	      sarray [start] = s1;	
	      
	      end++;                                  // iterate for end position also 
	      
		}
		
		
		for(int i=0; i<sarray.length; i++)
		
		{
	       if( sarray[i].equals(pattern))         // compare the pattern in string 
			 {
	    	   count =count+1; 
			 
			 } 
	    }
		System.out.println(pattern +" is repeating "+ count+" time");
		
		}
		
   // outpit: abc is repeating 3 time
	}



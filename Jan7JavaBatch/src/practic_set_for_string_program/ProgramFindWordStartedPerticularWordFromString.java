package practic_set_for_string_program;

public class ProgramFindWordStartedPerticularWordFromString {

	public static void main(String[] args)
	{
		
		String s ="this is there";
		
		
        String[] strarr = s.split(" ");
		
        
        
		for(int i=0; i<strarr.length; i++)
		{
			     String ispresentth = strarr[i];
	      boolean print = ispresentth.startsWith("th");
	     
	      if(print)   // if true then print 
	      {
	      
	      System.out.println(ispresentth);
	      }
		}
		 
		
	}

}

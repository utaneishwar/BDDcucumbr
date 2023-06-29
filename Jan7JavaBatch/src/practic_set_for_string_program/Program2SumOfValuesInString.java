package practic_set_for_string_program;

public class Program2SumOfValuesInString
{

	public static void main(String[] args)
	{
	  //  //2. Write a program to add the integers available in the string:
		
		
	   String s  = "23cxs3wxwd3wcsc23wwdwd55";
	    
	    boolean flag = false;
	 
	    
	       int sum = 0;
	    
	      String number="";


	      
	        for(int i=0; i<s.length(); i++)
         {
    	      char ch = s.charAt(i);
    	   
    	   
    	    if (Character.isDigit(ch))
    	        {
    	    	flag =true;
    	    	number=number+ch;
    	    	 
    	    	 if(i!=(s.length()-1))
    	    	 {
    	    		 continue;
    	    	 }
    	        }
    	    	
    	    	 if(flag)
    	    	 {
    	    		 int value = Integer.parseInt(number);
    	    		   sum = sum+ value;
    	    		      flag= false;
    	    		      number="";
    	    	 }
    	    	  }
	      
	      System.out.println(sum);   // 107
	      
       }
		
}



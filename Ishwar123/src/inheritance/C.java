package inheritance;

public class C extends A
{
        int c  =  10;
         String s2 = " Kishor Shalikrao Utane ";
	     static String s3 = " Aditya Kishor Utane  ";
	public static void m2 () 
	{
		
		System.out.println(s3);
	// 	System.out.println(super.s);  // get an error because wecan not acccess parent class (global variable )
		                                // in static area only allowed in nonstatic area.
		                                 
		
	}	

	  public static void main(String[] args)
	{
	
		 
		  
	}

}

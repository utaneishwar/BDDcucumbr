package variable;

public class LocalVariable 
{
   // we define here local variable 
	// here we understood local variable when which variable declared in escape class 
	//  level means declared in inside method ,block ,constructor that variable
	//   called as local variable
	
	
	  
	      static int i = 50;   // static variable 
	
	     int j = 70;           // non-static variable 
	                    // both are class level variable and default value is applicable for both
	
	
	
	    public static void main (String [] args )
	{
		int i = 10;
		char j = 'v';
		
		
		System.out.println(i);     // 10 local variable
		  
		System.out.println(j);     // v local variable 
		
		
	}
	
	     public static void m1() 
	{
		// the scope of local variable in inside the method ..  default value not appplicable 
		  // for local variable when we use it then we have do initialize it .
		
	int i = 35;          
	
    String s = "manav" ;
		
		System.out.println(i);     //35 local variable 
		System.out.println(s);     // manav local variable 
	}
	
	
	      public void m2 () 
	      {
	    	 int i = 40; 
	    	double d = 25.005;
	    	
	    	
	    	
	    	System.out.println(i);    //  40 local variable
	    	System.out.println(d);    //  25.005  local variable 
	    	  
	      }
	
	
}

package methods;

public class CallStaticmethod
{
	// 1.calling of static method into another static method
	
	public static void m1()        // static method
	{
		
	System.out.println("m1 method is executing");	
	 
	}
	
	
	
	
	public static void m2()         // static method
	
	{
		CallStaticmethod.m1();    //// m1 method is executing
		
		System.out.println("m2 method is executing");	
	}
	
	
	 public static void main(String[] args)   // main method
     {
	                // here called m2 method by using directly method name because of 
	                     // this is static method inside a class.
	         m2();      // output - m1 method is executing
	                            //  m2 method is executing
	                    
	            
	         
	            
	            
     }
	
	
      
	
	
	
	
	
	
	
	
	
	
}

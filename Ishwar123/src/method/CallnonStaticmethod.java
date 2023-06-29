package method;

public class CallnonStaticmethod
{
	   // 3. Calling of NOn-static method inside Staticmethod
	  
     public void m1()          // nonstatic method 
     {
    	System.out.println(" m1 is non-static method "); 
    	 
    	 
     }
	public static void m2()       // static method 
	{
		CallnonStaticmethod  t = new CallnonStaticmethod ();
		t.m1 ();
		
	  System.out.println(" m2 is static method ");	
		
		
	}
	
	public static void main (String[] args)    // main method 
	{
		
		m2();    
		
		
		 // calling nonstatic method in main class inside method
		    // ( only understatnding, not recomended)
		
		CallnonStaticmethod  t = new CallnonStaticmethod ();
		
		System.out.println(" ");
		t.m1();
		
	}
}

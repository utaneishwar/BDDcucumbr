package method;

public class CallnonStaticmethod1
{
	// 4.Call Nonstatic method inside  another  nonstatic method 
	//       and different class method 
	
	

	public void m1 ()            // nonstatic method
	{
	int i = 10;
	
	
	System.out.println("  m1 is non static method "+ i);
     
		
		
		
	}
	
	public void m2()                // nonstatic method
	{
	
	   m1();          // here is not create object while calling to m1 
		System.out.println(" m2 method is also nonstatic method ");
      }
	
	
	
         public static void main (String []args)   // main method
	
    {
        	 CallnonStaticmethod1  t = new CallnonStaticmethod1();
	  
	       t . m1();  // calling nonstaticmethod inside another  nonstatic method 
	                    // like m1 and m2
	       
	       System.out.println("  ");   // use  for gap shows result
	       
	       // calling from different class ( like CallnonStaticmethod )
	       
	       
	       CallnonStaticmethod t1 = new CallnonStaticmethod();
	    		   
	       t1.m1 ();                //calling nonstatic  method in callnonStaticmethod class
	       System.out.println(" ");
	       CallnonStaticmethod.m2();    // calling static method in callnonStaticmethod 
	       System.out.println("  ");
	       t.m2();
	       
     }
	
}

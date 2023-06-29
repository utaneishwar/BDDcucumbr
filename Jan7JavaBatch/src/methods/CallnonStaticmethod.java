package methods;

public class CallnonStaticmethod 
{
	// 3.  Calling of Non-static method inside static method
	
	
	public void m1()                           // Nonstaticmethod
	
	{
		System.out.println("m1 is executing");
		
	}
	
	
	public static void m2()                  // static metyhod
	{
		CallnonStaticmethod cons = new CallnonStaticmethod ();
		cons .m1();
		
    }
	
	
	    public static void main(String[] args)    // main method
	    {
	    	
	    	
			m2();   

		}
	
	
	

}

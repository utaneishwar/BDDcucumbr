package methods;

public class CallNonstaticmethod1
{
	// 4.Calling of non-staticmethod another Nonstaticmethod.
	// calling inside class and different class
	
	
	
	public  void m1() 
	{
		
		System.out.println("m1 method is executing" );
	}
	
	
	public void m2()
	{
	             m1();                // no object create here 
		
		System.out.println("m2 method is executing");
		
		
	}
	
	
	
	public static void main(String[] args) 
	{
		CallNonstaticmethod1 a = new CallNonstaticmethod1();
		
		a.m2();   // calling inside class
		
		// calling another class (CallNonstatic class)
		
		CallnonStaticmethod i = new CallnonStaticmethod();
		
                       i.m1();    // m1 is executing
                                  // here calling another class
                       
                       
	}                       

}

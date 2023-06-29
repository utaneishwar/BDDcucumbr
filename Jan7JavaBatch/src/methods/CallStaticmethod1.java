package methods;

public class CallStaticmethod1 
{
   //2. Calling of static method inside non-staticmethod
	
	
	
	
	public static void m1()         // static method
	{
		System.out.println("m1 method is executing");
		
    }
	
	
	
	
	public void m2()               // non static method
	{
		
	m1();
		
		}
	
	
	
	public static void main(String[] args)   // main method
	{
		
		CallStaticmethod1 t = new CallStaticmethod1 ();
		t.m2();
		
		}

}

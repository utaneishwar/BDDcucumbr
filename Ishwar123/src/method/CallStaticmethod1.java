package method;

public class CallStaticmethod1 
{
   // 2. calling of Staticmethod inside Nonstaticmethod
	
	public static void  m1()      // static method
	{
	
		System.out.println("m1 method is static");
		
		CallStaticmethod1 t = new CallStaticmethod1 ();
		t.m2 ();          // call non static method m2
	}
	public  void m2()           // nonstatic method 
	
	{
		
		 
		System.out.println("m2 is Non-static method");
		
		
	}
	
	public  static void main (String[] args)   // main method
	
	{
		CallStaticmethod1 t = new CallStaticmethod1 ();
		t.m2();
	System.out.println(" ");
		m1();
		
    }
	
	
	
     }

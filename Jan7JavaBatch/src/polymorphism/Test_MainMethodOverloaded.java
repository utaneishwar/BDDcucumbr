package polymorphism;

public class Test_MainMethodOverloaded extends Test
{  
	// This are the also overloaded
	
	
	public void m1(boolean b)
	{
	System.out.println(" Ganesh is my best freind ");	
		
	}

	public static void main(String[] args)
	{
		Test_MainMethodOverloaded t = new  Test_MainMethodOverloaded ();
	          t.m1(false);   //  this method from inside class 
		       t.m1();       // this method from test class (another class)
                 main();    //  this method from main method 
	}
	
	
	public static void main ()
	{
	 System.out.println(" main method with no argument");	
	}

}

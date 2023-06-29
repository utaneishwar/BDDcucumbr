package exceptionhandling;

public class ExampleOfError
{
	// ERROR : 1) STACKOVERFLOW ERROR   2)INTERUPTED ERROR
  public static void m1() 
  {
	m2();  
	
	System.out.println(" m1 method ");
  }
	
  public static  void m2() 
  {
	m1 (); 
	System.out.println(" m2 method ");
  }
	
	
  public static void main(String[] args) 
	{
	m1();                  // it will get Stackoverflowerror	
	m2();
	
	}

}

package method;

public class CallStaticmethod 
{
	// 1.   calling of static method inside another static method 
	
	
	
	public static void m1()    // static method 
	{
	System.out.println(" m1 method is static ");	
		
	m2();          // call m2 mthod in this method m1 
	
	}
	
	
	
	public static void m2()    // static method 
	{
	                   
	System.out.println(" m2 method is static method ");	
		
	}
	
	
	public static void main (String[] args )   // main method 
	{
		
		m1();         // o/p - m1 method is static 
		              // o/p - m2 method is static method 
		System.out.println(" ");   // for gap 
		
		m2();          // o/p - m2 method is static method 
		
		
     }
 
	
}
package constructor;

public class CallingMultipleconstructor
{
	// we can create multiple constructor inside a class and called to constructor
	// with in different argument .
	
	
	
	public CallingMultipleconstructor()         // no argument here 
	{
		System.out.println(" zero argument constructor ");
	}
	
	
	
	
	public CallingMultipleconstructor(int a )      // with argument 
	{
		System.out.println(" one argument constructor ");
	}
	
	
	public CallingMultipleconstructor(String s, int b)   // with double argument
	{
		System.out.println("two  argument constructor ");
	}
	
	
	
	

	public static void main(String[] args)
	{
	 // when we call to constructor without argument then  // take parenthesis blank
		CallingMultipleconstructor t = new  CallingMultipleconstructor() ;

		// when we call to constructor with argument then
		
		CallingMultipleconstructor t1 = new  CallingMultipleconstructor(5) ;
		  
		
	}

}

package constructor;

public class CallingOfOneIntoAnother
{
	public 	CallingOfOneIntoAnother()               // no 1 constructor 
	{
		this(56.23,true);	               // here called to constructor no 3 // two argument 
	System.out.println(" zero argument constructor ");	
	
	}
	
		
	public 	CallingOfOneIntoAnother(String s )       // no 2 constructor 
	{
		
		System.out.println(" one argument constructor ");		
	}
	
	
	public 	CallingOfOneIntoAnother( double d ,boolean f)   // no 3 constructor 
	{
	
		System.out.println(" two argument constructor ");	
		
	}
	public static void main(String[] args)
	{
			
		CallingOfOneIntoAnother a = new  CallingOfOneIntoAnother();  // here called to constructor no 1
		                                                          //  that is zero argument 
	}

}

package exceptionhandling;

public class TryCatchFinally1 
{
 
	
	
	
	
	public static void main(String[] args)
	{
		
	try 
	{
		int a [ ]= { 1,2};
		System.out.println(a[0]);
	}	
		
		catch (ArrayIndexOutOfBoundsException e ) 
		{
		 String Message = e.getMessage();
		 
		 System.out.println(Message );    // catch block not run 
		}
		
		finally 
		{
       // finally block run if exception comes or not both condition it will be run 
       
			System.out.println(" This is a finally block ");
	   }

	}
}

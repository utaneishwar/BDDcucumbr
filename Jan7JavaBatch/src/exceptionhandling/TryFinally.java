package exceptionhandling;

public class TryFinally {

	public static void main(String[] args) 
	{
		// Exception Handling only with try and finally
		
		try 
		{
		int a = 10/0;
		}
		
		finally
         {
		System.out.println(" finally block ");
		
		// note ; java get first output and thet it will get Exception 
		// finally block 
		//Exception in thread "main" java.lang.ArithmeticException: / by zero
		// at exceptionhandling.TryFinally.main(TryFinally.java:11)

         }

	}

}

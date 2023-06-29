package exceptionhandling.copy;

public class Test1 {

	public static void main(String[] args)
	{
		// TRY CATCH  EXCEPTION HANDLING 
		// when exception come 
		// that is the reason is java is rouboust langauge 
		
		int a = 10;
		int b = 0;
		
		int c;
		try {
			c = a/b;
		}
		catch (ArithmeticException e)
		{
			System.out.println(" This is a Catch block ");
			c =2;
		}
		
		System.out.println(c);
		

	}

}

package exceptionhandling;

public class ThrowsKeyword 
{

	public static void main(String[] args)throws ArithmeticException
	
	{
		int a=10;
		int b = a /0;
		System.out.println(" after the Exception ");
// not it cannot handle exception by Throws keyword 
	}

}

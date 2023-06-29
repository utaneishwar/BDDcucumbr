package exceptionhandling.copy;

public class GetmessegeFromExecption {
	
	public static void main(String[] args)
{  
    try {
			
     int a = 10;
     int b = 0;      // divided by zero is ArithmeticException handling
     int c = a/b;   
		
	}
	catch (ArithmeticException e)	
	{
		String Message = e.getMessage();  // we hyave to get message due to this 
		                                  // simillar koind of message will get at the time of exception
		System.out.println(Message);      // will get / " by zero " message
	}
	
		

	}

}

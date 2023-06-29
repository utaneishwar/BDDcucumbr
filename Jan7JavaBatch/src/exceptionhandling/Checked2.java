package exceptionhandling;

public class Checked2 {

	public static void main(String[] args) 
	{
	// INTERUPTED EXCEPTION : another type of IOException which comes under checked category
		// check category means - when compiler tell handle the exception at the time of compile.

		System.out.println(" first line ");
		try {
		Thread.sleep(2000);  // for delay between code using this method  
		}
		
		catch (InterruptedException e)
		{
			System.out.println(" Exception Arrived ");
		}
		System.out.println(" Second line ");   // it will executed after 2 sec .
	}

}

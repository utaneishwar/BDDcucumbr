package exceptionhandling.copy;

public class ThrowKeyword {

	public static void main(String[] args) 
	{//THROW KEYWORD EXCEPTION 
		// WHENEVER WE HAVE TO DELIBERATE EXCEPTION inside a program that time we can apply this exception
		
		boolean c = false;     // if it is true execute if otherwise else will be executed
		
		if (c)
		{
			throw new NullPointerException(" something went wrong please try again letter ");
		}
		else 
		{
			throw new ArrayIndexOutOfBoundsException ();
		}
		
	}

}

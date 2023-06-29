package exceptionhandling.copy;

public class TryCatchCombination {

	public static void main(String[] args)
	{
		// Try Catch Combination
		
		// we can have one try and multiple CATCH combination 
		// But we cannot have Multiple TRY and One or multiple Catch combination
		
		int a[]= {1,2,3,4,5};
		
		try {
			a[5]= 60;
	    // int a1 =10/20;   we can handle it by using multiple catch 
		}
		
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println(" Exception arrived in try it");
		}
		
		catch(ArithmeticException e)
		{
			
		}
		System.out.println(a[0]);
		
		
		
		
		

	

}}

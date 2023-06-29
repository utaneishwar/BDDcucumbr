package exceptionhandling;

public class TryCatchFinally
  // b. Another way to we can handle Exception
     // TRY-CATCH-FINALLY
{
	static TryCatchFinally tc;
	
	public void m1()
	{
	System.out.println(" method m1 ");	
	}
	
	public void m2()
	{
		tc.m1();
	}

	public static void main(String[] args)
	
	{
		tc.m1();  // it  will get exception 
		
	
	}

}

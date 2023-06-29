package abstractmodifier;

public class Test2 extends TestClass
{
	
	public void SendmoneyfromAccountToWallet()
	{
	System.out.println(" this is logic for sendmoney from account to wallet ");
		
	}


	public void ReceivemoneyfromAccountToWallet()
	{
		System.out.println(" this is logic for Receivemoney from account to wallet ");
		
	}
	
	public static void main(String[] args)
	{
		//TestClass t1 = new TestClass t1 (); //we can not call on this basis because it declare ABSTRACT 
		
		Test2 t2 = new Test2 ();
		
		t2.SendmoneyfromAccount();
		t2.ReceivemoneyfromAccount();
		t2.SendmoneyfromAccountToWallet();
		 t2.ReceivemoneyfromAccountToWallet();
		
	// we can execute all the method inside a child class on the basis of child class object
	// remember think - we can not call on the basis on parentclass object because uit declare the Abstract class 	 
		 
	}
	

}

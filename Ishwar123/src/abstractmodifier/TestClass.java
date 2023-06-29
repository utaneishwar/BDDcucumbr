package abstractmodifier;

public abstract  class TestClass
{
	// In this class discuscussed about " ABSTRACT"
	// abstract means: we have known  some method and some method unknown.
	// ABSTRACT : it is also called as keyword and accessmodifier
	// because it comes with other accessmodifier 
	// when we declare to method as a 'ABSTRACT" that time we have compulsory to declare class as a"ABSTRACT" 
// but suppose abstract method is no there that time we can declare abstract  class .. 

	// we can not create class after declaring class "ABSTRACT" 
	
	public void SendmoneyfromAccount() 
	{
	System.out.println(" logic for send money from Account ");	
	}
	
	
	public void ReceivemoneyfromAccount() 
	{
	System.out.println(" logic for Receive money from Account ");	
	}
	
	
	public abstract void   SendmoneyfromAccountToWallet();     // Abstract method
	
	
	
	public abstract void   ReceivemoneyfromAccountToWallet();   // Abstract method 
	
	public static void main(String[] args)
	{
	//	TestClass s = new TestClass	();
		
	   //  we can not create  object when declare class "ABSTRACT" 	 
		

	}

}

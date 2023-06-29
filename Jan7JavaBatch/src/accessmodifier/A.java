package accessmodifier;

public class A
{
    // PROTECTED
	// this class is used to protected access modifier
	// method and variable
	// when we access method or variable inside a package then it act as default.
// and when we acccess it another package then we must have to call this.
//with the help of child class ref variable after creating object if it is nonstatic 
	
	protected int x = 80;
	protected static int y = 100;
	
	
	protected void M9() 
	{
		System.out.println(" protected M9 method from class a");
	}
	
	
	public static void main(String[] args)
	{


	}

}

package constructor;

public class Multipleconstructor
{
	 //   Constructor
	//  we can create multiple constructor in inside a class
	
	
	
	
	
	public Multipleconstructor()
	{
		System.out.println(" zero argument constructor");
	}
	
	public Multipleconstructor(int a)
	{
		System.out.println(" one  argument constructor");
	}
	
	public Multipleconstructor(int a, int b )
	{
		System.out.println(" two  argument constructor");
	}
	
	
	public static void main(String[] args)
	{
		// compalsory we have to create object when we call to constructor 
		
		Multipleconstructor m = new Multipleconstructor();
		Multipleconstructor m1 = new Multipleconstructor(10);
		Multipleconstructor m2 = new Multipleconstructor(10,20);  // when we called to multiple constructor then
		                                       //we have to give different argument 
		
		
		
	}
	
}

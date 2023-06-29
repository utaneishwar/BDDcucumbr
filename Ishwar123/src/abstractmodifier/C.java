package abstractmodifier;

public abstract class C 
{
// concept of static Abstract keyword
// we can execute and static method can allow inside a abstract class.	
	
	public static void M1()                    // static_abstract not allowed here 
	{
	System.out.println(" static method inside a abstract class ");	
		
    }
	
	
	
	public static void M2() 
	{
	System.out.println(" my name is Ishwar ");	
	}
	
	public static void main(String[] args) 
	{
	 
		M2();
		M1();
		
		
		

	}

}

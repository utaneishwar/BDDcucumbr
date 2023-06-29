package abstractmodifier;

public abstract class C 
{
	//ABSTRACT CONCEPT WITH STATIC METHOD 
	
	
	//public abstract static void m1()
	// we can not write together static and abstract because static  method cannot override
	// but remember we can execute complete static method inside a class
	public  static void m1()
	{
	System.out.println(" static method from C class ");	
	}
	
	
	

	public static void main(String[] args)
	{
	 m1();  //static method from C class
	 
	 
	// NOTE: we can execute static concrete method inside a abstract class
	}

}

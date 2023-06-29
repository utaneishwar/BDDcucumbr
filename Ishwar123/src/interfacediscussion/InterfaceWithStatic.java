package interfacediscussion;

public interface InterfaceWithStatic 
{
   //Static method inside interface is valid but it must have complete body or concrete method 
	
	public static void M1() 
	{
		System.out.println(" m1 static method");
	}
	
	
	public static void main(String[] args)
	{
		M1();     
		InterfaceWithStatic.M1();
		// we can execute by the above 
	}
	
	
	
}

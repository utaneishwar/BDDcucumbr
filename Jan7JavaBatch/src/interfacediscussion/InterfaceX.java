package interfacediscussion;

public interface InterfaceX 
{
    // we can Call Override Method Inside Childclass  
	
	
	public void m4(String B);
	
	
	
	default void m1(String i)                   //This method only allowed in Interface and 
	{                                              // introduced in version 1.8   and also private Method introduce in 1.9 version
		System.out.println(" Good Morning "+i);
	}
	
	
	
}

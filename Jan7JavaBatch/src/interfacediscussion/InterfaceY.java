package interfacediscussion;

public interface InterfaceY
{
	
	
	public void m4(String B);
	
	
   default void m1(String i)
   {
	 System.out.println(" Good night "+i);  
   }
}

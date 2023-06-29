package interfacediscussion;

public interface InterfaceWithVariable
{  //every variable inside an interface by default it will be public,static,final
	// it can be by default final we cannot Reassign value 
	int i = 90;
	String s = " pune ";
	
	public static void main(String[] args) 
	{
		System.out.println(i);   //pune
	}

	
	
}

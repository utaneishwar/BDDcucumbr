package abstractmodifier;

public abstract class Acons 
{// concept of constructor 
	// when we create object that time constructor call to parentconstructor automatically
	

	public  Acons() 
	{
		System.out.println(" constructor from acons class ");
	}

	public static void main(String[] args) 
	{
		// Acons d = new Acons();  on the basis of this type of object cannotcall  constructor because its abstract class
    
	}

}

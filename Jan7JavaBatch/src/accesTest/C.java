package accesTest;

public class C extends B
{

	public static void main(String[] args)
	{
	//B.b = new B();  on that basis we cannot called protected nonstatic method 
	C c =new C();
	c.M9();
	// VARIABLE ACCESSMODIFIER CALLED
	
	//System.out.println(b.a); /// it is not possible because its parent class ref variable and rule is  only calling with the help of child class ref variable 
     
	System.out.println(c.x);  // it is possible because child class ref  
	
	
	
	System.out.println(c.y);  // it can be acccessible because calling from call inside a class with the help of child class ref variable (like C class and ref variable is c) after creation of object 
	System.out.println(y);    // its static protected

	}

}

package variable;

public class B
{
	// here we discussed in this class about Nonstatic variable.
	// syntax of Non_static variable is 
	//  syntax :- datatype variablename = value
	
	String s = "abc";
	double d = 56.23;
	
	
	

	public static void main(String[] args) 
	{
		// create object
		// syntax :- class_name ref_variablename = new classname.
		
		B b = new B();// it is object
		
		// call to Nonstatic variable 
		// using syntax :- ref_variablename.nonstatic variable();
		
		System.out.println(b.s);// here done  calling inside a class.
		
	System.out.println(b.d);	

	}

}

package variable;

public class B 
{
// here calling non static variable 
	// syntax :- data_type variable_name = value;
	
	String s = "abc";
	double d = 56.23;
	
	
	
	
	public static void main(String[] args)
	{
		// create object using nonstatic variable syntax(we can create multiple object for calling)
		//syntax is classname ref_variablename = new classname();
		
		
		B  b = new B();
		
		System.out.println(b.s);// abc
		System.out.println(b.d);//56.23
		
//----------------------------------------------------------------------------------		
		
	}
	
	
}

package variable;

public class VariableTest 
{
	

	public static void main(String[] args) {
		// here calling from variabletest to class name A  (static calling)
		// like below
		
	System.out.println(A.a);
    System.out.println(A.bol);
    System.out.println(A.s); 
    
    // calling from (classname A )
    
//------------------------------------------------------------------------------
	
	
	
	// here calling from this class (Nonstatic class)
	// create object and then call to Nonstatic_variable (another class)
    
    
	     B b = new B();
	     System.out.println(b.s);//output abc
	     System.out.println(b.d);//output 56.23
	     
	    // calling from (classname B)
	}		

		
	
	
	
	
	

}

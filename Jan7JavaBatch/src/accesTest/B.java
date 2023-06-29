package accesTest;

import accessmodifier.A;

public class B extends A
    {
    	
 
	
	
	
	public static void main(String[] args)
	{
	    A a = new A();  // not possible whenever we call 
	    B b = new B();  // in protected method accessmodifier whenever we call 
	      b.M9();	  // to outside of the package then we should call on the basis of child class referance variable .
	                  // otherwise it will give error 
	// CALLING VARIABLE
	 // already creating object    
  // System .out .println(a.a); // not possible protected non-static variable
  // syso .out .println(a.a); // not possible protected static variable 
	      
	  System.out.println(b.x);         // possible because calling with the help of child class(B)  
	                                  // help of ref variable from parent class A protected variable 
	  System.out.println(B.y);    // it is protected static variable no nedd ref variable but with the 
	                               //help of child class name only we can acccess variable here other wise get error
	
	
	                           
	  
	}

}

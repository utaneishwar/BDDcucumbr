package casting;

public class Child extends Parent
	{
	public void bike()
	{
		System.out.println(" Parent  class bike method ");
	}
	
	
	public void marry()
	{
		System.out.println(" child class marry  method ");
	}
	
	
	public static void main(String[] args)
	{
		Child c = new Child();
		// concept of Upcasting 
		Parent p1 = (Parent)c;   //  Upcasting
		
	    p1.home();        //  parent class home method 
	    p1.car();        // parent class car method
	   
	    
	     p1.marry();      // marry method from child class because its overridden 
	     
	// ---------------------------	
	     
	     Parent p2 = new Parent();
	     
//	       Child c2 =(Child)p2;   // it is not valid we cannot convert parent class into child class
//	      
//	  //       c2.home();        // it will give ClassCastException because
//	                            // ParentClass cannot allow Child class property .
     //      
	  //--------------------------   
//  Down casting cannot convert directly so concept will be
	  //|| Child-Parent-Child ||
	
	      Child c3 = (Child)p1;   // p1 is a ref variablename from child class object 
	      c3.bike ();           // Parent class bike method 
	      c3.home();            // Parent class Home method 
	      
	         
	}

}

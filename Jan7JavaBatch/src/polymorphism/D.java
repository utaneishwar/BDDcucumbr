package polymorphism;

public class D extends C
{
  // we discussed in this class calling overridding method  by creating another type of object 

	
	
	public void m1()   // look at green triangle indicates overriden
 {
	 System.out.println(" nonstatic overridden m1 method from child  class D as student ");
 }	
	
	
	public static void main(String[] args)
	{
		C c = new C();             // object from parent class as a Teacher 
		  c.m1();      // C class method 
		  
		  
		  
		D d = new D ();             // object from child class  as a Student 
		  d.m1();        // D class method 
		  
		  
		
		C c1= new D ();              // it is possible and  execute the child class overridden method ( d class)
		  c1.m1();      // D class method 
		  
		  
		  
 //		D d1 = new C();      // not possible we can not call this type ( teacher work can not student normally )                       
		
//        d1.m1();        // we can not call because of creating after "=" new C(); is a parent class object thats the reason 

	}

}

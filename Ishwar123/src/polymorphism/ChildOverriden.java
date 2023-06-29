package polymorphism;

public class ChildOverriden extends ParentOverriden
  {
	public void bike() 
	{
	System.out.println(" bike method from childoverriden method ");	
	}

	// OVERRIDING CONCEPT
	 public void  Marry  ()
     {
     	
     System.out.println("  Marry Overriding Method from child class");	
     }  
        
	
	

	public static void main(String[] args) 
	{
		ChildOverriden t = new ChildOverriden();
		t.home();
		t.furniture();
		t.car();         // all three are parent class property
		t.car();   // child class property 
//=======================================================================
	//OVERRIDING CONCEPT 
	
		t.Marry();   // it becomes child class it is overriden 
		
//NOTE-whenever inside  parent and child class method name and arg will be same and 
// that time we called method are overriding 
//but remember one think method are overriding,and we can to execute this  on the basis of 
// object if it is child or parent--if will be child then execute inside a child class overriding method 
		                          // if it will be crate parent class object inside child class then execute parentclass overriding method 
		ParentOverriden t1= new ParentOverriden ();	
		t1.Marry();      // it becomes from parent class 
		                   // but it is overriden
		
		
		
		
	}

}

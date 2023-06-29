package inheritance;

public class Child extends Parent  // here extends keyword use 
                                  // meaning of above is give  data to child which is stored in Parent class
{                                // if we extend keyword remove then we will get error
	public void bike() 
	{
	System.out.println(" bike method from child method ");	
	}

	public static void main(String[] args)
	{
	// use of inheritence  // here without creating object of that particular class 
		                    //we can called another class by using inside class object 
		
	Child c = new Child();
	      c.home();
	      c.car();
	      c.surname();
	      
     c.bike();    // 

	}
	}

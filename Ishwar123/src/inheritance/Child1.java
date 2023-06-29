package inheritance;

public class Child1 extends Parent
{
  public void  Bike () 
  {
	 System.out.println(" bike mmethod from child1 table "); 
  }
	
	
	
	public static void main(String[] args)
	{
		Child1 c = new Child1();  //we created child class object and on the basis
		                             //we can call parent-class and grand-parent class methods 
		c.Home();
        c.Farm();          // it is in grandparent class and we can access because grandparent extends to parent class
   //     c.M2();         // it is in child2 class  so we can not access
                           // inside class through inheritance
        c.Bike();           // child class
        
        
	}

}

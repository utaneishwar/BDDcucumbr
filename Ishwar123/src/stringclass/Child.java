package stringclass;

public class Child extends Parent
{
	public void v()
	{
		System.out.println(" v method");
	}
	public void m()
	{
		System.out.println(" m method in child");
	}
	
	public static void main(String[] args) 
	{
	    Child c = new Child ();
	      Parent p = (Parent)c;   // upcasting  convert child-parent 
	     p.m1();  // from parent
	     p.m2();   // from parent but inside in child 
	     p.m();      // comes from child because its overriden 

//	     
//	     Parent p1 = new Parent();
//	     Child c1= (Child)p1;
//	     c1.v();            // it will be give class cast exception when to call any method 
//	                       // we cannot convert the down casting directly 
//	                       // flow of down casting will be child-parent-child
//	     
	     
	     Parent p1 = new Parent(); 
	     Child  c2= (Child)p;
	     
	     c2.m1();    // we can  recall again  parent class method 
	       
	     c2.m2();       

	     
	     
	     
	     
	}

}

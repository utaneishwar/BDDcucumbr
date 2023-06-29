package abstractmodifier;

public class Bcons extends Acons
{   // CONCEPT OF CONSTRUCTOR 
  // CALLING INSIDE CHILD  CLASS FROM PARENT ABSTRACTOR CLASS  
	
	//NOTE:
	//    1)  & 3)
	//   public abstract final class A   //  3rd example
	// public final abstract class A 
//	//  {
//	      public void m1()
//	      {
//	      }  
//	      }
//	          INVALID : we cannot write final and abstract together 
	       // because final not allow to child class and abstraction required child class for execution 
	
//   2)     
	// public  abstract class A 
//		//  {
//		      public final void m1()
//		      {
//		      }  
//		      }
//		          VALID : we can execute final method with in child class but must body must be completed. 
//--------------------------------------------------------------------------------		         
	
	   public static void main(String[] args)
	{
	// Acons a = new Acons ();  we cannot create because its abstract class object 
	
		Bcons b = new Bcons ();  // constructor from Acons class 
		                         // because constructor can call by default parent class 
		
	}

}

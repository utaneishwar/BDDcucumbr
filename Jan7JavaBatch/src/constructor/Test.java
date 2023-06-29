package constructor;

public class Test
{    
	// CONSTRUCTOR
	
	  // syntax ;
	  //         access_modifier classname()
	//            {
	//            action to be executed
	///           } 
	
	   public Test()           // this is constructor name 
	   {
		   System.out.println(" hello I am constructor "); 
	   }
	   
	   
	   
	// note ; we can create multiple  constructor inside a class on the basis of argument 
	//      like public Test(),    public  Test (int i=1)
	   
	   
	   
	   
	     public static void main(String[] args) 
	   {   
           
		  Test t=new Test();             // by using this object we called constructor in main method
		   
		// when we create multiple time object then will come constructor multiple time
		}

}

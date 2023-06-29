package inheritance;

public class Child2 extends Parent 
{
	//we can have the inheritance only in one direction like child to parent 
	//     not possible in direction like parent to child
	// A parent  class can have multiple child classes but it apposite part not possible 
        
         public static void main(String[] args)
         {
        	 Child2 c2 = new Child2();
        	 c2.home();
        	 c2.furniture();
        	 c2.car();
        	 c2.surname();
        	 
        	 c2.Farm();  // this execution done from grandparent class;
        	 
     //   OUTPUT
      //    home method from parent table
      //  	 furniture  method from parent table
       // 	 car method from parent table
        //	 surname   method from parent table

        	 //farm method from Grandparent class
        	 //
        	 //
        	 //
          }
        
        
        
}

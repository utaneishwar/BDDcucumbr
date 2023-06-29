package accessmodifier;

public class FinalWithVariable
{
	// It is (final) Apllicable for class,method and variable 
		// To variable we can not reinitialize  due to final
		// To method we can not overrided due to final 
		// To class we can not create child class due to final
		
	final int i = 10;          // we can not initialize it but scope of the variable is within package because it is default
  
	public static final  boolean  b = true;
	  final static int z = 10;    // we can use but not reinitialize.

	   public static void main(String[] args)
	    {
		FinalWithVariable s = new FinalWithVariable ();
		
          System.out.println(s.i);  // 10
 
         System.out.println(b);    // true 
 
      
         //     s. i = 20;   we can not reinitialize it because it would be final.
           //      b =  true;
            //        b=false;    // we can not reinitialize
 
		

	}

}

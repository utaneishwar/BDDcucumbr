package categoriesmethod;

public class NoReturnWithArgs
{

	// 2. Method  noreturn type with Argument  
	// nonreturn means (void is available in  method syntax)
	// argument taken only ....();...
	// here i used m1 to m4 method for practice otherwise we can find out in
	//  only inside the one method
	
	
	public static void m1(int i ,int j)         // static method 
	{
	
		int k = i+j;
		System.out.println("the addition of A = "+k);  
     }
	
	
	
	 public void m2(int i, int j )              // nonstatic method
	 {
	  	 int k = i-j;
	  	 System.out.println("the substraction of S ="+k);
		 
		 
	 }
	 public static void  m3 (int i,int j) 
	 {
		int  k = i*j;
		
		System.out.println(" the multiplication of M = "+ k);
	 }
	 public static void m4 ( double i,double j )
	 {
		double k = i/j;
		System.out.println(" the division of D= "+k); 
		 
	 }
	 
	 public static void main(String[] args)
	 {
		
		 m1(5,2);
		 m1( 5,5);      //here  we can call using classname.methodname because static method
	                  // note - assign any value and can take output within inside method
		 
		 System.out.println(" ");    // use space for arranging answer in systematic.
		 
		 NoReturnWithArgs i = new NoReturnWithArgs ();  // create object because of calling 
		                                              // nonstatic method 
		 
	       i.m2 (20,10);
	       i.m2(100, 50);
              
           System.out.println(" ");
           m3(5,5);
            m3(4,3);
           
           System.out.println(" ");      
           m4(5,2);
           m4(10,5);
	}
	 
	 
	 }

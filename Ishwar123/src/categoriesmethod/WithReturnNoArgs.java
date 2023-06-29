package categoriesmethod;



public class WithReturnNoArgs
{
	// 3.method with return type and without argument
	// with return typemeans- use any datatype (like int,String) and remove- void .
	// write return -is mandatory
     // this operation divided in two part- first value(logic code whtever) live in inside method 
	// when we call to methodname with return type and assign value for perticular variabe.and
      //print this variable will get return type value .
	
	
	
       public static int m1()    // int is return type(remove void )// static method
  {
	int i= 50;
	int j = 20;
	int k = i+j;
	
	
	System.out.println(k);
	 return 50;            //  return type value is 50
  }   
       
    public int m2()
    {
    	int i = 100;
    	int j = 100;
    	int k = i-j;
    	int l = k+10;
    	System.out.println(k);
    	
    return  l ;
    }   
       
       
	 
	public static void main(String[] args)
	{
		   m1();        // 70
		
		int A = m1();        // assign return value to A variable and got output 
		System.out.println(A);   // 50  (return type value)
		
		System.out.println(" ");
		
		WithReturnNoArgs i = new WithReturnNoArgs (); // create obje to calling nonstatic method
	  	i.m2();       // 0     logic get value
		
	  	
	  	System.out.println(" ");
	  	int B = i.m2();
	  	System.out.println(B);  // 10
	  	
	} 
	  
	 
  }
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	


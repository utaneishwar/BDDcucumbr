package polymorphism;

    public class Test1_polymorphism 
    { // There is no matter the type of methods are whatever type it is return type or static or nonstatic 
    	// but  methodname should be same and method signature (m1(int))should be same 
        // then we can call methods are overloaded
    	
    	public void m1() 
    	{
    		System.out.println("This is nonstatic m1 method ");
    	}
    	
    	public static void m1(int i) 
    	{
    		System.out.println("This is static m1 method ");
    	}
    	
    	public  int  m1(String s ) 
    	{
    		System.out.println("This is nonstatic method ");
    		return 80;
    	}
    	
    	// the above 3 methods are overloaded because method name are same and signature are different 
    	
    	
	public static void main(String[] args)
	{
		Test1_polymorphism t = new Test1_polymorphism ();
		
	  int s =t.m1("Ishwar");  
	  System.out.println(s); /// o/p = 80 because return int 80
		 
	     t.m1(10);
	     t.m1(); 
	     

	}

}

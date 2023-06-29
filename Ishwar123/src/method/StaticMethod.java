package method;

public class StaticMethod
{
	
public static void area()
{
	//  create my name is ishwar
	System.out.println("my name is ishwar");
	System.out.println("my name is ishwar");
	System.out.println("my name is payal");
	System.out.println("my name is payal");
	System.out.println("my name is  kishor");
}
	public static void ram ()
	{
		int a = 10;
		int b= 20;
		int c = 30;
		int d = a+b+c;
		System.out.println(d);
		
		int a1 = 100;
		int b1 = a1-d;
		System.out.println(b1);
	}

	public static void main(String[] args)
	{
		// here are two way for call to method they are following
		// syntax- static method name ();
		//another syntax classname.methodname();
		
	        area();
	        StaticMethod.area();
//-----------------------------------------------------------------------------------------------------	        
//-------------------------------------------------------------------------------------------------------------    
//	  for practice // call from static method to non_staticmethod in class NonStaticMethod //aditya-methodname 
	        
	        
	       NonStaticMethod ish = new NonStaticMethod();
	       ish.aditya();
	       ish.area();
	        area();  // call inside a class  
	        ram();
	        
	     //call static method inside a class by using following 
	        StaticMethod ish1 = new StaticMethod();
	        ish1.area();
	        // mention warning when we call by using nonstatic syntax.
	        StaticMethod.area();
	        area();
	       ram();
	        
	}
	
	

}

package inheritance;

public class B extends A
{
	  int c = 50;
	  int a = 90;
	  String city=  " Delhi ";
	  static String country = "India";
	
	public void m1()
	{
		System.out.println("value of a without super keyword="+a);    // 90
		System.out.println("value of a with super keyword="+super.a);  // 10
	
	
	}
	public void m2()
	{
		System.out.println(city);
		
			
		System.out.println(super.city);  // here we used super keyword
		
	}

	public static void main(String[] args) 
	{
		 B b = new B();
		 System.out.println(b.a);   // 10
		 System.out.println(b.c);    // 50
		 System.out.println(d );       // called from parent class not used 
		                                  //here object name or ref variable 
		                                // because extends use 
		 
		// ---------------------------------------------------
		b.m1();   
		b.m2();
		
	}
	

	}



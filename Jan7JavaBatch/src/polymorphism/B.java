package polymorphism;

public class B extends A 
{
	//3) rule - overriding
	public int m1() 
	{
	System.out.println("int return type from  child class B  ");	

    return 50;
	}
	
	//4) rule - overriding 
	public  void m2()
	{
		
		System.out.println(" nonstatic overridding m2 method from class B ");
	}
	
	// 5) rule - Accessmodifier 
	
	public void m3()
 	{
 		System.out.println(" public nonstatic acccessmodifier m3 method from class B");
 	}
	 
	protected  void m4()  // public  accessmodifier allowed but private not allowed 
		{
			System.out.println(" nonstatic acccessmodifier m4 method from class B");
		}
//	    void m5()         not allowed  because in parent class accessmodifier taken protected 
//		{
//			System.out.println(" ***** ");
//		}
//		
		
	 
//----------------------------------------------------------------------	 
	 
// execution	 
	
	public static void main(String[] args) 
	{
		// OVERRIDING EXECUTION 
// 3) rule - 
		B b = new B();
		b.m1();   //  child class object 
		
// when both method are overloaded and  when we execute this overloaded method 
// its totally depend on object 
		
		A a =new A();   // parent class object 
		a.m1();
		
// 4) rule - overriding		
		
		b.m2();  // child class object 
      	a.m2();   // parent class object 
		
	//5) rule - Accessmodifier
      	b.m3();    // child  class
     	a.m3();      // parent class
	
        b.m4();    // inside class because we can overridded method on the basisi of object 
        a.m4();     //outside  class because we can overridded method on the basisi of object 
	
	}
}

package polymorphism;

public class B extends A 
{
	public int m1() 
	{
	System.out.println("int return type from  child class B  ");	

    return 50;
	}
	
	
	public static void main(String[] args) 
	{
		B b = new B();
		b.m1();   //
		
// when both method are overloaded and  when we execute this overloaded method 
// its totally depend on object 
		
		A a =new A();
		a.m1();
		
		
	}

}

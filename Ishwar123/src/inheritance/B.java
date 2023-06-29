package inheritance;

public class B extends A
{
	// super keyword concept- when we call global (static and non-static)variable
	   //from parent class into the child class in nonstatic area then we used super keyword
	
	int a = 10;
	String s = " ishwar  shalikrao utane ";
	public void m1() 
	{
		System.out.println(super.a);
		System.out.println(super.s);
	}
	

	public static void main(String[] args)
	{
	// we can access Parent class with the help of Child class object due to  Extends (inheritance) 
		
		B b = new B();
		b.m1();  // in that method variable comes from parent class that is Shalikrao laxman utane
		
               // we can also access inside class  variable 
	}

}

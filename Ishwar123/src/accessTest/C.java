package accessTest;

public class C extends B
  {

	public static void main(String[] args)
	{
	   B b = new B();
	    C c = new C();
	//  b.m9();     // we can not access here because of it is protected method 
	               // we can access only with the help of child ref variable when we called different package 
	   c.M9();

	}

}

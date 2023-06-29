package inheritance;

public class A1 extends A
{
	// in that program  i understand Super Keyword concept 
	// whenever we want to variable at wich global lelel this are static or nonstatic 
	//under nonstatic area then we use " Super " for calleing 
	
	
	
  int a = 50;
  String s = " panwadala ";
	String city = " delhi";
	
	public void m1()
	{
	System.out.println(" value of without super keyword="+a);	  // 
	System.out.println(" value of with super keyword="+super.a);  //  10 this value is in the parent class (A class)
	                                                 // in wich use super keyword  calling to parent  variable    
	}                                               // inside a child class.

	public void m2()
	{
		System.out.println(city);
		System.out.println(super.city);
	}
	
	
	
	
	
	
	public static void main(String[] args) 
   {
		A1 a = new A1 ();
		
		a.m1();  
		a.m2();    // Delhi
		            // uri

	}

}

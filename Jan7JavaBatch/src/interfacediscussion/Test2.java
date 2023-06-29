package interfacediscussion;

public class Test2 extends Test
{
// This class is child class for define Abstract method 
	
   public void m3()
   {
	System.out.println(" m3 method ");   
	   
   }	
	
	

	public static void main(String[] args)
	{
		Test2 t = new Test2();
		  
		t.m1();  //this class comes from abstract class Test
		t.m2();   // similar also come from Abstract class Test
		t.m3();   //  abstract method define here .
		 

	}

}

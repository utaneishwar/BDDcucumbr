package variable;

public class D 
{
	int i=50;
	static int j = 20;
	int k = 60;
	String s = "Daniel";
	
	
	
	
	public static void main(String[] args) 
	{
	//(note:- we can change multiple times nonobjecvtive variables value ) 
		// we can change value object to object /but in static variable can't change
		   //object to object remains same value for all object .
		// but in static variable we cannot change multipletimes only one times
		
	System.out.println(j);	 //20
	
	
	
	D d1 = new D();
	  System.out.println(d1.i);   // 50
	  System.out.println(d1.j);   // 20  calling by nonstatic variable to static variable 
	                               // show warning 
	  
	  j = 60;   // we can change value of static variable 
	  System.out.println(j);     // 60
	  
	  
	  
	  d1.i = 30;           // we changed the value of nonstatic variable
	  System.out.println(d1.i);//30
	  
	  
	  D d2 = new D();      // again crteate object
	  
	 System.out.println(d2.i);  // 50
	 System.out.println(d1.i);   // 30
	 
	 
	 D d3 = new D();
	 System.out.println(d3.i);    // 50
	 
	 
	 d2.i = 80;
	 System.out.println(d1.i);   // 30
	 System.out.println(d2.i);   // 80
	 System.out.println(d3.i);   // 50
	  
	  
	  d1.i = 50;
	  System.out.println(d1.i);  // 50
	  
	  
	  System.out.println(d1.s);   // daniel
	  
	d2.s = "Eder";
	  
	  System.out.println(d2.s);   // Eder
	  
	  
	  d3.s="Ron";
	  
	  System.out.println(d3.s);   // ron
		
		
		
		
	}
	
	
	

}

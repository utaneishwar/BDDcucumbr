package method;



public class ThisKeyword
{
  //  this ... keyword
	// it is used   to call global variable(static and nonstatic variable) 
     //  inside in nonstatic area (like- body of nonstatic method )
	// it is not recommended for local variable (means not used in static method and main method )
	
	
	
	  int i = 50;
	static  String s = "abcd";
	  
	  public void m1()
	  {
		int i = 70;
		System.out.println(i);                // 70
		
		 System.out.println(this.i);          // 50  calling for int i= 50
	  } 
	public void m2()
	{
		int i = 50;
		System.out.println(this.i);  // 50
		
		System.out.println(s);      // abcd   // calling static variable by using 
		                                        // directly variablename 
		
		
		
	}	
	public static void main (String [] args)	
		
	{	
		ThisKeyword t = new ThisKeyword();
		
		t.m1();           //  70 and 50
		
		
		System.out.println(" ");
		
		
		t.m2();              // 50 and abcd
	} 
	
	
		

		}
		
		
	  
		 

		  
	  
	  
	  
	
	  
	


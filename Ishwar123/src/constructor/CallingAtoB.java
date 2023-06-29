package constructor;

public class CallingAtoB 
{
	// we can call only one constructor at time inside an another constructor
	// constructor call must be at the first line if we try to write any line they will get error
	
	public CallingAtoB ()
	{
	        this (10,20);      // must be write in first line we can call only one constructor
		System.out.println(" zero argument  constructor");
		
	}
	
	public CallingAtoB (int a)
	{
	
		System.out.println(" one argument  constructor");
		
	}
	public CallingAtoB (int a , int b)
	{
      
		System.out.println(" two argument  constructor");
		
	}
	
	

	public static void main(String[] args)
	{
		CallingAtoB c = new CallingAtoB ();
		
		// at the time of calling have to give argument 
		

	}

}

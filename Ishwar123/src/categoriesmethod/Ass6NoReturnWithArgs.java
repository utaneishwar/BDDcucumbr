package categoriesmethod;

public class Ass6NoReturnWithArgs 
{
  // Ass no.06 
	// WAP To define  the calculator which can perform any operation 
	    // with multiple set of dta .
	
	
	public void m1( int i, int j )
	{
		int k = i+j;
		System.out.println(k);   // for addition
		
		
		int l = i-j;
		System.out.println(l);   // for substraction
		
		
		
		int m = i*j;             
		System.out.println(m);     // for multiplication
		
		
		int n = i/j;
		System.out.println(l);         // for division
		
		
		
	}
	
	public static void main(String[] args) 
	{
		
		Ass6NoReturnWithArgs nrwa= new  Ass6NoReturnWithArgs ();
		
		nrwa.m1(50,20);
	
		nrwa.m1(100,50);
		
		
		nrwa.m1(40,20);
		
		nrwa.m1(30,15);
		
		// use multiple set of data (value) we can called and perform operation 
		
	}
	
	
	
	
	
}

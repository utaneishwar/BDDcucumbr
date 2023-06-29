package categoriesomethod;

public class AssNo083 
{
  // Assno -08
	
	public static int m1()
	{
		int a = 5+3;
		return a ;
	}	
	
	public void m2(int b)         // here value y will become on the place of b variable 
	{
		int c = b+2;
		System.out.println(c);
		
		
	}
	
     public static void main(String[] args)
     {
	      int y = m1();    // o/p -8
	      
	      AssNo083  refvar = new AssNo083 ();
	      refvar.m2(y);   // here we can refvar.m2(m1());
	                       // 10

	}

}

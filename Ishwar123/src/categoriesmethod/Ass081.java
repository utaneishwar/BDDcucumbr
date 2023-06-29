package categoriesmethod;

public class Ass081
{
    public static int m1 (int a , int b)
    {
	int c = a+b;
    return c ; 
    }
    
    
    
	public void m2 (int d ) 
	{
	    int x = d + 500;
	
	System.out.println(x);
	
	
	
	}
	public static void main(String[] args)
	{
		   int   x  = m1 (10,20);    // 30
		
		         int d = x +100;      //130
		System.out.println(d);         //130
		
		System.out.println("    ");
		
		Ass081 nrwa = new Ass081 ();    //
		nrwa.m2(d);    //
		
		
	}

}

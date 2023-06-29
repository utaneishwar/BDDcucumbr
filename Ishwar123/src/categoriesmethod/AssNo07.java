package categoriesmethod;

public class AssNo07
{
	// WAP to calculate toatal area of land ;
	// In this class we use 3 methods  and write logic .
	// and directly call in main method using return type (like ..return c)
	// here we used with return with arguments categories method ;
	public static int m1(int a,int b)
	{
		int c = a*b;
		
		
		return c;          // here in c return stored the value of c= a*b
	}
		
	public static int m2(int a,int b)
	{	
		
		
		int c = a*b;
		
		return c; 
	}

		public static int m3(int a,int b)
		{
			int c = a*b;
	
	
	return c;
		}
	
	  public static void main(String[] args)
	{
		int a= m1(5,5);
		System.out.println(a);
		
          
          int b  = m2(2,4);   
        System.out.println(b);
        
        int c = m3(2,2);
       System.out.println(c);
      int z = a+b+c;          // adding value of 3 method to calculate total land 
      
      System.out.println(" The total land area is ="+z);
	}  

}

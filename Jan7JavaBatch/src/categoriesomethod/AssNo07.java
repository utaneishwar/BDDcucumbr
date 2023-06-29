package categoriesomethod;

public class AssNo07 
{
// 07. WAP To calculate the total area of land 
// with return	with Argument;
	public static int land1(int a , int b)
	{
		int c = a*b;
		
		return c ;
     }	
		
		public static int land2 (int a,int b)
	
		{
			int c = a*b;
			
			return c;
		}
		public static  int land3(int a,int b)	
		{
			int c = a*b; 
			return c ;
			
		}
	
	 public static void main(String[] args)
	{
		int l1 = land1 (50,30);
		System.out.println(l1);   // 1500
	//	--------------------
	  int l2 = land2 (20,60);
		System.out.println(l2);    // 1200
	//-----------------------	
		int l3=land3(10,80);
		System.out.println(l3);     // 800
		int a = l1+l2+l3;            // 3500
		System.out.println(" the total area of land is = "+a);
		
	}

}

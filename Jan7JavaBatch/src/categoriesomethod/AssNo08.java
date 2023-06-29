package categoriesomethod;

public class AssNo08 
{
	
	
	// Ass no 08 
	// To generate the output of first method use that output
	// as a input of second method
	
	
	
   public static int m1(int a,int b)
	
   {
	   int c = a+b;          
	   
	   
	   return c;        //40
	   
   }
	
	public void  m2(String t)
	{
		String outputm2 =  t +"mrunali"; 
		System.out.println(outputm2);   //  40tusharmrunali
		
		
	}
	
	public static void main(String[] args)
	{
		int d = m1(20,20);                          //40
		System.out.println(d);                     //returntype 40
		System.out.println("       ");
		
		String t = d+"tushar";                    // 40tusharmrunali
		
		AssNo08 ish =new AssNo08 ();
		ish.m2(t);                                 //40tusharmrunali
		
	}

}

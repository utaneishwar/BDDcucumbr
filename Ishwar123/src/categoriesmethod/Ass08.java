package categoriesmethod;

public class Ass08
{


   public static int m1(int a,int b)

    {
	   int c = a+b;
	   
	   
	   return c;        
	   
     }
     public void  m2 (int c)

    {
	   int x = c-100;
	   System.out.println(x);
    }
	
	
	  public static void main(String[] args) 
	{
		int a = m1(40,50 );
       System.out.println(a);   // 90
       
        int  c = a+10;
   System.out.println(c);     //100
   System.out.println("     ");
   Ass08 nrwa = new Ass08 ();
   nrwa.m2(c);   // 100
  
   
   
	}}

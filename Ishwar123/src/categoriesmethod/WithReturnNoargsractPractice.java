package categoriesmethod;

import java.net.MulticastSocket;

public class WithReturnNoargsractPractice 
{
	
  public static String m1() 
	{
		String a = " Name of student is Ishwar";
	System.out.println(a);
		
		return " Name of student is Tushar";
	}
	   public static int  m2()     
	   {
	   	
	   	int phy  = 50;
	   	int chem = 60;
	   	int math = 70;  
	   	int pcm = phy+chem+math ;
	      System.out.println(" The total marks in PCM = "+pcm);

	      return 150;
	   }	
	public double m3 ()
	{
		double a = 180;
		double b = 300;
		double c = a/b;
		
	System.out.println(" the percentage of ishwar is "+c*100);
		
		return 5.5;
	
	}
	
	public static void main(String[] args)
	{
		m1();
		m2();
		
		
		WithReturnNoargsractPractice  i = new WithReturnNoargsractPractice ();
		i.m3();
		
	    System.out.println(" ");
		String s = m1();
		System.out.println(s);
		
		
		//again proceed this program;
		
		
		
	}
	
	
	

}

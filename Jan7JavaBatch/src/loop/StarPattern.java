package loop;

public class StarPattern 
{

	public static void main(String[] args)
	{
		
		for (int i=1; i<=5; i++)   //this is represent rows
		{
			for(int j=1;j<=5;j++)   // this is represent columns
			{
			
			    if((j>=1&&j<=i))
			     {
			     System.out.print(" * ");   // this is represent * if condition is true 
			     }	
			     else
			       {
			      System.out.print(" ");	  //  get blank  if condition is not true
			       }
			 }
			System.out.println(" ");              // this represent next line
		 } 
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
	}



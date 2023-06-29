package arraysDiscussion;

public class PrintPrimeNumber1to100 
{

	public static void main(String[] args)
	{
		// WAP to print the prime number from 1 to 100
		
 for(int i=0; i<=100; i++)
 {
    boolean isprime = true;
	  if(i>1)
		{
		  for(int j=2; j<i; j++) 
				{
				 if(i%j==0)
					  {
				       isprime=false;	
					   }
				}
		 }
      else 
	     {
		   isprime = false;
		  }
			if (isprime)
			       {
			       System.out.println(i+" ");
			        }
	}
 }
}
	

package arraysDiscussion;

public class PrintFirst100PrimeNumber {

	public static void main(String[] args)
	{
		//   WAP to print first 100 prime number
		  
	 
	   int j =0;    // number
	 
	   int  count =0;
		
	   while(count<=100)
		{
			boolean isprime=true;
			
			for(int i=2; i<=count; i++)
			{
				if(j%2==0)
				{
					isprime=false;
					break;
				}
			}
			
			if(isprime)
			{
				
				System.out.println(j);
				j++;
			}
			}
	          count++;
	       
	}
	}



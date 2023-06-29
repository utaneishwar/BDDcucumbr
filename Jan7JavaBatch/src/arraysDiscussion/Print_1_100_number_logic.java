package arraysDiscussion;

public class Print_1_100_number_logic {

	public static void main(String[] args)
	{
		// WAP to print the 1 to 100 prime number
		
		for(int number=0; number<100; number++) 
		{
			
			
			boolean isprime = true;
			
			for(int j=2; j<number; j++)
			{
				if(number%j==0)
				{
					isprime=false;
					break;
				}
			}
			if(isprime)                 // required false  then it will print 
			{
				
				System.out.println(number);
			}
			}
		
		}

}

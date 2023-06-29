package interviewProgram;

public class PrintPrimeNumberByForloop {

	public static void main(String[] args) 
	{
	
   
		
		for(int i=0; i<=100; i++)
		{
			boolean flag = true;
			
			for(int j=2; j<i; j++) 
			{ 
				if(i%j==0)
				{
					flag =false;
					break;
				}
				
			}
			if(flag)
			{
				System.out.println(i);
			}
			
		}
		

	}

}

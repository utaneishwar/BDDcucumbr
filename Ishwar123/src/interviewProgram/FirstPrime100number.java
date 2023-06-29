package interviewProgram;

public class FirstPrime100number {

	public static void main(String[] args)
	{
		int number=0;
		int count=0;
		while(count<=100)
		{
			boolean flag=true;

			for(int i=2; i<number; i++)
			{
				if(number%i==0)
				{
					flag=false;
					break;
				}
			}
			if(flag)
			{
				System.out.println(number);//0,1,2,
				count++;
			}
			number++;
		}


	}

}

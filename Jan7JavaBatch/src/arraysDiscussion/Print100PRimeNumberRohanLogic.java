package arraysDiscussion;

public class Print100PRimeNumberRohanLogic {

	public static void main(String[] args) 
	{
        // WAP to print the First 100 prime number
		
		int number=1;
		int i=1;
		
		while(number<=100)
		{
			int temp =0;
			
			
			for(int j=2; j<i-1; j++)
			{
				if(i%j==0)
				{
					temp=temp+1;
				}
			}
			
			if(temp==0) 
			{
				System.out.println(i);
				number++;
			}
			i++;
		}

	}

}

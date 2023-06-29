package loop;

public class Continue {

	public static void main(String[] args)
	{
		// CONTINUE: It is keyword which is do not terminate the loop 
		// it's use for iteration to another no.  
		
		for (int i=0; i<10; i++)
			
		{
		if(i%2==0)          // it will give odd no due to continue
		{
			continue ;        // whenever satisfied condition in if condition then it will be go for next iteration 
			
		}
		
		System.out.println(i);   // 1,3,5,7,9
		}
		
	}

}

package arraysDiscussion;

public class AgainisprimeNumber {


	
	
	public static void main(String[] args)
	{
	  
	
	    for(int number=2; number<100; number++)    // iteration for number
		 {
		   boolean isprime = true;
			   
		   
		      for(int j=2; j<number; j++)     // iteration 
			    {
				if(number%j==0)
				 {
					isprime =false;
					break;
				}
				 
			    }
			 if(isprime)
			 {
				 System.out.println(number);
			 }

			 
		 
		 }
	      
		
		
		
	}

}

package arraysDiscussion;

public class PrimeNumberMock {

	public static void main(String[] args)
	{
	
	 for( int i=0; i<100; i++)
	  {
			
			boolean flag = true;
		
			for(int j=2; j<i; j++)
		 {
			if(i%2==0) 
			{
			 flag= false;
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

package arraysDiscussion;

public class FirstPrime1000number {

	public static void main(String[] args)
	{
	   int number=2;
	   
	   while(number<=100)
	   {
		   boolean isprime=true;
		  
		   for(int i=2; i<=number; i++)
		   {
			  if (number%2==0) 
			  {
				
				isprime=false;
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

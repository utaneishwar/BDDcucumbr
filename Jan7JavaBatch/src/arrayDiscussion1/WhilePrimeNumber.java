package arrayDiscussion1;

public class WhilePrimeNumber {

	public static void main(String[] args)
	{
	  int number=0;
	  int count=0;
	  
	   while(count<=100)             // its concider number
	   {
		   boolean flag=true;
		   
		   for(int i=2; i<number; i++)     // its concider modulus
		   {
			 if(number%i==0)          
			 {
				flag=false;
				break;
			 }
		   }
		   
		   if(flag)
		   {
			   System.out.println(number);
			   count++;
		   }
		   number++;
	   }
	  
	  
		
		
	}

}

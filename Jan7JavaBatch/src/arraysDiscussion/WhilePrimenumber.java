package arraysDiscussion;

public class WhilePrimenumber {

	public static void main(String[] args) 
	{
		
	    int number=0;
		int count =0;
	
		while(count<=100)
		{
		boolean flag=true;
		
			for(int j=2; j<number; j++ )
			{
		     if(number%j==0) 
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

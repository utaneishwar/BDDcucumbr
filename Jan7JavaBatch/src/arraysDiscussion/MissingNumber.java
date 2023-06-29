package arraysDiscussion;

public class MissingNumber {

	public static void main(String[] args)
	{
	int x[]= {1,2,3,5,6};
	
	  
	   for (int i=0; i<x.length-1; i++)
	    {
	      boolean iscorrect = x[i]+1==x[i+1]; 
	      
	      if (!(iscorrect)) 
	      {
	    	  System.out.println(x[i]+1);
	      }
	      
	       
	   }	
	
			

	}

}

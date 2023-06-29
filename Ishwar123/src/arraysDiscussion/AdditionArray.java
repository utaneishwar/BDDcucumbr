package arraysDiscussion;

public class AdditionArray {

	public static void main(String[] args)
	{
		int [] x= new int [5];
	// here is used creating object type array 	
		
		x[0]= 5;   
		x[1]= 5;
		x[2]= 5;
		x[3]= 5;
		x[4]= 5;
		
		int sum=0;                           // here is used to solve operation 
		
	   for (int i=0; i<x.length; i++)
	   {
		 sum= sum+x[i];                      // we can used  here sum+=x[i]
		
	   }
	   System.out.println(" thr addition of all element of array is "+sum);
		
			
		}
	}

 

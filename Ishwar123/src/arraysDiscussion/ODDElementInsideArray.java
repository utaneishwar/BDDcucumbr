package arraysDiscussion;

public class ODDElementInsideArray {

	public static void main(String[] args) 
	{
		int x []= {30,35,40,50,55};    // this is an element 
		int z = 0;
		
		for (int i=0; i<x.length; i++)   // this logic for iteration 
		{
		    	if(x[i]%2==1)      // this logic got for element which is in insiade array 
		    	{
		    		z=z+x[i];    // this logic got for addition 
                 }
		}	

		System.out.println(z);   // 90

    }
		                      }	
		

	

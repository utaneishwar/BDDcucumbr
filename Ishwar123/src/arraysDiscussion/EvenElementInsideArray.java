package arraysDiscussion;

public class EvenElementInsideArray {

	public static void main(String[] args) 
	
	
	
	{
		int x []= {10,20,30,40,30};           // this are the element of arrays 
		          // 0,1,2,3,4                 this is an index of array 
		int z = 0;
		
		for (int i=0; i<x.length; i++)
		{
		//   10,    20    30   40  30    All values comes under in if condition because remainder is zero 
		  // x[0], x[1], x[2],x[3],x[4]
		    if(x[i]%2==0)
		    {
		    z=z+x[i];	
		    }
		}	
		System.out.println(z);	
	}


    }

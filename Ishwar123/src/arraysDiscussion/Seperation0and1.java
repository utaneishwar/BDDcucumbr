package arraysDiscussion;

import java.util.Arrays;   // automatically it will be come when we use "Arrays.sort"

public class Seperation0and1 {

	public static void main(String[] args) 
	{
	  // seperation of   0 and  1  by using - Arrays.sort 	
		
	int a[]	= {1,0,1,0,0,1,1,0}	;
	
	    Arrays.sort(a);       // it will be arrange in asc order 
	    
	   for (int i=0; i<a.length; i++)
	   {
		System.out.println(a[i]);
		
	    }
		
		

	}

}

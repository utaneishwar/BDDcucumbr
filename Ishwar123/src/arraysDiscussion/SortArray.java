package arraysDiscussion;

import java.util.Arrays;

public class SortArray {

	public static void main(String[] args) 
	{
	  // SORT - ARRAYS : meaning of sort is execute element values in "ASC"order like 5,4,3,2,8--2,3,4,5,8 
	 // it is not applicable for "String" Datatype array 
		
		
		int a[]= {10,20,30,40,50};
		  Arrays.sort(a);  // Already existing in JVM so ARRAYS-  it is class name 
		                                                // SORT-   it is method 
		  for (int w:a )
        {
		  System.out.println(w); // 10,20,30,40,50
		 }

	}

}

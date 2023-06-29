package arraysDiscussion;

import java.util.Arrays;

public class SortArray {

	public static void main(String[] args)
	{
		// famous question in interview point of view 
		
		
		int a[]= {10,20,30,8,5};
		
		Arrays.sort(a);   // when we have sort array that time use 
		                  // it is already inside in jvm "Arrays" is clasname 
		                                                 // "sort" is methodname 
		for (int value:a)
		{
			
		System.out.println(value);   // 5,8,10,20,30
		}
		
		
	}

}

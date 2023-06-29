package collectionpractice;

import java.util.ArrayList;
import java.util.Arrays;

public class Assignment

{

	public static void main(String[] args)
	{
		
		Integer[] a = {1,2,7,9,10};
		Integer[] b = {2,4,5,6,6,8};
		
		
		ArrayList<Integer>  arr1 = new ArrayList<Integer>(Arrays.asList(a));
		ArrayList<Integer>  arr2 = new ArrayList<Integer>(Arrays.asList(b));
		
		arr1.addAll(arr2);
		//System.out.println(arr1);
		
		
		Integer[]  arr3 = new Integer[arr1.size()];
	
		arr1.toArray(arr3);         // 1,2,7,9,10,2,4,5,6,6,8  in vertically 
		
		
		for(int i=0;i<arr1.size();i++)
		{
			
			for(int j=i+1;j<arr1.size();j++)
			{
				
				if(arr3[i]>= arr3[j])
				{
					int x = arr3[j];    //
					arr3[j]= arr3[i];   // 
					arr3[i] = x;
					
					
				}
				
			}
			System.out.println(arr3[i]);
		}
		
		
		
		
	}
}

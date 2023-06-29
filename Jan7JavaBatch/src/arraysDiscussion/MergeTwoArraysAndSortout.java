package arraysDiscussion;

import java.lang.reflect.Array;
import java.util.Arrays;

public class MergeTwoArraysAndSortout

{

	public static void main(String[] args) 
	{
	// merge of two array 
		int a[]= {1,7,3,4,};
		int b[]= {5,6,2};
		
		int lengthC = a.length+b.length;
		
		int d[] = new int[lengthC];
		
		int j=0;
	    for(int i=0; i<a.length;i++)
		{   
			d[i]=a[i];              // d[]={1,2,3,4}
			                               // 1,7,3,4
        }
		
		
		for(int i=a.length; i<lengthC; i++)
		{
			d[i]=b[j];             //d[]={1,2,3,4,5,6,7
			j++;                       // 1.7,3,4,5,6,2
		}
		
		 Arrays.sort(d);               // 1,2,3,4,5,6,7
		                               // for Asscending order
		for(int finalArray:d)
		{
		
		System.out.print(" "+finalArray);	
		}
		
		
		
	}
	}
package arraysDiscussion;

import java.util.Arrays;

public class RemoveDuplicateNumber {

	public static void main(String[] args)
	{
		int a[]= {12,89,34,89,12,85};
	    int [] b =new int[a.length];
	    int j=0;
		
	Arrays.sort(a);
	for(int s:a)
	{
		System.out.println(s);
	}
	
	for(int i=0; i<a.length-1; i++)
	{
		if(a[i]!=a[i+1])
		{
			b[j] = a[i];
			j++;
		}
	}
	
	b[j]=a[a.length-1];
	System.out.println("****");
	for(int i =0; i<j; i++)
	{
		System.out.println(b[i]);
	}
	
		

	}

}

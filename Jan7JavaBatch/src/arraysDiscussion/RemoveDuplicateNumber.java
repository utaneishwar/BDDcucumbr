package arraysDiscussion;

import java.util.Arrays;

public class RemoveDuplicateNumber 
{

	public static void main(String[] args)
	{
		int[]a= {12,15,9,86,95,86,12};   // 9,12,15,86,95
		
		
		int []b=new int[a.length];
		
		int j=0;
		
		Arrays.sort(a);
	for(int c:a)
	{
	System.out.println(c);
     }
	
	for(int i=0; i<a.length-1; i++)
	{
		if(a[i]!=a[i+1])
		{
		     b[j]=  a[i];
		     j++;
		}
	}
	  b[j]=a[a.length-1];
   System.out.println("***********");
	for(int i=0; i<=j; i++)
	{
		System.out.println(b[i]+" ");
	}
	}

}

package arraysDiscussion;

import java.util.Arrays;

public class MergeTwoArray
{
	// Wap to merge two Array
	public static void main(String[] args)
	{
		int a[]= {5,1,3,6};

		int b[]= {22,10,32,61};

		int c[]= {20,30,40};

		int length = a.length+b.length;
		int length1= length+c.length;
		int d[]= new int[length1];        //5,1,3,6
		int j =0; int k=0;
		for(int i=0; i<a.length; i++)
		{
			d[i]=a[i];
		}

		for(int i=a.length; i<length; i++)     //5,1,3,6,22
		{
			d[i]=b[j];
			j++;
		}

		for(int i=length; i<length1; i++)
		{
			d[i]=c[k]; 
			k++;
		}
		Arrays.sort(d);
		for(int FinalArray:d)
		{
			System.out.print(" "+FinalArray);        // will get Ans in Asc format
		}




	}
}

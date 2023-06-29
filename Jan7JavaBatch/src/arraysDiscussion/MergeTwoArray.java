package arraysDiscussion;

import java.util.Arrays;

public class MergeTwoArray {

	public static void main(String[] args)
	{
		
		int a[]= {1,2,9,4};
		int b[]= {5,8,7};
		
		int temp=0;
		int d=0;
		
		int c []=new int[a.length+b.length];
		
		
		for(int i=0; i<a.length; i++)
		{
		       c[d]= a[i];
		       d++;
		}
		for( int i=0; i<b.length; i++)
		{
			  c[d]=b[i];
			  d++;
		}
		
		for(int i=0; i<c.length; i++)
		{
			for(int j=i+1; j<c.length; j++)
			{
			if(c[i]>c[j])
			{
				temp =c[i];
				c[i]=  c[j];
				c[j]= temp;
				
				
			}
				
			}
		}
		
		for(int e:c)
		{
			System.out.println(e);
			
		}
		
	
		
		
		
		
		

	}

}

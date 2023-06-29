package arraydiscussion1;

import java.util.Arrays;

public class Merge_Two_Array {

	public static void main(String[] args)
	{
		int []a= {7,8,2,5,4};
		int []b= {10,12,15};
		
		
		int j=0;
		int [] c=new int[a.length+b.length];
		
		for(int i=0; i<a.length; i++)
		{
			  c[i]	= a[i];
			
		}
		for(int i=a.length; i<c.length; i++)
		{
			c[i]=b[j];
			j++;
		}
		Arrays.sort(c);
		for(int d:c)
		{
			System.out.print(" "+d);
		}
		
		
		

	}

}

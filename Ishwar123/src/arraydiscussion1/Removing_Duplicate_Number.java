package arraydiscussion1;

import java.util.Arrays;

public class Removing_Duplicate_Number {

	public static void main(String[] args)
	{
		 int []a= {4,8,3,2,5,8,4,5};  // 4,8,3,2,5
		 
		 int []c=new int[a.length];
		 int m=0;
		 int temp =0;
		
		 for(int i=0; i<a.length; i++)
		 {
		 for(int j=i+1; j<a.length-1; j++)
		 { 
			 if(a[i]>a[j])
		       {
				 temp=a[i];
				 a[i]=a[j];
				 a[j]=temp;
				}
		 }
		 }
		 
		for(int i=0; i<c.length-1; i++)
		{
			if(a[i]!=a[i+1])
			{
	             c[m]=a[i];
	             m++;
			}
		}
		      c[m]= a[a.length-1];
		      System.out.println(" ");
		      for(int i=0; i<m; i++)
		      {
		    	  System.out.println(c[i]);
		      }
		      
		

	}

}


package arrayDiscussion1;

import java.util.Arrays;

public class SortingAlternateNumber {

	public static void main(String[] args)
	{
		int s []= {5,8,3,4,9};
		int temp=0;
		for(int i=0; i<s.length; i++)
		{	
			
	      for(int j=i+1; j<s.length-1; j++)
		   {
			if(s[i]>s[j])
			{
				temp=s[i];
				s[i] =s[j];
				s[j]=temp;
			}
			
		     }
		}
	      for(int f:s)
	      {
	      System.out.println(f);
	      }
	      }

	}



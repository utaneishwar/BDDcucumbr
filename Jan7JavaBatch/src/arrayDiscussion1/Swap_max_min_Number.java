package arrayDiscussion1;

public class Swap_max_min_Number {

	public static void main(String[] args)
	{
		int mm[]= {87,56,32,89,5};
		
		int ind1=0;
		int ind2=0;
		
		
		
	  int max=mm[0];
	  int min=mm[0];
		int temp=0;
		
		for(int i=0; i<mm.length; i++)
		{
			if(max<mm[i])
			{
			   max=mm[i];
			    ind1=i; 
			}
			else if (min>mm[i])
			{
				min=mm[i];
				ind2=i;
			 }
			
		}
		temp=mm[ind1];
		mm[ind1]=mm[ind2];
		mm[ind2]=temp;
		  for(int a:mm)
		{ 
			System.out.print(" "+a);
			}
		

	}

}

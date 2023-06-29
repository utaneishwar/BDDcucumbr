package arraydiscussion1;

public class Swap_Alternate_number {

	public static void main(String[] args)
	{
		int []a= {45,2,30,18,20,5,80};
		
		  int temp=0;
		
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
		   for(int b: a)
		   {
			   System.out.println(b);
		   }
		

	}

}

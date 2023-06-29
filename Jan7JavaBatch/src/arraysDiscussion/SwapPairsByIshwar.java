package arraysDiscussion;

public class SwapPairsByIshwar {

	public static void main(String[] args)
	{
		int a[]= {40,20,24,12,26,13};
		
		 
		int temp=0;
		
		for(int i=0; i<a.length-1; i++)
		   {
			
			// System.out.println(a[i]); 
			 
			if(i%2==0)
			{
			  temp=a[i];
			 a[i]=a[i+1];
			 a[i+1]= temp;
		}
		

	}
		for(int s:a)
		{
			System.out.println(s);
		}

}}

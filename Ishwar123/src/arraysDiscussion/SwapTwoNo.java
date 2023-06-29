package arraysDiscussion;

public class SwapTwoNo 
{

	public static void main(String[] args)
	{
		// swaping of two no 

		int v = 0;

		int a[]= {11,22,33,44,55,66,77,88,99};
		for (int i=0 ; i<a.length-1; i++ )
		{
			if (i%2==0)   // 
			{
			  int var =a[i];
				a[i] = a[i+1];
				a[i+1]= var;

			}

		}
		for(int w:a)	 
			System.out.println(w);






	}
}












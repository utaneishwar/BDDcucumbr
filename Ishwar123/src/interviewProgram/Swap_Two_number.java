package interviewProgram;

public class Swap_Two_number {

	public static void main(String[] args)
	{
		int []a= {45,11,33,88,63,78,50,30};
		int temp=0;

		for(int i=0; i<a.length;i++)
		{
			if(i%2==0)
			{
				temp=a[i+1];
				a[i+1]=a[i];
				a[i]=temp;
			}
		}
		for(int c:a)
		{
			System.out.println(c);
		}

	}

}

package interviewProgram;

public class Swap_Max_Min_numbef {

	public static void main(String[] args) 
	{
		int []a = {8,4,12,5,1};
		int index=0;
		int index1=0;

		int max=a[0];
		int min=a[0];
		int temp=0;
		for(int i=0; i<a.length; i++)
		{
			if(max<a[i])
			{
				max=a[i];
				index=i;
			}
			else if(min>a[i])
			{
				min=a[i];
				index1=i;
			}
		}
		temp= a[index];
		a[index]=a[index1];
		a[index1]=temp;
		for(int e:a)
		{
			System.out.println(e);
		}
	}



}



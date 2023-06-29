package arraydiscussion1;

public class Missing_number {

	public static void main(String[] args) 
	{
		
		int []a= {1,2,4,6,7,8,10};
		
		for(int i=0; i<a.length-1; i++)
		{
			if(a[i]+1!=a[i+1])
			{
				System.out.println(a[i]+1);
			}
		}
		
		
	}

}

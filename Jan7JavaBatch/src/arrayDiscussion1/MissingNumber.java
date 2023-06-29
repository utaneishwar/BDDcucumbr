package arrayDiscussion1;

public class MissingNumber {

	public static void main(String[] args) 
	{
		int []a= {1,3,4,6,8,9,11};
		
		for(int i=0; i<a.length-1; i++)
		{
			if(a[i]+1!=a[i+1])    // 2==2 , 3==3
			{
				System.out.println(a[i]+1);
			}
		}
		
	}

}

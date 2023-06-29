package arraysDiscussion;

public class MultiDimensional2 {

	public static void main(String[] args) 
	{
	// prepared by sir 
		
	int a[][]=	{{2,3},{4,5},{6,7},{8,9,7}};
	int sum = 0;
	
	
	for(int i=0; i<a.length; i++)       // iteration for rows
	{
		for(int j=0; j<a[i].length; j++)  // iteration for column
		{
		sum= sum+a[i][j];
		}
	}
		System.out.println(sum);
		
		

	}

}

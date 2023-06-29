package arraysDiscussion;

public class MultiDimensionalArray {

	public static void main(String[] args) 
	{
	// Multi dimensional Array
		
		int a[][]= {{1,2},{2,3},{4,5}};
		
		int z = 0;
		for (int i=0; i<a.length; i++)
		{
			for(int j=0; j<a.length-1;j++) 
			{
			 z= z+a[i][j];  
// a[0][0]      //1=0+1---3=1+2  ||i=1--5=3+2--5+3--8+4---12+5
//a.length-1		 // 0      1  ||    
			 
			 
			 
			 
			 }
			
		}
		
		System.out.println(z);
		}

}

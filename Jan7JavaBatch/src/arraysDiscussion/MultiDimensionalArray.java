package arraysDiscussion;

public class MultiDimensionalArray {

	public static void main(String[] args)
	{
		// Multi dimensional array

		int a [][]= {{1,2},{3,4},{5,6}};

		int z = 0;

		for (int i = 0; i<a.length; i++)
		{
			for (int j=0; j<a.length-1; j++) 
			{

				z= z+a[i][j]; // 0+1--1+2---3+3---6+4----10+5----15+6
			}
		}

		System.out.println(z);  // the addition of all elements is 21
	}

}

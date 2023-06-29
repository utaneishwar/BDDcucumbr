package arraysDiscussion;

public class SwapLowestAndHighest {

	public static void main(String[] args)
	{
 // swap lowest and highest value with the help[ of only that element index position without sorting 
		
		int a[]= {57,4,1,86};
	     
		int temp=0;
		
		int index1 =0;
		int index2=0;
		
		int  max=a[0];
		int min=a[0];
		for(int i=0; i<a.length; i++)
		{
			if (max<a[i])
			{
			   max=a[i];
			   index1=i;      // 3
			 
			 } 
			else if(min>a[i])
			{
				min=a[i];
				index2=i;         // 2
			
		   }
		}
	       temp = a[index1];         //86=a[3]
	       a[index1]=a[index2];      // 1=a[2]
	       a[index2]=temp;            // 86=86
		for(int aa:a)
		{
			System.out.println(aa);
		}

	}

}

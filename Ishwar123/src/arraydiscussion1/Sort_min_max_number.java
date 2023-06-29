package arraydiscussion1;

public class Sort_min_max_number {

	public static void main(String[] args) {
		
		int []a= {45,2,30,18,20,5,80};
		
		int max=a[0];
		int min=a[0];
		int index1=0;
		int index2=0;
		
		int temp=0;
		for(int i=0; i<a.length; i++)
		{
			if(max<a[i])
			{
				max=a[i];
				index1=i;
			}
			else if(min>a[i])
			{
				min=a[i];
				index2=i;
			}
		}
		
		      temp =a[index1];
		     a[index1] =a[index2];
		      a[index2]= temp;
		
		      for(int d:a)
		      {
		    	  System.out.println(d);
		      }

	}

}

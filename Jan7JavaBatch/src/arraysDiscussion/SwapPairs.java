package arraysDiscussion;

public class SwapPairs {

	public static void main(String[] args)
	{
	int a[]= {40,20,24,12,26,13};
	        //
	   int temp =0;
	
	for (int i=0; i<a.length-1;i++)
	{
		
		  
		// 4%2 ==0
		     //  2%2==0
		      // 0%2==0
			if(i%2==0)     // this condition  used for the even number satisfy  
			{
			    temp = a[i];     // 40=40   // 24=24     // 26=26
			    a[i] = a[i+1];   //  20=20   //  12 = 12  // 13=13
			    a[i+1]=temp;       // 40 = 40  // 24 =24    // 26=26
			  
			}
			  
			   
	}
		
	
	for(int w:a)
	System.out.println(w+" ");   // 20,40,   12,24     13,26   
     
	}
    };



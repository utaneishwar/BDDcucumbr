package arraysDiscussion;

public class SwapHighestAndLowestNumber
{

	public static void main(String[] args) 
	{
     // Swap highest and lowest Number 
		
		int a []= {1,9,32,86,3};
        int max = a[0];
        int index1=0;    //1
        int index2=0;
     
        
        int temp=0;
		  for (int i=1; i<a.length; i++)   
		{
		   if(a[i]>max)    //1>1----9>1
            {
			   max=a[i];   //9=9 -- 32=32---86=86
			   index1=i;   //1=1-----2=2------3=3---
            }
		}
	 System.out.println(" max value is "+max);         // 86
	
	   int min =a[0];
	 for(int j=1; j<a.length; j++)
	 {
		 if(min>a[j])
		 {
			 min=a[j];
			 index2=j;
		 }
	 }
	 System.out.println("min value is "+min);           // 1
	 
	  temp=a[index1];               //1=1=a[0]
	  a[index1]=a[index2];          //86= 86=a[3]
	  a[index2]=temp;	             // 1=1
	 	
		for(int c:a)
		{
			System.out.println(c);
		}
		
		
		
		
		
		
		
		
//		int s=0;
//		if(a[0]<a[3]) 
//             {   
//        	   s=a[3];    // 1
//        	   a[3]= a[0];
//        	   a[0]=s;
//        for(int i = 0; i<a.length; i++) 
//        {
//        	System.out.println(a[i]);	
//        }
         
         
		}}
	



package arraysDiscussion;

import java.util.Arrays;

public class IshwarPractice
{
	public static void main(String[] args) 
	{
  
      int a []= {1,12,3,4,5,};
      int sum= 0;
      for(int i = 0; i<a.length; i++)
      {
    	  sum= sum +a[i] ;
      }
         System.out.println(sum);
 //-------------------------------------------------------     
	
	    int b[]= {1,3,3,3,4,5,5,1};
	    {
		   Arrays.sort(b);
		 
		for(int b1:b)
		   {
			   System.out.println(b1);  
		   }
	   }
	//======================================
	
	    int c[]= {4,5,7,10,2,3};
	    for(int k=0; k<c.length; k++)
	    {
	      for(int l=0+1; l<c.length-1; l++)
	      {
	    	  int m =0;
	    	if (c[k]<c[l])
	    	{
	    		 m=c[l];
	    	     c[l]=c[k];
	    		c[k]=c[m];    //  5:5
	    		    //  4: 4
	    	}   
	      }
	    }
	    for(int ff:c)
	   {
	    	System.out.println(ff);
	    }
	
	}

}

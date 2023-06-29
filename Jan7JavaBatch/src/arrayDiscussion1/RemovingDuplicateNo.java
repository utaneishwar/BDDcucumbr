package arrayDiscussion1;

import java.util.Arrays;

public class RemovingDuplicateNo {

	public static void main(String[] args)
	{
	   int [] dupl = {8,7,6,5,7,8,4};
	   
         int[] unique= new int[dupl.length];
        
            int m=0;
    
            int temp=0;
    
         for(int i=0; i<dupl.length; i++)
            {
        	 
        	 for(int j=i+1; j<dupl.length; j++ )
        	 {
    	        if(dupl[i]>dupl[j])
    	     {
    	    	temp= dupl[i] ;
    	    	dupl[i]=dupl[j];
    	    	dupl[j]=temp;
    	      }
        	 }
            }
        
         for(int i=0; i<dupl.length-1; i++)
         {
        	 if(dupl[i]!=dupl[i+1])
        	 {
        		unique[m]=dupl[i];
        		m++;
        	 }
         }
         
         unique[m]=dupl[dupl.length-1];
            for(int i=0; i<=m; i++ )
    	        {
    	          System.out.print(unique[i]+" ");
    	        }
    	     }

	}
	



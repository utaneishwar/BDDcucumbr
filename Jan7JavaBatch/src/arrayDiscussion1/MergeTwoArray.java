package arrayDiscussion1;

import java.util.Arrays;

public class MergeTwoArray {

	public static void main(String[] args) 
	{

      int []a= {4,8,3,2,5};
      int []b= {5,6,7,9};
      int []c= new int[a.length+b.length];
      
      int j=0; 
     
      for(int i=0;i<a.length; i++)
      {
    	  c[i]= a[i];
    	    
      }
      for(int i=a.length; i<c.length; i++)
      {
    	       c[i]	=b[j] ;
		         j++;
	  }
      Arrays.sort(c);
      for(int f:c)
      {
    	  System.out.print(" "+f);
      }

}
}

package arraysDiscussion;

import java.util.Arrays;

public class MergeTwoArrays {

	public static void main(String[] args)
	{
	    
		 int [] array = {10, 30, 50,70};
		 
		 int [] array2 = {20, 40, 60,80};
		 
		 int length = array.length+array2.length;
		 
		 int []array3= new int[length];
		 
		 int j=0;
		     
		  for(int i=0; i<array.length; i++)
		  {
			  
			    array3[i]= array[i];
		  }
		  
		 for(int i=array2.length; i<length; i++)
		 {
			   array3[i] = array2[j];
			j++;
		 }
		 Arrays.sort(array3);
		 for(int finalArray:array3)
		 {
			 System.out.print(" "+finalArray);
		 }
		 
		 
		
		
		
		
		
		
	}

}

package collectionpractice;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.LinkedList;

public class RemoveDuplicateFromArray {

	public static void main(String[] args) 
	{
	   // Remove the Duplicate from array 
		
		
 String [] str = { "Saurav" , "virendra","virendra","sachin","Dhoni","sachin"};
		
		  LinkedList<String> ll= new LinkedList <String>();
		  
		   for( String newStr :str)
		   {
		
			if ( ll.contains(newStr))
			{
			   continue;
			}
			else
			{
				ll.add(newStr);
			}
		   }
		   System.out.println(ll);
		  
		  
	
	}

}

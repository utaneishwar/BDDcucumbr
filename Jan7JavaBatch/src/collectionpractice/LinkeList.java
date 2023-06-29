package collectionpractice;

import java.util.ArrayList;
import java.util.LinkedList;

public class LinkeList
{
  //Linked list is  a class implementing by list interface 
	// Same method is applicable to Linked list which present in Array List 
	 // it will be preserved order
	  // it accept null value
	public static void main(String[] args) 
	
	{
		 LinkedList <String> al1= new LinkedList <String>();
         al1.add("pune");
          al1.add("mumbai");
           al1.add("madras");
           al1.add("delhi");
            al1.add("kolkata");
            al1.add(null);
            al1.add(null);
            al1.add(null);
    System.out.println(al1);
    
         
		
	}

}
//
//                     Difference between ArrayList and LinkedList:
//Sr no         	ArrayList	                                        LinkedList
//1	      data structure is growable.	                Underlying data structure is doubly
//2.   	Its size will get increment by 
//      Initial capacity*(3/2)+1	                     Its size always gets double of the original size.
//3	    Searching operation is recommended	            Searching operation is not recommended.
//4	    Insertion and deletion is not recommended	     Insertion and deletion is recommended


package collectionpractice;

import java.util.LinkedHashSet;
import java.util.LinkedList;

public class LinkedHashSetDisc
{

	public static void main(String[] args)
	{
	// LinkedHashSet : it is a class and it cannot accept duplicate values and accept null but once
		              // but insertion order is preserved in LinkedHashSet  
		
		
  LinkedHashSet<String> lhs=new LinkedHashSet<String>();
	//it is class which comes from java.util pckage and store the element in unique
		
		
		lhs.add("Mumbai");
	    lhs.add("Kolkata");
	   lhs.add("Chennai");
	   lhs.add("Agra");
	   lhs.add("Delhi");
	   lhs.add("Kanpur");
	   lhs.add("Mumbai");
	   lhs.add("null");
	   lhs.add("null");
	   System.out.println(lhs);
	   
	//output:  [Mumbai, Kolkata, Chennai, Agra, Delhi, Kanpur, null]
	//order preserved   
}

	
		
	}
	
	
	
	
	



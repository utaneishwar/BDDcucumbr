package collectionpractice;

import java.util.ArrayList;

public class AssignmentMergeTwoArrayListAndSort 
{

	


	

	public static void main(String[] args)
	{
	   //convertion of two Arraylist to Array 
		//
		
		 ArrayList<String> Ar1= new ArrayList<String>();
		 Ar1.add("Rohit");
		 Ar1.add("Sharma");
		 //System.out.println(Ar1);
		
		 ArrayList<String> Ar2= new ArrayList<String>();
		  Ar2.add("Virat");
		  Ar2.add("Kohli");
	   // System.out.println(Ar2);
		  
		  Ar1.addAll(Ar2);
		 System.out.println(Ar1);      //   [Rohit, Sharma, Virat, Kohli]
		
	  String [] Ar3= new String[Ar1.size()];
		 
        String[] Array = Ar1.toArray(Ar3);
	    for( int i=0; i<Array.length; i++)     // we use here forEach loop also for(String S:Array)
	    {
	    	
		   System.out.println(Array[i]);
	    }
	  
	
	}
}
  //output:

//             [Rohit, Sharma, Virat, Kohli]
//                  Rohit
//                  Sharma
//                  Virat
//                  Kohli
//

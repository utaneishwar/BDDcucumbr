package collectionpractice;

import java.util.TreeSet;

public class TreesetClassDisc {

	public static void main(String[] args) 
	{
		// Treeset is class in  which  storing the element inside by default in any of the Sorting order 
		  // it can not accept null value  if we add null value then it will through nullpointer exception 
		
		
			TreeSet<String> ts =new TreeSet<String>(new MyComp());
		ts.add("mumbai");
		ts.add("madras");
		ts.add("kolkata");
		ts.add("pune");
		ts.add("Agra");
		ts.add("chennai");
	
		System.out.println(ts);

	}
//Output: [Agra, chennai, kolkata, madras, mumbai, pune] 
	     // it sorting by default to element 
}
//   for desc Order :  [pune, mumbai, madras, kolkata, chennai, Agra]  // see logic in MyComp class 

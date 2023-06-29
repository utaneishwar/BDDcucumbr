package collectionpractice;

import java.util.TreeMap;

public class TreeMapClassDisc {

	public static void main(String[] args) 
	{
		// TreeMap: it is  a class implement to MAP interface and it store element in which bydefault Sorting order 
		// sorting order will be apllicable Ascending for integer and Alphabetical for String Values 


		TreeMap<Integer, String> tm = new TreeMap<Integer, String>();



		tm.put(12, "pune");
		tm.put(43, "Borivali");
		tm.put(13, " Solapur");
		tm.put(14, "Chinchwad");
		tm.put(20, "pune");
		tm.put(14, "Wakad");
		tm.put(15,  null);
		tm.put(16,   null);
		System.out.println(tm);

		// output:{12=pune, 13= Solapur, 14=Wakad, 20=pune, 43=Borivali}  // bydefault maintain Asc order for integer 

	}

}

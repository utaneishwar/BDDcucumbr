package collectionpractice;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class LinkedHashMapDisc {

	public static void main(String[] args)
	{
		// 2)LinkedHashMap: it is class implement to MAP interface and its comes from Java.util package 
		// it maintain preserved Insertion order 


		LinkedHashMap<Integer, String> lhm = new LinkedHashMap<Integer, String>();


		lhm.put(12, "pune");
		lhm.put(43, "Borivali");
		lhm.put(13, "Solapur");
		lhm.put(14, "Chinchwad");
		lhm.put(20, "pune");
		lhm.put(14, "Wakad");
		lhm.put(30, "null");
		lhm.put(40, "null");

		System.out.println(lhm);

	}
	//{12=pune, 43=Borivali, 13= Solapur, 14=Wakad, 20=pune}  // preserved insertion order 

}

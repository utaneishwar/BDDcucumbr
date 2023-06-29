package collectionpractice;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Spliterator;

public class HashSetDisc
{



	public static void main(String[] args)
	{  //HashSet : it is a class implementing by Set interface
		// it is not allowed duplicate value and Insertion order is not preserved
		// it can accept  null value but once

		HashSet < String> hs = new HashSet<String >();	

		hs.add("Mumbai");
		hs.add("Kolkata");
		hs.add("Chennai");
		hs.add("Agra");
		hs.add("Delhi");
		hs.add("Kanpur");
		hs.add("Mumbai");
		hs.add("null");

		hs.add("null");
		System.out.println(hs);




		// This is an Example of String is immutable

		String []str = new String [hs.size()];   // new Array create 
		hs.toArray(str);               // convert HashSet to array 
		for( String array: str)                   // iterate 
		{
			System.out.println(array);
		}




	}

}

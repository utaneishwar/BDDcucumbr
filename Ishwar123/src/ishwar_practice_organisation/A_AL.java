package ishwar_practice_organisation;

import java.util.ArrayList;
import java.util.Arrays;

public class A_AL {

	public static void main(String[] args) 
	{
		String []s = {"Avinash","vivek","ishwar"} ;
//		for(String m:s)               // its mandatory for convertion 
//		{
//			System.out.println(m);
//		}
		ArrayList<String> al = new ArrayList<>(Arrays.asList(s));
		System.out.println(al);
		
		
	}

}

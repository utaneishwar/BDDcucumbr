package ishwar_practice_organisation;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayToArraylist {

	public static void main(String[] args) 
	{
	

		String [] s = { "virendra","Sachin","rohit","rohit","Sachin"} ;
      ArrayList<String> al= new ArrayList<String>(Arrays.asList(s));
      
     System.out.println(al);
      
	}

}

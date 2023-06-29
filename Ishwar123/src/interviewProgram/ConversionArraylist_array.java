package interviewProgram;

import java.util.ArrayList;

public class ConversionArraylist_array {

	public static void main(String[] args) 
	{
		
		ArrayList<String> s =new ArrayList<String>();
		
		s.add("kamal");
		s.add("please");
		s.add("come");
		s.add("here");
		s.add("here");
		System.out.println(s);
		
		//String []ne =new String[s.size()];  // here not use but we can add in that new Array values from s arraylist
		
		for(String f:s)
		{
			System.out.println(f);
		}
		
	}

}

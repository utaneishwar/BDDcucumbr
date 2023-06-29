package interviewProgram;

import java.util.ArrayList;

public class mergeTwoCollection {

	public static void main(String[] args)
	{
		ArrayList<String> a = new ArrayList<String>();
		
		a.add("kishor");
		a.add("utane");
		
		ArrayList<String>b=new ArrayList<String>();
		b.add("aditya");
		b.add("utane");
		
		a.addAll(b);
		
		String []c=new String[a.size()];
		a.toArray(c);
		for(String d:c)
		{
			System.out.println(d);
		}
		
	}

}

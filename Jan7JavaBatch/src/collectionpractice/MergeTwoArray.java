package collectionpractice;

import java.util.ArrayList;

public class MergeTwoArray {

	public static void main(String[] args) 
	{

		ArrayList<String> ar1=new ArrayList<String>();	

		ArrayList<String> ar2=new ArrayList<String>();	


		ar1.add("Ishwar");
		ar1.add("utane");


		ar2.add("kunal");
		ar2.add("bhusari");

		ar1.addAll(ar2);

		String[] ar3=new String [ar1.size()];
		ar1.toArray(ar3); 
		for(String e:ar3)
		{
			System.out.println(e);
		}




	}

}

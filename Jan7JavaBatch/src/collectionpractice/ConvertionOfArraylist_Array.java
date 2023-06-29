package collectionpractice;

import java.util.ArrayList;

public class ConvertionOfArraylist_Array
{
	//Collection 
	// Conversion of ArrayList  into Array 


	public static void main(String[] args) 
	{


		ArrayList<Integer> al =new ArrayList<Integer>();

		al.add(80);
		al.add(90);
		al.add(12);
		al.add(30);
		al.add(8);
		Integer[] a =new Integer [al.size()];

		al.toArray(a)  ;      // this  method is used to copy the content from arraylist to array 

		for(int aa:a)         //for(Integer aa:a);  we can write also
		{  
			System.out.println(aa);
		}

	}
}
//OutPut
//80
//90
//12
//30
//8

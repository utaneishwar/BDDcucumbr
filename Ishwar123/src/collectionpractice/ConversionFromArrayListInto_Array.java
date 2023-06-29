package collectionpractice;

import java.util.ArrayList;
import java.util.Arrays;

public class ConversionFromArrayListInto_Array
{

	//Conversion of Array  into ArrayList 
	public static void main(String[] args) 
	{
		String [] S= new String [5];
		S[0] = "one";
		S[1] = "Two";
		S[2] = "Three";
		S[3] = "Four";
		S[4] = "Five";
	
		ArrayList<String> al =new ArrayList<String>(Arrays.asList(S));
		System.out.println(al);
		
		
	}

}   
               //Output: [one, Two, Three, Four, Five] 

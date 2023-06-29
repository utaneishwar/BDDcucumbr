package stringclass;

public class AssgRemoveDigitsFromString {

	public static void main(String[] args)
	{
		// Remove all the digits from the string 

		String s = " He2l3l63o";

		String m=s.replaceAll("[^A-za-z]", "");

		System.out.println(m);         // Hello

	}  



}



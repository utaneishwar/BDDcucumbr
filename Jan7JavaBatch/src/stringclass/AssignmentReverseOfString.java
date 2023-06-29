package stringclass;

public class AssignmentReverseOfString {

	public static void main(String[] args)
	{
     // 2) WAP TO PRINT THE REVERSE OF A STRING
		
		String rev = " ";
		String s = "DEHRADUN";
		int s1= s.length();     // for define length.
		
		for (int i=s1-1; i>=0; i--)
		{
		char ch  =s.charAt(i);
			rev = rev +ch ;      // rev char stored in variable
		}
		System.out.println(rev);  

	}

}

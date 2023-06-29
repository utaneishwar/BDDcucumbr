package stringclass;

public class AssiReverseIndividualWords {

	public static void main(String[] args) 
	{
		// WAP to print the reverse a string without reverse the individual words 
		// " THIS IS STRING "
	
		 String s = "THIS IS STRING";
		 String[]s1 = s.split(" ");
		 
			for ( int i=s1.length-1; i>=0; i-- )
			{
				
				System.out.print(s1[i]+" ");     // STRING IS THIS
			}
         }

}

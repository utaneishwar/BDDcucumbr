package stringclass;

public class AssignRemoveExtraSpace {

	public static void main(String[] args)
	{

		//WAP to Remove the extra spaces from the String 
		// "This      is        String"


		String s1="";

		String s = "This    is    String     of    this class";

		for(int i=0; i<s.length(); i++)
		{

			if (s.charAt(i)==' ' && s.charAt(i+1)==' ')   // it is for _ _  //skip
			{  
				continue;
			}
			else 
			{

				s1= s1+s.charAt(i);    //   _ char  //like that condition then print  
			}


		} 
		System.out.println(s1);









	}
}



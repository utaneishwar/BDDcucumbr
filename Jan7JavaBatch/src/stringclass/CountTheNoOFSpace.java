package stringclass;

public class CountTheNoOFSpace {

	public static void main(String[] args)
	{
		String s= "very Good morning Gaurav sir";

		int count=0;
		for(int i=0; i<s.length(); i++)
		{
			if(!(Character.isAlphabetic(s.charAt(i)))	)
			{

				count++;
			}
		}
		System.out.println(count);


	}

}

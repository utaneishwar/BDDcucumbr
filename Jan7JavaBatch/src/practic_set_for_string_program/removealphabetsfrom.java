package practic_set_for_string_program;

public class removealphabetsfrom 
{

	public static void main(String[] args) 
	{
		String s =" ish234war";
		
		for(int i=0; i<s.length(); i++)
		{
			if(!(Character.isAlphabetic(s.charAt(i))))
			{
			  System.out.print(s.charAt(i));	
			}
		}
	
		

	}

}

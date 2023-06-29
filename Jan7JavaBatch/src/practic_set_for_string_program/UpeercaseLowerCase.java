package practic_set_for_string_program;

public class UpeercaseLowerCase {

	public static void main(String[] args)
	{	
	
		
		
		String name = "IDSUdguuDGUhhsABC";
	
	
	
	int uppercase=0;
	int lowercase=0;
	for(int i=0; i<name.length(); i++)
	{
		
		   char ch=name.charAt(i);
		if(Character.isUpperCase(ch))
		{
		uppercase++;
		}
		else if(Character.isLowerCase(ch))
		{
			lowercase++;	
		}
	}
	
	
	System.out.println("uppercase="+uppercase+" lowercase="+lowercase);
	}

}

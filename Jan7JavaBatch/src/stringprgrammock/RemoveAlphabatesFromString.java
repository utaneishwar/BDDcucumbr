package stringprgrammock;

public class RemoveAlphabatesFromString {

	public static void main(String[] args) 
	{
		String s ="k23an45ak2a1";
		String ch = s.replaceAll("[0-9]", "");
		System.out.println(ch);
		String b = "";
		int a =0;
		
		for(int i=0; i<s.length(); i++)
		{
			
			if((Character.isDigit(s.charAt(i))))
			{
				b= b+s.charAt(i);
			}
			
			
		}
		    a=Integer.parseInt(b);
		System.out.println(a+2+5);

	}

}

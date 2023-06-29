package stringclass;

public class WithoutUsingLength {

	public static void main(String[] args) 
	{
		
		
		String s = "Good morning mangesh sir";
		int count = 0;
		     char[] chararr = s.toCharArray();
		      
		for(char c:chararr)
		{
		 count++;
		}
		System.out.println(count);
		
	}

}

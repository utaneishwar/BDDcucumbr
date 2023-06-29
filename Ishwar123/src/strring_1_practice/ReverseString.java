package strring_1_practice;

public class ReverseString {

	public static void main(String[] args)
	{
		String s = "Vaibhav";
           
		for(int i=s.length()-1; i>=0; i--)
		{
		        char cha = s.charAt(i);
		       
		       System.out.print(cha);
		}
	}

}

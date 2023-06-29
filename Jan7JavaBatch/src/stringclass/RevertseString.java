package stringclass;

public class RevertseString {

	public static void main(String[] args)
	{
		String s="Nayan";
		String val="";
		
		
		for(int i=s.length()-1; i>=0; i--)
		{
		   char cha = s.charAt(i);
		     val=val+cha;
		}
		System.out.println(val);
		
	}

}

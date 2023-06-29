package stringclass;

public class ExtraSpaceRemoveFromString {

	public static void main(String[] args)
	{
		String s="Good    morning      Sir     ";
		
		String s1="";
		
		for(int i=0; i<s.length()-1; i++)
		{
			if(s.charAt(i)==' ' && s.charAt(i+1)==' ')
			{
				continue;
			}
			else
			{
				s1=s1+s.charAt(i);
			}
		}
			System.out.println(s1);
			
			
	

	}

}

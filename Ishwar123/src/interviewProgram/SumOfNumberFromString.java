package interviewProgram;

public class SumOfNumberFromString {

	public static void main(String[] args)
	{
		String s="qwerty4uiop15asdfg16gjkl5";
		String num="";
		boolean flag=false;
		int add =0;
		for(int i=0; i<s.length(); i++)
		{
			
			if(Character.isDigit(s.charAt(i)))
			{ 
				flag=true;
			    num =num+s.charAt(i);
				if(i!=s.length()-1 )
				{
					continue;
				}
			}
			if(flag)
			{
				 int value = Integer.parseInt(num);
				 add = add+value;
				 flag=false;
				 num="";
			}
		}
		System.out.println(add);

	}

}

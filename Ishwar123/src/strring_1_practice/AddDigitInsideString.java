package strring_1_practice;

public class AddDigitInsideString 
{

	public static void main(String[] args)
	{
		String s ="bkv12rggg8hgg30jhvu";
		boolean flag=false;
		String num="";

		int add =0; 
		for(int i=0; i<=s.length()-1; i++ )
		{
			if(Character.isDigit(s.charAt(i)))
			{
				flag=true;
				num=num +s.charAt(i);
				if(i!=s.length())
				{
					continue;
				}

			}
		}
		if(flag)
		{
			int value = Integer.parseInt(num);
			add =add+value;
			flag=false;
			num="";
		}
	}
}



		

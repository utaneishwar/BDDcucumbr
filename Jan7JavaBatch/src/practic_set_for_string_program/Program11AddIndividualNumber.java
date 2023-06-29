package practic_set_for_string_program;

public class Program11AddIndividualNumber
{

	public static void main(String[] args) 
	{
		String s =" 3dj4dnk5dn2";
		
		String num= "";
		   int sum=0;
		for(int i=0; i<s.length(); i++)
		{
			  char ch  = s.charAt(i);
			
		  if(Character.isDigit(ch))
		  {
			    num=num+ch;             // value in Char format
			  
			  int value = Integer.parseInt(num);
			  
			  sum =sum+value;
			 
			  
			  num= "";
		  }
    }
		System.out.println(sum);  // 14
		
		
		

	}

}

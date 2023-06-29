package practic_set_for_string_program;

public class Program3CountACharacterFromString 


{

	public static void main(String[] args)
	{
     // 3. WAP to count the number of occurrence of a single character in a String:
		
		String s = "abcdefabcdef";
		
		int count = 0;
		
		
		for(int i=0; i<s.length(); i++)
		{
		   char ch=s.charAt(i);
		   if(ch=='b')             
		   {
			  count= count+1;
		   }
		}
		System.out.println(count);   // 2 
	}

}

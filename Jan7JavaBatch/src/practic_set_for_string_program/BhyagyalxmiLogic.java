package practic_set_for_string_program;

public class BhyagyalxmiLogic 
{

	
	
	
public static void main(String[] args) 
{
	
	
		String s= "apple is good";
		
		char[] c = s.toCharArray();
		
		
		for(int i=0;i<s.length();i++)
		{
		
			
		for(int j=i+1;j<s.length();j++)

			
       {
				if((c[i]==c[j]))
					
				{
					
				System.out.print(c[j] +" ");	
				break;
				}
				
	
			}
			
		}
		
	}
	





}

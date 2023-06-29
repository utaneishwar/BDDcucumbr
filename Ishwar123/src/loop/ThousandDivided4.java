package loop;

public class ThousandDivided4 {

	public static void main(String[] args) 
	{
		for ( int a = 1; a<=1000; a++)
		{
		 
			while(a%4==0)
			{
				System.out.println(a);  // if the condition true then get number 
				a++;
			}
			System.out.println(" ");    // if the condition false then get this execution
		}
		
		
	}

}

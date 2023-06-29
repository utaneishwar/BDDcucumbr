package loop;

public class WapDescOrder {

	public static void main(String[] args)
	{
        // WAP to display following pattern
		//   *
		//   **
		//   ***
		//   ****
		//   *****
		for (int a = 1;  a<=5; a++) 
		{
			
			for(int b = 1; b<=a;  b++) 
			{
				System.out.print(" * ");
             }
			System.out.println(" ");
		}
		
		
		
	}

}

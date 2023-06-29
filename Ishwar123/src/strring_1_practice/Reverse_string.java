package strring_1_practice;

public class Reverse_string {

	public static void main(String[] args)
	{
		String s= "Nayan";
	    int len = s.length();
		for(int i=len-1; i>=0; i--)
		{
			 char ne = s.charAt(i);
		    System.out.print(" "+ne);
		}
	

	}

}

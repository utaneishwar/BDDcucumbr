package loop;

public class FibnocciesSeries {

	public static void main(String[] args)
	{

		int a=0,b=1;
		System.out.println(a+"_"+b);
		int c;
		for (int i=0; i<=10; i++)
		{  
			c = a+b;
			System.out.println(" "+c);
			a=b;
			b=c;
		}
	}
}

package collectionpractice;


import java.util.ArrayList;
import java.util.Arrays;

public class Amol 
{

	public static void main(String[] args) 
	{


		String [] str = { "Saurav" , "virendra","virendra","sachin","dhoni","sachin"};


		ArrayList<String> al =new ArrayList<String>(); 
		ArrayList<String> al1 =new ArrayList<String>(); 


		for(int i=0; i<str.length; i++ )
		{

			if(!(al.contains(str[i])))
			{
				al.add(str[i]);
			}
			else 
			{
				al1.add(str[i]) ;

			}

		}
		System.out.println(al);
		System.out.println(al1);

	}
}

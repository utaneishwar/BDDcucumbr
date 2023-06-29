package practic_set_for_string_program;

import java.util.ArrayList;

public class Program6_removeTheDuplicateFromString 
{

	public static void main(String[] args) 
	{
		//6. WAP to remove duplicate characters from String:
		
		
		   String s = "abcdefabcdef";
		
		   char[] a =s.toCharArray();
		   
		   ArrayList<Character> al = new ArrayList<Character>();
		   
		   for(int i=0; i<a.length; i++)
		   {
			 if( al.contains(a[i]))
			 {
				 
			 }  
			 else
			 {
				 al.add(a[i]);
			 }
			   
		   }
		   System.out.println(al);
 // output: [a, b, c, d, e, f]   // remove duplicate  from String
	}

}

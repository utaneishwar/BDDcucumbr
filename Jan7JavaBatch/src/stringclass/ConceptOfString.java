package stringclass;

public class ConceptOfString 
{

	public static void main(String[] args) 
	{
	String s2 = new String ("abc");
	String s3 = new String ("def");
	
	String s4 = new String ("abc");
	String s5 = new String ("xyz");
	
	 String s6 = "wxy";
	 String s1 = "abc";           // suppose object A
	 String s7 = "abc";           // It will also from object A

	 // To verify Strings are pointing to the same object or not.
	 
	 boolean ispointingsame = s1==s7;    // s1 andf s7 from same object so thats why it will give true .
	 System.out.println(ispointingsame);
	 

	boolean ispointingsame2 = s2==s1;  // s1 and s2  will not from same object so thats why it will give false
	 
	 System.out.println(ispointingsame2);
	 
	 boolean ispointingsame3 = s2==s4;    
	 System.out.println( ispointingsame3);  // FALSE : because not belong from object 
	
// Equalize the  method which check contents which is inside a String class.
	 
	 boolean iscontentsame = s2.equals(s4);
	 System.out.println(iscontentsame);       
	 
	 
	 
	}

}

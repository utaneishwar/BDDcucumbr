package stringclass;

public class MethodFromStringClass
{  //MIMP
	// in this class we discussed methods which is inside in  String class.
	// 1) length ()           2) charAt(int index) 
    // 3) equals(string s)    4) equalIgnoreCase (String s);  5) toLowerCase();
	
	public static void main(String[] args) 
	{
	// 1) length() : it is method inside a string class it will returns int value which is equal to NO. of character present inside string 
		
		String s1 = "pune";
		int countofchar = s1.length();
		System.out.println(countofchar);  // 4

	// 2) charAt( int index) : it is method and it will return character at a specified positio.
		
		String s2 = "mumbai";
		char c = s2.charAt(2);
		System.out.println(c);    // m and remember that index position start from 0(zero)
		
		
	// 3) equals (String s)	: this method return true if the content of two string are identical(exact same) otherwise it will return false
		
		String s3 = "pune";
		String s4 = "pune";
		boolean b = s3.equals(s4);
		System.out.println(b);  // true if we take space then it will return false 
		
	// 4) equalIgnoreCase(String s ) : this method return true if content of both the string are equal.\
		
		String s5 = "pune";
		String s6 = "puNE";
		boolean d = s5.equalsIgnoreCase(s6);
		System.out.println(d);   // true only check content 
		
	// 5) toLowerCase(): this method return a string which as all the character in " LOWERCASE" 
		
		String s7 = "cheNNAI";
	String s8=s7.toLowerCase();
		System.out.println(s8);  // chennai
		
	// toUpperCase():  this method return a string which is all the character in "UPPERCASE"
		
		String s9 = "chandrapur";
		String s10= s9.toUpperCase();
		System.out.println(s10);
		
		
		
		
		
		
		
		
		
		
		
	}

}

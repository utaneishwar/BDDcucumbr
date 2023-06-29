package stringclass;

public class MethodFromStringcClass1 
{

	public static void main(String[] args)
	{
	// 7) SubString ( int index) :
		// it will returns a String based on the index position from which it starts with
		String s11 = "Hyderabad";
		String s12 = s11.substring(2);
		System.out.println(s12);  // derabad
		
		
		// 8) SubString ( int begin,int end) :
 // it will returns a String based on the begin index and end index position by providing value 
	String s13 = "Hamirpur";
	String s14 = s13.substring(1,5);
	System.out.println(s14);       //amir
					
	// 9) replace ( char old, char new);
	// it will returns String in which old char replace by the new char
	
	String s15 = "abcdaf ";
		
	String s16 = s15.replace("a","x");
	System.out.println(s16);   // xbcdxf
	
	 				
 // 10) replace ( String old, String new);
 // it will returns String in which old String replace by the new String 
	
	String s17 = "Ahemedcity ";
		
	String s18 = s17.replace("city","nagar");
	System.out.println(s18);      // Ahemednagar.
	
	// 11) trim ();
// it will returns String value in which the remove the space which is avialable 
	// at start and end but not able to remove  in between the string.
	
	String s19 = "     This is my   book      ";
	String s20 = s19.trim();
	System.out.println(s20);  // this is my    book.
	
	
	// 12) indexOf(char c): 
	//this method returns index position of character present inside the String in wich it appears for the first time
	
	
	String s21 = "mannipuram";
	int s22 = s21.indexOf('n');   // it will return index position char present in  first time 
	System.out.println(s22);   // 2
	
	
	// 13) split():
	
	// this method returns an array based which is created based that  value provided  to String argument.
	
	String s23= " this is my book ";
    String[] s24 = s23.split(" ") ;        // we can provide i also and on that basis partiate elements 
	
	for(String s25:s24)
	{
		System.out.println(s25);  // we will get output in the form of elements like this, is,my,book
		
	}
	//----------------------------------------------------------------------------
	// 14) StartsWith(String s)
	// It will returns boolean value which is based on provided String if it is StartsWith same otherwise  will get false
	String s26 = "HANUMANJI";
	boolean s27 = s26.startsWith("HANU");
	System.out.println(s27);  // true because starts with same value 
	
	
	// 15)  endssWith(String s)
	// It will returns boolean value which is based on provided String if it is endswith  same otherwise  will get false
	String s28 = "HANUMANJI";
	boolean s29 = s28.endsWith("JI");  // if we take ji (small) will get false
	System.out.println(s29);  // true because ends with same value 
	
	// 16) toCharArray():
	// it returns an array of character of the given string
	
	String s41= "ishwar";
   char []s42=s41.toCharArray();
   for(int z=0; z<s42.length; z++) 
   {
	   System.out.println(s42[z]);  // i,s,h,w,a,r /// it will return char in single form that means convert String---char
	}
	
   // 17) isAlphabet(): it returns a true if the given characater is alphabets 
   // "character" have compulsorily 
   
   char s43 = 'a';
   boolean isalphabet= Character.isAlphabetic(s43);
   System.out.println(isalphabet);  // true
   
   // 18) isDigit(): it returns a true if the given characater is Digit
   // "character" have compulsorily 
   
   char s44 = '7';
   boolean isDigit= Character.isDigit(s44);
   System.out.println(isDigit);    // true
   
   
   
   
	//-----------------------------------------------------------------
	// CONVERTING PRIMITIVE INTO NONPRIMITIVE DATA TYPES :
	// we can use String.valueOf(primitive datatype);
	
	int i=80;
	String s30=String.valueOf(i);
	System.out.println(s30);       // 80  // s30 value convert will in the nonprimitive datattype (String)
	System.out.println(s30+2);     //802
	
	char t = 'p';
	String s31= String.valueOf(t);   
	System.out.println(s31);     // p
	System.out.println(s31+2);   // p2
	
	
	
	
	//------------------------------------------------------------------------------
	// CONVERTING NONPRIMITIVE INTO PRIMITIVE DATA TYPE
	  // by using wrapper class:   Wrapper_Class.parsexxx();// xxx-ptrimitive datatype
	// wrapper class: it is nuthing but a class it represent primitive data type in terms of object
	// like char--Character,   int ---Integer ,  exa-121 reverse also 121 that is called as wrapper class
	
	
	String s35= "10";
	int s36= Integer.parseInt(s35);
	System.out.println(s36);       //  10   // it will get in primitive datatype (int)
	System.out.println(s36+10);     // 30
	
   String s37= " 53.26 ";
   double s38= Double.parseDouble(s37);
   System.out.println(s38);          // 56.23 /// double primitive datatype
	
	
	
	
	
	
	
	

}}

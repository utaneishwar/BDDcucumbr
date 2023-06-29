package practic_set_for_string_program;

public class SetStringAssignment {

	public static void main(String[] args)
	{
//1. Write a program to reverse a String
		String s0="rawhsI";
		int r= s0.length();                  
		
		String rev = "";
		for(int i=r-1;i>=0;i--)
		{
			char ch = s0.charAt(i);
	           rev=rev+ch;
			
		}
		System.out.println(rev);  //Ishwar
		

		
//2. Write a program to add the integers available in the string:
		
		
//3. WAP to count the number of occurrence(present)of a single character in a String:
		
		
//4. WAP to count the number of occurrence of characters in a String:	
		
		
		
// 5. WAP to count a pattern to be available in a given String	
		

		  
//7. WAP to remove the duplicate character from String and represent the character 
//count next to it e.g. abcdefabcdef--- expected output a2b2c2d2e2f2	  
			
			      
		  
		  
//9. WAP to remove the alphabets from the String
		  
		String s5 = "is1hw2a3r4";
		String x1 = s5.replaceAll("[a-z]","");
		  System.out.println(x1);              // 1234
	
//10. WAP to remove the numbers from the String	 
		String x2 = s5.replaceAll("[0-9]", "");
		  
		  System.out.println(x2);             //  ishwar 
		  
		  
  // 11. WAP to add all the number individually from the String
 //for example if the string is “ab5ds51s2” then output should be 5+5+1+2 = 13
	
	  String str = "ab5ds51s2";
	  String number=str.replaceAll("[a-z]", "");
	   String[]x =number.split("");
	   
	   int q=0;
	  
	   
	   for(String w:x)
	    {
          int i3 = Integer.parseInt(w);  // 5,5,1,2
    	        q=q+i3;
         }
    	  System.out.println(q);       //13
         }
	 }
package stringclass;

public class RegularExpressionRegex {

	public static void main(String[] args) 
	{// Regular Expression 
		//19) replaceAll(String Regex)
		
		String s45 = "Spring";
		String s46 = s45.replaceAll("[A-Z]", "a");
		System.out.println(s46);                        //   apring
		
		
		

		String s47 = "Spring";
		String s48 = s47.replaceAll("[A-D]", "a");
		System.out.println(s48);                        //   spring
		
		
		String s49= "Houston";
		String s50= s49.replaceAll("[a-z]", "q");
		System.out.println(s50);                       // Hqqqqqq
		
		
		String s51= "Spring";
		String s52= s51.replaceAll("[A-Za-k]", "!");
		System.out.println(s52);                      // !pr!n!
		
		
		String s53= "ta!m1p4a";
		String s54=s53.replaceAll("[^a-z]", "");
		System.out.println(s54);                      // tampa
		String s55=s53.replaceAll("[^!,^1,^4]","");    
		System.out.println(s55);                       //// !14
		
		

	}

}

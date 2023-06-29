package stringclass;

public class StringPractice {

	public static void main(String[] args)
	{
		// method in String Class
		String s = "punemahanagarpalika";
	int i =	s.length();			
	 System.out.println(i);	    // 18
	 
	 String s1 = "mathura";
	char s2 =s1.charAt(2);
	 System.out.println(s2);     // t       
	   
	 String s3=  "PUNA";
	String s4 = "pune";
	boolean b = s3.equals(s4);
		System.out.println(b);     //   true    //required exactly same 
		
		String s5= "pune";
		String s6= "puNE";
		boolean b1= s5.equalsIgnoreCase(s6);
		System.out.println(b1);    //   true   //   inthis ignore uppercase,loweecase
		 
	String s7= "CHENNAI";
	String s8=s7.toLowerCase();
	System.out.println(s8);           // chennai
	
	String s9=s7.toUpperCase();
	System.out.println(s9);           // CHENAI
	
	
	String s10= "Hyederabad";
	
	String s11 = s10.substring(4);
	System.out.println(s11);            // erabad
	
	String s12 = s10.substring(1,5);
	System.out.println(s12);	    //   yeder
			
		
		String s13= "million";
		String s14=s13.replace('l', 'x');
		System.out.println(s14);             // maxxon
			
			
		
		String s15= "punemahanagar";
		String s18=s15.replace("nagar","city");   // take care of double cote
		System.out.println(s18);               // Punemahacity
		
		
		
	     String s16= "   This         is  String      " ;  
		   String s17=s16.trim();
		   System.out.println(s17);  //   This is String
		   
		   
	String s19 = "SmritiMandhana";
	int  s20=s19.indexOf('m');
	System.out.println(s20);    // it give only first time
	
//----------------------------------------------------------	
	// split concept 
	
	String s21= "my name is Ishwar";
	String s22[]= s21.split("i");       // its totally depends on argument whatever we will passed and extract extract array on the basis of argument
	
	System.out.println(s22[1]);          // s Ishwar
	
	String s24[]= s21.split("Ishwar");  
	   
	System.out.println(s24[0]);          // for understanding purpose|| ans-my name is 
	
	
	for(String s23:s22)
	{
		System.out.println(s23);      //0) my name   // given in String  Array Format like my(0),name(1),is(2),ishwar(3)
	}                                  //1)s Ishwar 
	//--------------------------------------------------------------
	
		   
		  
		   String s25 = "maharashtra";
		  boolean s26= s25.startsWith("maha");
		   
		  System.out.println(s26);      // false because space in" maha"
		   
	     boolean s27= s25.endsWith("rashtra");   
		   
		  System.out.println(s27);      // true because ends with "rashtra"
		   
		System.out.println("***************this is for tochar **************"); 
		  

            String s28="shalikrao";
		  
		  char []s29 = s28.toCharArray();
		  System.out.println(s29[0]);             // s
		
			 for(int i1=0; i1<s28.length(); i1++)
			 {
				 System.out.println(s29[i1]);   // s,h,a,l,i,k,r,a,o
			 }
			 
			 
			 
			 System.out.println("***********************************8");
// -----------------------------------------		
	// character.		 
	char s30='a';
	 
	 boolean s31= Character.isAlphabetic(s30);
			
		System.out.println(s31);	//  true  // it is match with alphabet 
			 
		 
	     char s32 ='7';     // when we take int and digit in single cot it will give true but digit take in without it will give false
		 boolean s33= Character.isDigit(s32);
				
			System.out.println(s33);	//  true  // it is match with alphabet 
				 
					 	 
	System.out.println(" ********************************************** ");		 
		
	// 1)converting datatype primitive to non primitive and its apposit .		 
	// String.vallueOf();
        float z = 10.23f;  
	    String s34= String.valueOf(z); 
		 System.out.println(s34);      // 10.23  but its will be String type
		 System.out.println(s34+12);  //10.2312   cocat value
		 
		 
		 boolean z1 = false;  // we can take any datatype
		    String s35= String.valueOf(z1); 
			 System.out.println(s35);      // false  but its will be String type
			 System.out.println(s35+12);  //false12
			 
		 
	//2) apposite :nonprimitive to primitive 
		 // we have to use wrapper class
			 // syntax Wrapper_class.Parsexxx();      // xxx- it will be primitive datatype
	   String v= "80" ;	
			int v1 = Integer.parseInt(v);
		System.out.println(v1);	           // 80  but it will be int primitive datatype  
		
		
		
		String w = "10.23";
		float w1 =Float.parseFloat(w);
		System.out.println(w1);	     // 10.23 but it will be float type 
		                              // means converting from nonprimitive to Primitive 
		
System.out.println(" ************Regular Expression(String Regex*******************88888");	
	// replaceAll 

        String s36 = "Mahadev";
      String s37=  s36.replaceAll("[M-Z]", "x");
		System.out.println(s37);                // xahadev
		
		
		 String s38 = "Mahadev";
	      String s39=  s38.replaceAll("[a-z]", "x");
			System.out.println(s39);                // Mxxxxxx
			
		String s40= "HouseHolder";
		
		String s41=s40.replaceAll("[A-za-z]", "*");
		
		System.out.println(s41);                // ***********
		
		String s42= "Z1am32p5a";
		String s43=s42.replaceAll("[^A-za-z]", "");
		System.out.println(s43);  //zampa
			
			String s44= "Ac$21ce!nt3u$re";
		String s45=	s44.replaceAll("[A-za-z0-9]","");
		
		System.out.println(s45);  // $!$.
			
		System.out.println("________________________");
	

}
	}

package stringclass;

public class STRINGCLASSPRACTICE {

	public static void main(String[] args)
	{
      //1)length():
		
		String b = "Bhadrawati";
		 int i1 = b.length();
		
		System.out.println(i1);  // 10
		
		
		
		//2) charA(int index):
		String b1="Bhadrawati";
		char i2 = b1.charAt(7);
		
		System.out.println(i2);    // a
		
		
		//3)equal(String);
		String b2 = "Bhadrawati";
		String b3 = "Bhadrawati";
        boolean i3 = b2.equals(b3);
		System.out.println(i3);   // false
		
		
		//4)equalignorecase(String):
		
		String b4 = "Bhadrawati";
        String b5 = "bHADRawati";
        boolean i4 = b4.equalsIgnoreCase(b5);
        System.out.println(i4);
        
        
        //5) toLowerCase():
        String b6 = "BhadraWATI";
        String i5 = b6.toLowerCase();
        		
        System.out.println(i5);   // bhadrawati

        
        
        //6) toUpperCase():
        String b7 = "BhadraWATI";
        String i6 = b7.toUpperCase();
        		
        System.out.println(i6);   // BHADRAWATI

        
        // 7) SubString(int,):
        String b8="Bhdrawati";
        String i7 = b8.substring(2);
        
        System.out.println(i7);     // drawati
        
        
        //8) Substring(intbegin,intend)
        String b9="Bhadrawati";
        CharSequence i8 = b9.subSequence(0, 6);
        System.out.println(i8);         // bhadra
         String i9 = b9.substring(0, 3);
        System.out.println(i9);       // bha   // charseq and String both are same
	
	    //9) Replace(charold,charnew)
             String b10="Bhadrawati";
           String i10 = b10.replace('a', 'x');
	       System.out.println(i10);      // Bhxdrxwxti
	
	       //10) Replace(oldString, newString)
	       
           String b11="Bhadrawati";
         String i11 = b10.replace("Bhadra", "Bhandak");
	       System.out.println(i11);       // BhandakWati
	
	   // 11)  trim 
		      String b12= "    Bhadra   wati    " ;  
			   String  i12 =b12.trim();
			   System.out.println(i12);          // Bhadra   wati 
			   
	
	   // 12) Indexof
			   
			   String b13 = "Bhadrawati";
	           int i13 = b13.indexOf('a');
	            System.out.println( i13);           // 2
	
	      // 13)  Split: return StringArray
	            String b14="Bhadrawati";
	            String[] i14 = b14.split("d");
	            
	           System.out.println(i14[0]);      // Bha
	           System.out.println(i14[1]);       //rawati
	
	      // 14) startsWith
	           
	        String b15 = "Bhadrawati";
	        boolean i15 = b15.startsWith("Bha");
	          System.out.println(i15);    // true
	
	
	       // 15) startsWith
	           
		        String b16 = "Bhadrawati";
		        boolean i16 = b16.endsWith("wati");
		        System.out.println(i16);    // true 
		
		   // 16)toharArray  :return String to char 
		        
		        String b17="Bhadrawati";
		       char[] i17 = b17.toCharArray();
	             System.out.println(i17[4]);    //r we can take multiple char by using for loop
	            for(int i=0;i<b17.length();i++)
	            {
	            	System.out.println(i17);     // B,d,r,a,w,a,t,i
	             }
	
	         // 17)  isAlphabetic or isDigit
	            char x = 'm';
	            boolean i18 = Character.isAlphabetic(x);
	            System.out.println(i18);                  // true
	           
	            char x1 ='1';
	            boolean i19 = Character.isDigit(x1); 
	            System.out.println(i19);                     //true
	
	            // note This all about operation  ofString method inside in StringClass 
	              System.out.println("#####################################");
	     
	 // Converting primitive datatype into Non-primitive datatype           
	       //1) StringValueOf
	              
	              int y= 10;
	             String y1= String.valueOf(y);
	             System.out.println(y1);
	                                          //  10/// 10//but it will be Stringt5ype
	          System.out.println(y1+2);        //102
	
	          //nonprimitive to primitive datatype.   
	          //synntax: wrapper_class.ParseXXX();
	          //wrapper class:  IT  IS A CLASS WHICH REPRESENT PRIMITIVE DATATYPE IN TERMS OF OBJECT
	            
	           String y2="10";
	      
	     
	      int y3 = Integer.parseInt(y2);
	    System.out.println(y3);     // 10  but this value in converting String (primitive)datatype
	        		
	        System.out.println(y3+5);   // 15    //here  add  value		
	        		
	        		
	       //replaceAll();
	        
	        
	        String c="Bhadrawati";
	        String d1 = c.replaceAll("[a-d]", "x");
	        System.out.println(d1);       // Bhxdrxwxti
	       // System.out.println( c.replaceAll("[a-d]", "x"));	//we can write	
	        		
	      String d2=c.replaceAll("[A-Za-k]","!");		
	        	
	        System.out.println(d2);	        // !!!!r!w!t!
	        
	        String c1="Bh1a22!d1ra!wati";
	       String d3= c1.replaceAll("[A-Za-z]", "");
	       String d4= c1.replaceAll("[!0-9]", "");           
	        System.out.println(d3);     // 122!1!
	        System.out.println(d4);  	 // Bhadrawati
//*******************************************************************
	        
	        // CASTING: conversion of one datatype into another datataype is called as casting
	        //1)primitive: convert one primitive datatype into another primitive datatype 
	                      // applicable for only numeric Datatype
	        //2) nonprimiitve :conversion of Non primitive Datatype into Another Non-primitive Datatype
	                        // 1) upcasting 2) DownCasting
	        
	        
	        
	        
	    //1) Primitive=  1)Implicit : Syntax Datatype variable=(datataype)Variable_to_convert;  smaller to bigger
	                    //2)Explicit: conversion from Higher order datatype into lower order Datatype in this datatype can be loss
	        
	        //implici casting:
	        
	                byte by=12;
	                int bc = (int)by;
	        		System.out.println(bc);  //converted int 12
	        		
	        		
	        		int i=135;
	        		long l= (long) i;
	        		System.out.println(l);    ///converted long 135
	       
	       
	        		
	        		//Explicit Casting
	        		int z = 130;
	        		byte z1=(byte)z;
	        		
	        		System.out.println(z1);    //-126 it can not conver because max value is 128 and -127
	        		                             // datatcan be loss
	        		
	//NON_PRIMITIVE:
	        		//1) UPCASTING: Conversion from child class into parent class
	        		//2)Downcasting:Conversion from Parent class to child class if we perform
	        		  //if we cannot perform directly DownCasting.
	        		
	        		
	        		
	        		
	        		
	        		
	        		
	        		
	        		
	        		
	        		
	        		
	        		
	        		
	}

}

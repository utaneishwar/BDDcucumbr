package stringclass;

public class RohanAssignmentString 
{
  // WAP To calculate the count  of character present inside String
	
	public static void main(String[] args) 
	{   
		 String i="ishwar";
		int l = i.length();
		System.out.println(l);       // with the help of length method

		// it is defined without using length method	    
	    int length=0;
		String str= "nayan";
	    char[] arr= str.toCharArray();
	    for(char cha:arr)
	   {
		     length++;
	   }
	    System.out.println(length);
			
//-----------------------------------------------------------	  
	// count the space between String        
	 String set = "I am waiting for this day";
	    int  l2= set.length();    // Total char is available in String   =25
	 
		System.out.println(l2);
		 int length1 =0;
	 String [] arr2 =set.split(" ");
		 for(String sc:arr2)
		 {
			 System.out.println(sc);      //
			 length1++;
		 }
		 System.out.println(length1);   //5 space is available in String 
		}
	//=============================================================

	 
	
	 
	
	
	
	
	
	
}

package stringclass;

public class Reverse {

	
	
	
	public static void main(String[] args)
	{
	  String s ="chamach";
	 String rev="";
	  
	  for(int i=s.length()-1; i>=0; i--)
	   {
		   char re = s.charAt(i);
		   
		   rev=rev+re;
	   }
	 
	  System.out.println(rev);
		
		
		
		

	}

}

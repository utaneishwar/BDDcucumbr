package practic_set_for_string_program;

public class ReverseString 
{
 
	
	 public static void revs()
     {
	   String s ="vishal";
		
		
		String rev="";
		
		for(int i=s.length()-1; i>=0; i--)
		{  
			char ch=s.charAt(i);
			
			rev=rev+ch;
		}
		System.out.println(rev);   // 
	    }
    
  //-----------------------------------
	public static void addrevs()
	{
		String s = "Ishjh32jggu4jf5";
		
	
		
		boolean Flag= false;
	   String number ="" ;
		
	    int sum=0; 	
		
	    
	 
	    for(int i=0; i<s.length(); i++)
		{
			char ch= s.charAt(i);
		 
			if(Character.isDigit(ch))
		  {
			  
			  Flag =true;
  	    	number= number+ch; 
			 
  	    	if(i!=s.length()-1)
			  {
				continue;  
				  
			  }
		  }
			   if(Flag)
			   {
				  int value= Integer.parseInt(number) ;
				  sum=sum+ value;    //32+4+5
				 Flag=false;
				 number="";
			   }
			  
			  
		  }
		
		
		    System.out.println(sum);
		
		
	}
	
	//--------------------------
	
	public static void CountChar() 
	{
		
		String s = "igiwgifwk";
		
		int count=0;
		
		for(int i=0; i<s.length(); i++)
	 {        
		    char ch = s.charAt (i);
			
		    if(ch=='w')
		    {
			count = count+1;
		 
		    }
		}
		System.out.println(count);
	}
	
	
	
	
	public static void main(String[] args) 
	{
	revs();
  addrevs();
  
  
  CountChar();
}
	}

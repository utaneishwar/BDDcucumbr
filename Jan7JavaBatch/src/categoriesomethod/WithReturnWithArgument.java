package categoriesomethod;

public class WithReturnWithArgument
{
  // 4. Method with Return type and with Argument
	
	public static String calc(int a , String b)
	
	{
		String d = a+b;
		
		return d;	
		
	}
	
	  public static void main(String[] args) 
	  {
		  
		String uidname = calc(80,"john")  ;
		
		String s = uidname +"california";
		System.out.println(s);   // 80johncalifornia
		  
		  
		
	}	
	
	
	
	

}

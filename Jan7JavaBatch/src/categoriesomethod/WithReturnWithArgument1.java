package categoriesomethod;

public class WithReturnWithArgument1
{
	
	public static String calc(int a ,String b)
	
	{  String d = a+b;
		
		
		return d ;
	}
	
	public void finaloutput (String s)
	
	{
	   String finalvalue = s +"state" ;
	   System.out.println(finalvalue);
		
	}	
		
		
	public static void main(String[] args)
	{
		
		String uidname = calc(80,"john");
		String s = uidname+"california";
		System.out.println(s);    // 80johncalifornia
		
		System.out.println("****************************");
		
		WithReturnWithArgument1 wrwa = new WithReturnWithArgument1();
		wrwa.finaloutput(s);    // 80johncalifornia

	}

}

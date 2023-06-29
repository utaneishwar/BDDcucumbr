package categoriesmethod;

public class Ass083
{
  // 
	public static String m1(String a,int b)
	{
		String c = a+b;
		return c;
		
	}
	
	public static void m2(int a ,String b) 
	{
		String s = a+"payal";
		System.out.println(s);
		
		
		
	}
	
	public static void main(String[] args)
	{
		String s   = m1("ishwar",10);
		
		System.out.println(s);      // ishwar10
		
		  String z = s +"kishor";    // ishwar10kishor
		System.out.println(z);        
		 
		
	}

}

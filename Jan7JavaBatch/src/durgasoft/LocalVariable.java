package durgasoft;

public class LocalVariable
{
	int x = 30;     // nonstatic or instant variable
	
	static int y = 20;  // static variable
	
	int w ;              // default value access from jvm before using local variable 
	
	
	

	public static void main(String[] args)
	{
     // Local variable is the types of variable ,which is declared in inside method,
		//block and constructor....sometome to meet temprary requirements of the programmer 
		// it is also called as local/tempropry/stack/automatic variable
		
		     int w = 40; 
		   final int x = 70;           // local variable are  fixed it is applicable only final accesmodifier
		System.out.println(w);  // if access public,protected,private...etc access modifier get an error (only (final) is applicable)
		
		int x1 = 10;
		System.out.println(y);
		
		LocalVariable z = new LocalVariable();
		System.out.println(z.x);
		
	}

}

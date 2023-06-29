package variable;

public class A 
{
// Here we practice on static variable by using static variable syntax 
	// syntax- classname.variablename
	
	static int  a = 50;
	static short b = 55;
	static float f = 23.12f;
	static String s = "my name is Ishwar";
	
	public static void main(String[] args)
	{
	System.out.println(A.a);	
	System.out.println(A.f);
    System.out.println(A.s);
    
    // calling inside class other way directly use variablename
   
    System.out.println(s);
    System.out.println(f);
    System.out.println(b);
    System.out.println(a);
    
    
    
    
    
	}

}

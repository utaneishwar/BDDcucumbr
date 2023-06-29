package polymorphism;

public class AccessmodifierOverloadedMethod 
{   // we can not say variable are  overloaded.
	//METHODLEVEL ACCESSMODIFIER OVERLOADED
	public void m1() 
	{
	System.out.println(" public nonstatic method with no argument");	
	}
	
	
	static void m1 (String s)
	{
		
		System.out.println(" default static m1 method with 1 argument");
		
	}
	
	
	
	private void m1(int a , int b)
	{
	System.out.println(" private m1 nonstatic method  with 2 argument" );	
	}
	
	
	
	protected static void  m1(String s,boolean b,int i)
	{
		System.out.println(" protected  static m1 method with 3 argument");
    }
	
// These all are the method level acccessmodifier and these are overloaded.
	
	public static void main(String[] args)
	{
		
		AccessmodifierOverloadedMethod t = new AccessmodifierOverloadedMethod ();
		
		m1("Bhalchandra",true ,10);    // protected static method 
		
		t.m1(10,20);             // private nonstatic method 
		
		m1("abc");               // default  static  method 
		t.m1();                   // public nonstatic method 
	}

}

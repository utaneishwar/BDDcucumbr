package durgasoft;

public class MethodSignature
{   //  MethodSignatuere  contain only methodname followed by argument types)
	  // return type is not matter in methodsignature
	// exa, public void m1(int i ,float f)
	
	public void m1(int i)
	{
		
	}
	public void m2(String s)
	{
	}
	public void m4(int i )
	{

	}
	public int m3 (int j )
	{
	return 10;	
	}
	
	// two similar method signature us not allowed in similar class
	  public static void main(String[] args)
	{
		
		MethodSignature t = new MethodSignature();
		
		t.m1(10);
		t.m2("durga");   //t,m3 (10.05); if we try to call this type  get error 
		t.m4(10);
	

	}

}

package accessmodifier;

public class Test4Methodlevel 
{
	//VARIABLE LEVEL ACCESSMODIFIER
	// same rules methodlevel accessmodifier are applicable for variable .
	// 1)public   2)default   3) private   4) protected
	
	   public int a = 50;
	   String s = " India";
	   private boolean b = true;
	
	// METHOD LEVEL ACCESSMODIFIER
	//there are 4 type 
	//1) public  2) <default>   3) private  4) protected
	// PUBLIC
	public void M1() 
	{
	System.out.println("public Non-static m1 method from test4 class ");	
		
	}
	
	public static void M2()
	{
		System.out.println(" public static m2 method from test4 class");
	}
	
//  <DEFAULT>
	void M3() 
	{
	System.out.println(" default nonstatioc m3 method from test4 class ");	
	}
	
	static void M4()
	{
		System.out.println(" default static m4 method from test4 class ");
	}
	
// PRIVATE - only can access within class.	
 private void M5()
 {
	System.out.println(" private M5 nonststic method from test4 class");
 }
	private static void M6()
	{
	System.out.println("private M5 ststic method from test4 class");	
	}
	
	public static void main(String[] args)
	{
		// PRIVATE 
		
		// private we can not access method from another class 
		
		Test4Methodlevel  t5 = new Test4Methodlevel ();
		  t5.M5(); // this pivate nonstatic  method from inside class is aplicable but not in another class
		  t5.M6(); // similar above statement is applicable for this.
	}
	
	
	
}

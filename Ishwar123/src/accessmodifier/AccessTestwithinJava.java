package accessmodifier;

public class AccessTestwithinJava
{
   Test t = new Test();  // this is public class  // within same package 
	
	public static void main(String[] args)
	{
	// ACCESSMODIFIER CAllING
	//	1) PUBLIC
		Test4Methodlevel t4 = new Test4Methodlevel();
		t4 .M1();
		
	// 2) DEFAULT	
		  t4.M2();
		  
	// 3) PRIVATE
	//	t4.M3();  
		  
		  
	// 4) PROTECTED
		
		  A a = new A();
		  a.M9();
		  
		
	}
}

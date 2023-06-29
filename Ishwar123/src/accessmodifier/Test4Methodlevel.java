package accessmodifier;

  public class Test4Methodlevel
{
	// METHODLEVEL ACCESSMODIFIER
	// 1) PUBLIC
	
	 public void M1()
      {
		System.out.println(" public nonstatic method"); 
	   }
	//  2) <DEFAULT>
	 void M2()
	 {
		 System.out.println(" default nonstatic method ");
	 }
	 
	 // 3) PRIVATE 
	 
	  private void m3() 
	  
	  {
		System.out.println(" Private M3 nonstatic  method  ");
		
	  }
	  
	  public static void main(String[] args)

	  {
		  Test4Methodlevel t4 = new Test4Methodlevel ();
		  t4.m3();
		  
		  
	}

}

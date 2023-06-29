package variable;

public class LocalVariable
{
	static int i = 70;      // static variable 
	    int j = 60;         // non-static variable
	    
	                           
	
	
	
	

	public static void main(String[] args)
	{
	//define  local variable 	
	//a variable which is declared in inside method ,constructor and block 
   // excape class level such type of variable called local variable
		
		
		int i = 50;            
		String s = "hello";   
		char c ='v';
		
		System.out.println(c);    // v 
		System.out.println(s);     // hello
		// call to local variable 
		
	
		//call to static variable and nonstatic variable
		
		LocalVariable t = new LocalVariable ();
		System.out.println(t.j);    // 60
		System.out.println(t.i);   // 70;  // we can call using direct variable name but  get 
		                                    // value of main method so thats why not call here .
		// doesnt get matter repeated i because of no relation between local variable 
		//   and this variable
	}
	
	
		public static void m1()
		{
			int j = 20;
			System.out.println(j);    // 20
		}
		
		public void m2()
		{
		int k = 30;
		
		System.out.println(k);
			
			
		}
		
}
		

	



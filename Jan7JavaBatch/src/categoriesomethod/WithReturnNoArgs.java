package categoriesomethod;

public class WithReturnNoArgs
{
    // 3. method with return type and no arguments
	// note here this categories void is not present because return type
	
	public static int m1()
	{
		int i = 10;
		int j = 20;
		int k = i+j;
		System.err.println(k);
		
		return 50;
	
		
	}
	
	public static String m2()
	{
		int roll = 20;
		 
		String studentid ="CEOP"+roll;
		System.out.println(studentid);
		
		return studentid;
		
	}
		
		 public static void main(String[] args)
    {
		m1();                     // 30
		
		int f =  m1();   
		System.out.println(f);   // 50- here return type is used 
		
		
		m2();                   //  CEOP20
		
		
		String s = m2();       
		
		System.out.println(s+30);    // CEOP2030- used return type 
		
	}
	
	
	
}

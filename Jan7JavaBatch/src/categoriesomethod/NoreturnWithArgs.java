package categoriesomethod;



public class NoreturnWithArgs 
{
  // 2. method with no return type and with arguments
  // in this categories we have not write logic again and again for output.
	// put value in arguments regarding their datatype and we can desire output.
	
	
	
	public  void m1( String s, int i, int j )   
	{
		
		System.out.println(s);
		
		System.out.println(i);
		System.out.println(j);
		
	}
	public static void sum(int i , int j)
	{
		int k = i+j;
		
		System.out.println(k);
	}
	
	
	
	
	
	
	
	
	public static void main(String []args)
	{
		NoreturnWithArgs nrwa =  new NoreturnWithArgs ();
		
		nrwa.m1("velocity", 56, 78);
		
		
		
		nrwa.m1("Ron" , 20 , 30);
		
		
		sum (2,3);     // 5
		
		
		sum (120,30);    // 150
		
	
	}
}

package categoriesomethod;

public class NoReturntypeWithArgsAss6
{
   // 3. method with no return type and with argument
	
	public static void m1( int i , int j ) 
	{
		
		// in this inside method made logic code
		//for calculation opertion
		
		 int k = i+j;              
	 System.out.println(k);       // for addition
	   
	  int l= i-j;
	  System.out.println(l);    // for substraction
	  
	 
	  int m = i*j;
	  System.out.println(m);    // for multiplication
	  
	  
	  int  n = i/j;            // for division
	  System.out.println(n);
		
			}
	
   public static void main(String[] args) 
   {
	 
	   m1( 50,20);
	  
	   System.out.println(" ");
	   
	   m1 (100,50);
	   
	   System.out.println(" ");
	   
	   m1 (2,2);
	   
	   System.out.println(" ");
	   
	   m1(30,15);
	   
	   System.out.println(" ");
	   
	   m1 (40,20);
	   
	   // in main method when we called method m1  and get replace value 
	   
	 
}
	
	
	
	
}

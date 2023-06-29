package categoriesmethod;

public class Ass082 
{
  public static int land1 (int a , int b)
  {	
	int c = a*b;
	
	return c ;
	
   } 
  
    public static int land2 (int e, int b)
    
    {
	  int c = e*b;
	   System.out.println(c);
	return c;
    
		
	}
	
	
  
  
  
	public static void main(String[] args)
	{
		int d = land1(4,5);
		int e = d+100;
		System.out.println(e);   //210
		
		 land2 (e,50);           // 6000 
		
// here in this method we used land1 method logic in land2 method 
		 //means m1 -m2=op;
		
	    
	
	}

}

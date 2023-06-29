package polymorphism;

    public class Test
   { 
    	//POLYMORPHISM
       // POlymorphism is a OOPs concept ,there are a two types of polymorphism
  //  OVERLOADING AND OVERRIDING with the help of 2 types we achived the portability
	       //
	//        OVBERLOADING
    public void m1 ()
    {
    	System.out.println(" first m1 method ");
    }	 
    public void m1 (int i )
    {
    	System.out.println(" Second  m1 method ");
    }	
    	
    public static void m1 (String s, String t)
    {
    	System.out.println(" Static  m1 method ");
    }	
    
    
    // All the above method are OVERLOADED because 
    // rule of polymorphism - overloaded concept is  
     //Methodname same but Argument is different thats the reason.
    //(combination of m1(int)- it is method signature )
	public static void main(String[] args)
	{
		
	}

}

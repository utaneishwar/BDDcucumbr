package encapsulation1;

   public class Kish 
    {
    private   String s = " ";
    
    public   void getm1(String s)  // getter method 
    
    {
    	if (s=="Aditya")
    	{
       this.s = " ";
        System.out.println(s);
    	}
    	else
    	{
    	System.out.println(" please check your name ");	
    	}
    	
    }
    
    public static void main(String[] args)
	{
    	// DATA HIDING 
    	
		Kish name =new Kish ();
		name .getm1(" Aditya");

	}

}

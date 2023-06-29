package encapsulation;

   public final class BankServer  // suppose we have declare class final not problem 
    {
	   // ENCAPSULATION :-it is the combination of data hiding and abstraction
	   
	// discussed in the class about in ENCAPSULATION   
	   
	   
	   
    private double custbalance = 50000.0;
    
    
    public  String getbalance(int pin)  // getter method 
    {
    	   String s= " ";
           if (pin == 1234)
           {
        	s = " your balance is "+custbalance;
        	 
        	   
           }
           else 
           {
        	s = " please check the pin and try again " ;  
           }
    	return s;
    }
 //-------------------------------------------------------   
    
      public void setWithdrawlcash(int pin ,double amount)  // setter method  
        {
    if(pin==1234)
    {
    	 if (amount<= custbalance) 
    	 {
    		custbalance=custbalance-amount;
    		System.out.println("please check your balance is "+custbalance);
    	 }
    	 else 
    	 {
    		System.out.println(" insufficient balance"); 
    	 }
    }   
    else 
    {
    System.out.println(" incorrect pin");	  
    }
        }
    
 //------------------------------------------------   
    //DATA HIDING : hide the data from another classes which is in inside method by declaring  variable private and declaring to method public 
//---------------------------------------
	public static void main(String[] args)
	{
		BankServer bs = new  BankServer ();
		String output =  bs.getbalance (1234);
		
		System.out.println(output);
		
		 bs.setWithdrawlcash(1234,7000);

	}
}

package encapsulation;

   public class BankServer 
    {
	   
	   //ENCAPSULATION: it is the combination of Data Hiding and Abstraction. 
	// ENCAPSULATION - achived security it is OOPS concept
	   
	   
	   
    private double custbalance = 50000.0;
    
    
    public  String getbalance(int pin)  // GETTER METHOD  because start with " get" word and get(read) value 
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
 //------------------------------------------------------   
    public void setWithdrawl(int pin ,double amount)  // SETTER METHOD START WITH "SET" and update the data in inside method 
    {
    
         if (pin==1234)
         {
                if (amount<=custbalance)
               {
    	        custbalance = custbalance-amount ;
    	         System.out.println(" please collect the cash and your balance is "+custbalance);
                }	
                 else 
                {
    	         System.out.println(" incorrect pin");
    
                }
    
        }
    }
    
    
    
  //---------------------------------------
 // CONCEPT OF GETTER AND SETTER METHOD 
 		// this concept is DATA HIDING 
 // data hide from another class by declaring variable "private" and method "public" 
    
	public static void main(String[] args)
	{
		BankServer bs = new  BankServer ();
		String output =  bs.getbalance (1234);
		
		System.out.println(output);
     
		bs.setWithdrawl(1234, 10000.0);
		
	}
}

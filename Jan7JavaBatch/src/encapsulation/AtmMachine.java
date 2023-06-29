package encapsulation;

     public class AtmMachine
     {
	
	
	

	public static void main(String[] args) 
	{ 
		// CONCEPT OF GETTER AND SETTER METHOD 
		// this concept is ABSTRACTION
		
		// when we called to public method from another class but we can not get 
		// logic execute  inside a method without providing correct data (like pin)
		
		BankServer bs = new  BankServer ();
	String output =  bs.getbalance (1234); // if we enter wrong pin then we can not execute 
	                                       // whatever logic in inside method from another class 
	
	System.out.println(output);

	bs.setWithdrawl  (1234 ,7000);    // example of settermethod 
         
	}

}

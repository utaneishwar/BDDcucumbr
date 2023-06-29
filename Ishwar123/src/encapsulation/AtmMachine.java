package encapsulation;

     public class AtmMachine
     {
	
	
	

	public static void main(String[] args) 
	{ 
  //  ABSTRACTION :when we have call to method from another class we  can execute by providing correct data  
		BankServer bs = new  BankServer ();
	String output =  bs.getbalance (1234);  // It is Abstraction 
	
	System.out.println(output);

	bs.setWithdrawlcash(1234,7000);  // it is Abstraction 	

	}

}

package interviewProgram;

public class DataHidingConcept {

	private int balance=50000;
	int total=0;
	public void GetBalance(int pin, int amount)
	{
		if(pin==1234)
		{
			if(balance>=amount)
			{
				 total =balance-amount;
				 System.out.println(" your transaction is successfully and your balance is "+ total);
			}
			else
			{
			System.out.println("your balance is insufficient");	
			}
			
		}
		else
		{
			System.out.println(" invalid pin ");
		}
		
	}

}

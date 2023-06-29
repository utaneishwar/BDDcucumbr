package mockpracticecoding;

public class DataHidingEncapsulation
{
	// 
	    
	private double custbalance = 50000;
	public void GetBalAndSetWithd(int pin ,double amount)
	{
		if(pin ==1234) 
		{ 
		   if(amount<=custbalance)
			{
			   custbalance = custbalance- amount;
			  	System.out.println("plz collect cash and your balance is "+custbalance);
			}
		   else
			{
				System.out.println("insufficient balance ");
			}
		}
		else
		{
			System.out.println(" invalid pin ");
		}
		
	}
	
	public static void main(String[] args) 
	{
//		DataHidingEncapsulation dh=new DataHidingEncapsulation();
//		dh.GetBalAndSetWithd(1234, 5000);
	}

}

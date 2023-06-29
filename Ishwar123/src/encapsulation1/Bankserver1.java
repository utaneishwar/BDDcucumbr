package encapsulation1;

public class Bankserver1
{
	private Double custbalance = 50000.0;
	public String getbalance(int pin)
	{
	String s = " ";
	if (  pin == 12345)	
	{
	 s = (" your balance is "+custbalance);
	}
	else 
	{
		s= "please check the  pin and try again ";
	}
	return s;
	}
	

	public static void main(String[] args)
	{
		Bankserver1 bs = new Bankserver1();
		String output=bs.getbalance (12345);
          System.out.println(output);
	}

}

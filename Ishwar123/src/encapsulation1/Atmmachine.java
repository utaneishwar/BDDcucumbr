package encapsulation1;

public class Atmmachine
{

	public static void main(String[] args) 
	{
		Bankserver1 bs = new Bankserver1();
		String output=bs.getbalance (12345);
          System.out.println(output);
	}

}

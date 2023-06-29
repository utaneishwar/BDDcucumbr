
public class Ass10inElseif {

	public static void main(String[] args)
   {
		int a = 60;
		if((a<=0)  &&  (a>=20))
		{
		System.out.println(" number is betweeen 0&20 ");
		}
		else if ((!(a==21)) || (40>a))
		{
			System.out.println( " number is betweeen 21& 40 ");
		}
		else if (!(a<60) && (a>59))
		{
		System.out.println( " number is betweeen 41& 60 ");	
			
		}	
		else if (a>=80)
		{
			System.out.println(" number is betweeen 61&80 ");
		}	
		else
		{
			
		System.out.println( " number is out of range ");	
		}
		// here in that condition ((!(a==21)) || (40>a)) will get .
		// 
	}

}

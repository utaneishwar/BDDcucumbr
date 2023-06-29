package conditionalstatement;

public class ElseIfstatement {

	public static void main(String[] args)
	{
	// here we define 2 .. if...elseif....else condition
		
	//  syntax : 
//         if (boolean_ condition 1)
//          {
//          will execute if condition 1 gets true
//	        }
		
//          else if (boolean_ condition 2)
//
///         {
//            will  execute condition 2  gets true 
//		     }
		
//        else if (boolean condition  3)
//        {
//		      will execute condition 3 gts true 
//		   
//		   else 
//		{
//		     when no gets condition match 
//		}
		
		int a = 20;
		int b = 30;
		if (a>30)
		{
			System.out.println(" a is greater than 30 ");
		}
		else if (b<20)		
		{
			System.out.println(" b is less than 20 ");
		}
		
		else if (a>15)		
		{
			System.out.println(" a is greater than 15 ");	
			
		}
		else if (b>15)		
		{
			System.out.println(" b is greater than 15 ");
			
		}
		else 
		{
			System.out.println(" else is executing hence no match ");
		}

		// here while vallidate else..if condition in the form of top to bottom 
		// that time execute first else...if  condition.not execute 2nd else..if condition 
		// whenever it will be true..
	}

}

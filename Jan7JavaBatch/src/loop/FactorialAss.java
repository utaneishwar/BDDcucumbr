package loop;

public class FactorialAss {

	public static void main(String[] args)
	{
		int number =5;
		int factorial = 1;
		
		
		for(int i=1; i<=5; i++)              //
		{
		 factorial =i*factorial;	        // 1=1*1   , increment value i : 2=2*1   , 6=3*2   24=4*6  120=5*24  
			                                 // =1                           =2         =6      =24        =120
		}
         System.out.println(factorial);      // final output = 120
         
         // remember value assign in right to left manner
         
         
                                           
         
         
         
         
	}

}

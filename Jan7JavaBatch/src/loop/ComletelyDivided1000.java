package loop;

public class ComletelyDivided1000 {

	public static void main(String[] args)
	{
	  // WAP to print first 1000 number which can get completely divided by 4
		
		
	   int count = 0;                
	   int number = 1;
	   while (count<=1000)
	   {
		  if (number%4==0) 
		  {
			System.out.println(number);  
			count++;                        // count 1 means divisible by 4
		 }
		  number++;                        // when if condition not true that time 
		                                     // only increse the count.
	   }   
		   
	   // This condition execute 1000 time which in those number 
	   //     get  divisible number by 4 only ...
		
		
		
	}

}

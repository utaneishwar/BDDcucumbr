package arraysDiscussion;

public class AdditionElementofevenIndex {

	public static void main(String[] args)
{
// we can access here using first type of array 
		// syntax datatypa [] ref.variablname= new datatype [size of array ];
		
	int [] x= new int[5];	
	x[0]= 2;
	x[1]= 4;
	x[2]= 5;
	x[3]= 6;
	x[4]= 10;
	
	int evenindexadd =0;
	
	for (int i=0; i<5; i++)
	{
		if (i%2==0)
		{
		  evenindexadd = evenindexadd + x[i];
			
         }
	
	}
	System.out.println(evenindexadd);
		
	 	   // 17
		
	}

}

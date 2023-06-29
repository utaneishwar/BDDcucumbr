package arraysDiscussion;

public class SortingArraysAlternate {

	public static void main(String[] args) 
	{
	// sorting element
		
		int a[]= {1,5,3,2,6}; 
		       // 0,1,2,3,4   
		 int var = 0;                             // using for swar mean put values in var variable
		
		for (int i=0; i<a.length; i++)        // iterate for a[element]
		{
		    for (int j=i+1; j<a.length; j++)    //   iterate for for swaping 	
		    {
		        if (a[i]>a[j])       // this condition use here for desc
		        {
		            var = a[i];     // swap value like var = a[o] // 1= 1
		            
		            a[i]=a[j];      // swap value like a[0] = a[1] // 5= 5
		        	a[j] = var;     //// swap value like a[1] = var // 1= 1
		        }
		    }
			
		}
		for (int aa:a)              // it is used here for iteration 
		{
		  System.out.print(aa);	   // ln remove for print in online only 
		}
		
		
	
}}
		

	



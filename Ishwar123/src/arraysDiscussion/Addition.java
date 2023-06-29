package arraysDiscussion;

public class Addition {

	public static void main(String[] args)
	{
		//ASSIGNMENT 1):
		// here is  used a second way to define array 
//syntax: datatype ref.veriable[]={ value1,value2,value3};
		
		
		int x[]= {5,2,1,3,4};
		int sum=0;
		
		
		for (int count=0; count<x.length; count++)
		{        
			sum+=x[count]; // x[0]=5+2+1+3+4+
		}
       System.out.println("the addition all element of arrays  "+ sum);
//-----------------------------------------------------------------------	
// we can execute another type 
// creating object 
 //SYNTAX: datatype [] ref.variable = new datatype[siz of array]
  // we can define size using " length" variable 
       
	
	int []x1= new int [5];
	
	x1[0]= 5;
	x1[1]= 2;
	x1[2]= 1;
	x1[3]= 3;
	x1[4]= 4;
	System.out.println(x1[0]+x1[1]+x1[2]+x1[3]+x1[4]);
	
	
	}
	}

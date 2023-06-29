package arraysDiscussion;

public class ArrayInOddindexPosition
{
  //ASSIGNMENT 3):
	public static void main(String[] args) 
	{
	int x []= {1,2,3,4,5,6,7,8,9,10};
	         //0,1,2,3,4,5,6,7,8,9    this are the index position of arrays
	int z = 0;
	
	for (int i=0; i<x.length; i++)
	{                      // not enter, enter , not enter,   enter  not enter 
	    if (i%2==1)     // i%2= 0%2==0 , 1%2==1, 2%2==0,    3%2==1  4%2==0 
	    { 
	//  4=0+4     // 10= 4+6    // 18=10+8  //  28= 18+10
	//  z=z+x[3]  //  z=z+x[5]  //  z=z+x[7]  // z=z+x[9]
	    z=z+x[i];	
	    }
	}	
	System.out.println(z);	

	}


}

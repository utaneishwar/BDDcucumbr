package arraysDiscussion;

public class defineArray
{  
	// ARRAy: it is collection of homogeneous (sametype like int a = 10,20,30,but not acccess other datatype like String double)element 
   // it represent by single reference variable is called array 
	// size is fixed we can not add external without incr. size of that array.
	
    
	
	public static void main(String[] args)
	{
     // syntax :
     // 1) Datatype [] refvariablename = new Datatype[size of array];
	  // 2) DATAYPE REFVARIABLENAME []= {VALUE1,VALUE2,VALUE3};
		
		int []a = new int [5]; // SIZE INDEX 0,1,2,3,4
		a[0]= 45;
		a[1]=30;
		a[2]=40;
		a[3]=50;
		a[4]=60;
		// System.out.println(a[2]);
		System.out.println(" ");
		for(int i=0; i<5; i++)
		{
			System.out.println(a[i]);
		}

	}

}

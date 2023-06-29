package arraysDiscussion;

public class ArrayInEvenIndexPosition {

	public static void main(String[] args) 
	{
	// ASSIGNMENT 2	
		
		int [] i = new  int[5];
		
		i[0]= 00;     
		i[1]= 10;    
		i[2]= 20;
		i[3]= 30;
		i[4]= 40;
		
		int z= 0;
		
//  i[0],	i[2],i[4],it is in uindex position so we have to get addition of this element 
		    
		for (int m=0; m<5; m++)
		  {
		    	//4%2==0
		    	//3%2==1
		    	//2%2==0
		    	//1%2==1
		    	//0%2==0
	          if (m%2==0) 
	          {
	       //  40=0+40
	        	      // i(3) not come 
	       //20=0+20
	        	     //10= 0+10  not come 
	       //00=0+00
	    	   z= z+i[m];
              }
	      
	     }
			System.out.println(z);
		}
}

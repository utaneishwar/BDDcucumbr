package arraysDiscussion;

public class Evenindex {

	public static void main(String[] args) {
		
	
		
		// as it is similar program define in bellow for practice purpose
	//---------------------------------------------------------------------	

		int b []= {10,21,35,40,32};  
	   
	     int y = 0;

	     for (int i=0; i<b.length; i++)
	       {
	         // yes            //   no      // no          // yes         // yes 
	          //  10%2==0   //    21%2==1     // 35%2 ==1    // 40%2 ==0   // 40%2 ==0
	         // b[0]%2==0  // // b[1]%2==0   // b[2]%2==0  // b[3]%2==0   // b[3]%2==0
	    	 if(b[i]%2==0)  
	    	 {
	    	    y+=b[i] ;  //10+   ,   40+10=50,    32+50     = 82
	    	 }
	        }	
	      
	     System.out.println(y);
	      }
	 
}
		
	


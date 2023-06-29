package stringclass;

public class Casting {

	public static void main(String[] args) 
	{
		//CASTING
//casting : conversion of one Datatype into another datatype is called as casting
		// basically two type 1) primitive  : only applicable for Numeric data 
			                  // 1) implicit   2) Explicit             
			
			                //2) non Primitive : only applicable for Non-primitive Datatype
			                    //  1) upcasting  : Child-Parent conversion of casting 
			                    //  2)Downcasting : parent-child conversion of casting  but it is not valid 
			
		// 1) Implicit casting 	: we can convert only smaller datatype into bigger one 
		
			int i = 80;
			long i1= (long)i;
			System.out.println(i1);  // it conver in long datatype
			
			float f = 20.23f;
			double d= (double)f;
			System.out.println(d);   // 20.229999999  it conver to double
			
			
			
		// 2) Explicit: we can conversion  higher order  numeric datatype  into smaller one.
			
			
		int e = 80;
			byte e1=(byte)e;
			System.out.println(e1); // 80 
				
			int s = 130;
			byte s1=(byte)s;
			System.out.println(s1); // -126  // because the size of byte dattype is 1 byte 
			
				
		
		
		
	}

}

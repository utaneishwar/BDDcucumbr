package durgasoft;

public class DurgaSoft {
	
	
	public static void main(String[] args) 
    {
		//data variablename = value// 'null'   is not allowed  in any primitive datatype 
				//  if null is used will get incompatable error
				// ex  1(char a = null;)  2(int a = null;)   3(boolen k = null;) like this
				// general knowledge about integral datat_type
				// int x = 10;---decimal value (allowed value 0-9)
				// int x = 010;-------octal value(allowed value 0-7)
				// int x = 0X10;-----hexa decimal value (allowed 0-9 & a-f (we can write in upper or lower case)
				// where very few area java is not sensetive value like above
		//practic on integral data type 
		
		
		
		
	
	   int x = 077;          // but int x = 0778 or int 078; not allowed because range is 0-7
	   int x1 = 0Xface ;    // but int x1= 0xfacr not allowed the range is a-f only 
		System.out.println(x1);
		
		
		
		
		int p = 10;
		int q = 010;
		int r = 0x10;
    System.out.println(p+"...."+q+"...."+r+"....");   // value convert in decimal point (by default int value)
         
         
         
		
         double d = 123456.452D;// default value is double 
		System.out.println(d);
		
		
		
	 float f = 123.216f;// use suffix upper or lower
		System.out.println(f);
		
		
		
		
		
	  //we can specify decimal point we can't specify in octal and hexa decimal point.
	
  double d1 = 0123.456;   // double d1 = 0x123.456 can't write because floating data type
  double d2 =0xface;      // doubled2= 0786 is invalid because default value is like int and value is large(.00000)		                  //and int allowed octal value but not in float value 
	                      //also double  d2 = 0xface allowed(default int type) but double d2 = 0xface.0 not allowed
		
		
		double z = 12e3;  // it is nothing but 1.2*10^3 so valid 
		
		double z1 = 12e3f;    //   double z1 = 12e3 is not valid because F suffix is compulsory
		System.out.println(z1);
		System.out.println(z);
		
		int w = 0B1111;        // prefix value with ( b or B) treated as a int (binary form)
		System.out.println(w);  //15
		
		
		
		
		
		// forexternal understanding
// usage of underscore symbol in numeric literals from 1.7 vrsion onwards we can use 
		//underscore symbol between digits of numeric literls
		// double d = 1_23_456.7_8_9
		//double d = 123_456.7_8_9
		// the main advg of this read ability of the code will be improved
		// at the time of execution underscore symbol remove automatically.
	double d5= 1____2____345____6;
	// we can't write _1_    1_23_.7_8   123_
    
    
    }
	
	
	

}

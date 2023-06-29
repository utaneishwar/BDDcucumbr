package mathoperator;

public class Byte {
	
	public static void main(String[] args) {
		//data variablename = value// 'null'   is not allowed  in any primitive datatype 
		//  if null is used will get incompatable error
		// ex  1(char a = null;)  2(int a = null;)   3(boolen k = null;) like this
		// general knowledge about integral datat_type
		// int x = 10;---decimal value (allowed value 0-9)
		// int x = 010;-------octal value(allowed value 0-7)
		// int x = 0X10;-----hexa decimal value (allowed 0-9 & a-f (we can write in upper or lower case)
		// where very few area java is not sensetive value like above
		
		
		byte b= 10;
		byte b1= 127;
		byte b2 = -128;
		
		System.out.println(b2);
		
		
		//data variablename = value
		
		short s =10;
		short s1=32767;
		short s2= -3276;
		System.out.println(s1);
		
		
		//data variablename = value
	 
		int i = 10;
		int i1 = 127;
		int i2 = 2147483647;
		int i3 = -214748648;
		
		System.out.println(i3);
		
		
		//data variablename = value	here this type of integral datatype 
		//must have be l 
		

		long l =10;
		long l1= 2315468791236555l;
		
	System.out.println(l1);
		
		
		

	}

}

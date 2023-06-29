package categoriesomethod;

public class Assno081 
{
	// using withreturn type and with arguments
	// calculate  final output by using given output of one method given to another 
	//  another  methos as a input 
	
	
	public static String m1(String s) 
	{
		String c = s;
		
		return c ;
	}
	public static String m2(String s) 
	{
	String 	d1 = s;
		return d1;
		
	}
	
public static void main(String[] args)
{    String s = m1("ishwar");
     String d = s+" shalikrao ";
	System.out.println(d);
	
	  String m = m2(" utane ");
	System.out.println(d+m);  // here we use return type and call to method for final
	                           // output using input of two method value 
}
}

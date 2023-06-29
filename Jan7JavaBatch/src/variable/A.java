package variable;

public class A {
	// here in this A class we discus static variable
	// syntax of static variable is
	// static data_type variable_name = value ;

	static int a = 50;
	static boolean bol = true;
	static String s = "velocity";
	
	public static void main(String[] args) {
		
		System.out.println(a);// 50
		
		int u = a+5;
		System.out.println(u);// 55
		
		// we are called to below variable using static variable 
		// synytax - classname.variablename
		
		
		System.out.println(A.a);//50
		System.out.println(a+5);// 50velocity
		a = u;// there a=50,+ 5  //55
		System.out.println(a);
	
//-------------------------------------------------------------------------------------------------		
		
		
		
		
		
	
	}

}

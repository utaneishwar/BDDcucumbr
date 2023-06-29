package variable;

public class BVariableTest {

	public static void main(String[] args) {
	//calling nonstatic variable from another class(like B class) 
		// syntax :- classname ref_variablename=new value();
		
		B b = new B();
		System.out.println(b.s);    //abc
		System.out.println(b.d);     // 56.23s

	}

}

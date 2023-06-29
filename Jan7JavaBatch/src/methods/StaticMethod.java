package methods;

public class StaticMethod {
// syntax of static method
// public static void name_of_method();//here take care of writing a staticmethod name like mathOperator/O is capital
//   {
	
//    }
	
   public static void printHello()
   {
	   System.out.println("hello");
	   System.out.println("hello");
	
	}
	

	public static void main(String[] args) {
		printHello();
		printHello();
		printHello();
		System.out.println("this is my first class");
		printHello();
	// another option to call method from main method
		//syntax is classname.methodname();
	StaticMethod.printHello();
		
	StaticMethod.printHello();
//---------------------------------------------------------------------------------------	
	//here when we call to staticmethod by using nonstaticmethod protocol (like below )
	// it will be given warning because in static method already allocated memory at the time of programing.
StaticMethod nsm = new StaticMethod();
nsm.printHello();



	}

}

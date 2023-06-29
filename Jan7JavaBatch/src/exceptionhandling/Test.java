package exceptionhandling;

public class Test {

	public static void main(String[] args) 
	{
// exception only applicable for class
// it is exception handling concept 
//   unwanted even which occurs inside the code that terminates the program in abnormal manner. 
// once we handle the exception by using java code that is called as exception handling.
	
		int a=10;
	int b= 0;
	int z = a/b;
	
	System.out.println(z);
	
// note: it will be get error 
//  Exception in thread "main" java.lang.ArithmeticException: / by zero
//at exceptionhandling.Test.main(Test.java:11)

		
		

	}

}

package method;

public class Test {
	
	
	public static void ish ()
{
   byte b = 125;   
   byte c = 100;
  System.out.println(b+c);
  
     short a= 1000;
     short b1 = 2000;
     System.out.println(b1-a);
  }
  
  public static void main(String[] args) {
		//  calling from this class to another class (classname is Calculator 
		//and methodname is addition ,substraction ,like that 
		//(means call to method from (class a) to (class b)
//syntax-classname.methodname
		
		Calculator.multiplication();
	Calculator.addition();
		Calculator.substraction();
//------------------------------------------		
	// for practice	// call from one class to another and another to same class //using nonstatic and static syntax
		ish();
		Test ish = new Test();
		// in below ish is variablename and also (ish)is nonstatic methodname
		ish.ish();
		Calculator.substraction();// i am calling from calculator class to substraction static method //remember for it
		Calculator.division();
		Calculator .addition();
		Calculator.multiplication();
		
		NonStaticMethod shankar= new NonStaticMethod();
		shankar.aditya();
		shankar.area();
		
		
  }
  }
			



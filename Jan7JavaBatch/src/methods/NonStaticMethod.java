package methods;

public class NonStaticMethod {
	//in nonststic method remove type of method like(static)
	
	public void areaCalculator() 
	{
	int length = 50;
	int breadth = 30;
	int area = length*breadth;
	System.out.println("land area is "+area);
	}
	
	
	public static void main(String[] args)
	{
		// when we call non static method must make an object 
		//syntax of object is
		// classname.variablename = new class name / here new is compalsory
		
		NonStaticMethod ish = new NonStaticMethod ();
		
            ish.areaCalculator();

	}

}

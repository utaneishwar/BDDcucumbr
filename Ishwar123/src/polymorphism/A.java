package polymorphism;

public class A
// when parent class declare final that time child class can not use parent class .
// similarly when parent class declare overloaded method declare " final"
 // also child class not use this final overloaded method which is in inside parent class.

{
  // 3) RULE-Method Return type must be same inside a parent and child class also 
	// if it will be like String ,string it allowed 
	// if it will be like String ,int both Are return type but not allowed in overriding 
  // OVERRIDEN CONCEPT
	
	public int m1() 
	{
	System.out.println("int return type from  parent class A ");	
	
	return 50;
		
	}
	
	
	
	
	
	public static void main(String[] args)
	
	{
		

	}

}

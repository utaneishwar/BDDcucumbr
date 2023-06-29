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
	// 4)RULE-method having different type (static and nonstatic ) cannotbe overriding
	// when we have method overriden we giving preference Nonstatic method .
	public  void m2()
	{
		
		System.out.println(" nonstatic overridding m2 method from class A ");
	}
	
	
	// 5) rule - Accessmodifier 
	
	public void m3()
	{
		System.out.println(" public nonstatic acccessmodifier m3 method from class A");
	}
	
	 void m4()   // default accessmodifier 
	{
		System.out.println(" Default nonstatic acccessmodifier m4 method from class A");
	}
	
	protected void m5() 
	{
		System.out.println(" ***** ");
	}
	
	public static void main(String[] args)
	
	{
		

	}

}

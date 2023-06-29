package accesTest;

import accessmodifier.Test;   // we can acccess any  class from another package 
import accessmodifier.Test4Methodlevel;

public class AccessTest         // with the help of " public " acccessmodifier
{
 
	
	public static void main(String[] args)
	{
		Test t = new Test();// public class access from another class
		
	// 	Test2 t2 = Test2();  // we can not default class access from another class
	
   //  Test3 t3 = new Test3();// we can not access this( default final  class)from acccessmodifier because Test 3 class is final class 
	
//-----------------------------------------------------------------------		
    //  METHOD LEVEL ACCESSMODIFIER 		
//    1) public -whenever class  is <default> then we can not access public methodlevel into the another package because default class only applicable for within same package 
   Test4Methodlevel t4= new Test4Methodlevel();		
	
		t4.M1();  // we can access this method here because its public methodleve from acccessmodifier .
		Test4Methodlevel.M2(); // 	also we can access both are same class and same package 
	
//   2) <Default> - we can access only within same package not in another or different package 
	
//	t4.m3(); //  we can not access here - because outside the package 
//		t4.m4();  // we can not access here - because outside the package 
		
  //   3) PRIVATE- we can access only in the class so thats why not calling here method because this is outside package 
		
//-----------------------------------------------------------------------------		
  // TESTING VARIABLE LEVEL ACCESSMODIFIER
	//1) public
	System.out.println(t4.a);	 // acceessible because its public
	//2) default
//	System.out.println(t4.s);    // not accessible because its default variable 
	//3) private 
//	System.out.println(t4.b);	 //not accessible because its private  variable which is only applicable in class
		
	}                      

}

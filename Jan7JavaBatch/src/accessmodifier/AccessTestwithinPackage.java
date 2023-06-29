package accessmodifier;

public class AccessTestwithinPackage
{

	public static void main(String[] args) 
	{
		Test t1 = new Test (); // public class acccess
		
	    Test2 t =  new Test2(); //  default class acccess
	    
        Test3 t3= new Test3();// accessing public final Test3 class from another package 
 // ----------------------------------------------------------
	
	// TESTING the  different methodlevel Accessmodifier
        
	// 1)PUBLIC -whenever class  is <default> then we can not access public methodlevel into the another package because default class only applicable for within same package 
         Test4Methodlevel.M2();// we can access within same access from Test4Methodlevel  class
         Test4Methodlevel t4= new Test4Methodlevel();// we can also access nonstatic method from Test4Methodlevel class within same package 
         t4.M1();
         
         
   // 2)<DEFAULT> - we can access method only within same package 
         
          t4.M3(); //  we can  access here - because within  the package 
		  t4.M4();  // we can access here - because within  the package 
		
  //   3) PRIVATE- we can access only in the class not in different 	
		//     t4.M5(); // we can not access 
		  //   t4.M6();  // we can not access because private 
         
   
	// PROTECTED
		  
		  A s = new A();
		  s.M9();
//--------------------------------------------------------------------------		  
	// TESTING THE VARIABLE LEVEL ACCESSMODIFIER
//1) public
		  
		System.out.println(t4.a);  // it can be acccessible because its public and class also public 
// 2) default
		System.out.println(t4.s);      // it can be acccessible inside class because within package 
	
// 3)private 
	   //	System.out.println(t4.b);  // it cannot acccessible because it can accessible only within class
		  
// 4) protected -see operation in accessmodifier and accesstest package  and class A and Class B. 	
  
		
		
		
		  
	}

}

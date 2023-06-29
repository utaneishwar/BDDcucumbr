package operator;

public class LogicOperator {

	public static void main(String[] args)
	{
		// 3.Logical Operator
		//  the operator which works on boolean principles are called as logical operator
		
		             // AND (&&)
		// if the condition get true, true = true     ||  false,false = false
		// if the condition  get true, false = false  ||   False,true = false
		
		  int a = 50;
		  int b = 60;
		   
		  boolean c = a>50  &&  b==60;    //  if anyone condition get false then o/p will 
		                                 // get false
		  System.out.println(c);     //  false
		  
		  
		  boolean d = b==60  &&  a==50;
		  System.out.println(d);       // true because both condition are true 
		  
		//---------------------------------------  
		            //  OR (||)
	   	// if the any one condition get truthe then o/p will be given in true manner.
		  
		  boolean e = a>50  ||   b==60;   // one condition is truth
		  
		  System.out.println(e);      // true  because one condition is truth
		
		boolean e1 = a<50   ||    b>60;
		
		System.out.println(e1);    //   false because both condition are false
		
		// ------------------------------------
		          // Not (!)
		  //  here in this statement not word is used so 
		// when condition  get false ( like -not false ) then get truth
		// if the condition get truth (like -not truth ) then get false
		
		     boolean f = false;
		      boolean g = !f;
		System.out.println(g);   // o/p - true || because used not operator means - not false 
		
		boolean h = a!=60;      // note - we cannot write ! (not) before the 
		                       //int or variable can give  to value like 50 
		
		  System.out.println(h);   // true because condition is truth
		
		  boolean i = !(b==60);  // false condition 
		  
		  System.out.println(i);    // false 
		 
		 //-----------------------------
		  
		  
		
	}

}

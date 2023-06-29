package polymorphism;

public class StaticB extends StaticA
{
// static method can not overridden because it doesn't follow the rule of overridding.
// OVERRIDDEING also called as "LATE" binding because it execute based on runtime object 
// OVERLOADED also called as "EARLY"  binding 	because it execute based on REF VARIABLE 
//  To overridden not follow "static method"  and " nonstatic variable" 
	// Example 
	    int     a = 20;
     	String s = " mumbai ";
	   
	
	 public static void m1 ()
		  {
			System.out.println("Static overridding method m1 from StaticB ");
		  }
		   
		   public static void m2 ()
		   {
		 	System.out.println("Static overridding method m2 from StaticB ");
		   }
	
	
	public static void main(String[] args)
	{
		// here we discussed about overriding execution on the basis of object like - runtime and ref variable 
// we can calling static method from parent class on the basis object but it is not recommended
		StaticA a =new StaticA();
		a.m1();       // m1 method class A
		a.m2();       //m2 method class A
		
		StaticB b = new StaticB();
		b.m1();      //m1 method class B
		b.m2();      //m1 method class B
		
		
		StaticA a1 = new StaticB();       // use another way objet  to  understand overriding concept 
		a1.m1();         // m1 method class A
		a1.m2();         // m2 method class A
		
// in last object static  method doesn't follow the overridden rule 
// it will be call on the basis of ref variable 
// it is also called as method hiding concept 	
//===============================================================================		
// CONCEPT OF NONSTATIC VARIABLE IT IS NOT FOLLOW THE OVERRIEDEN RULE 
		// we can create double object but it is not recommended 
		
		StaticA m =new StaticA();    //parent class object  
	       System.out.println(m.a);  // 10
	       System.out.println(m.s);   // pune 
	       
	       
		StaticB n = new StaticB();   // child class object   
		System.out.println(n.a);    // 20
		 System.out.println(n.s);    // mumbai
		
		 
		StaticA x = new StaticB();  // another way object 
		System.out.println(m.a);    // 10
		 System.out.println(m.s);    // pune 
	// in last object  nonstatic variable called on the basis of ref variable so it does not follow th overridding 	 
		 
		
	}

}

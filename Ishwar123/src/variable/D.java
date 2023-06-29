package variable;

public class D
{
     int  phy = 65;
     int   math = 70;
     String sname = "A";
     static String a = "firstyear";
    
     
     
     public static void main(String[] args)
     {
    	
    	 
	System.out.println(a);   // first year
	D p = new D();
	System.out.println(p.sname);  // A
	System.out.println(p.phy);     // 65
	System.out.println(p.math);    //70
	
	
	
	
	System.out.println(a);    // first year
    p.sname="B";
	System.out.println(p.sname);  // B
	D p1 = new D();
	p1.phy = 55;
	System.out.println(p1.phy);     //55
	p1.math=60;
	System.out.println(p1.math);     // 60
	
	
	
	System.out.println(a);   // first year
	p.sname ="C";
	System.out.println(p.sname);   // C
	D p2 = new D();
	p2.phy = 70;
	System.out.println(p2.phy);    //70
	p2.math = 75;
	System.out.println(p2.math);   // 75
	
	
	
	System.out.println(a);      // first year
	p.sname = "D";
	System.out.println(p.sname);   // "D"
	D p3 = new D();
	p3.phy = 45;
	System.out.println(p3.phy);    // 45
	p3.math = 50;
	System.out.println(p3.math);     //50
	
	
	
	
	
	
	
	
	
	  
	
	
	
	
	
	
    	 
    	 
    	 
    	 
	}
  
	
	
	
	
	
}

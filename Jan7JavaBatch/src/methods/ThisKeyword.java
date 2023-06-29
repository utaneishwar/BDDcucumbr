package methods;

public class ThisKeyword 
{
       int i = 10;
       static String s = "abc";
  
       
       public void m1 ()
       {
    	int i = 20;
    	
    	
    System.out.println(i);      // called here local variable
    	   
    	System.out.println(this.i);     // called here global variable -
    	                               // static and non-static using keyword (this)
    	   
    	   
       }
       
          public static void main(String[] args)
       {
      ThisKeyword n = new ThisKeyword();
                     n.m1();
                     
                     
     //  here  called mrthod m1                
                     
	   }

}

package variable;

public class AssNo3
{
	//wap add,sub,mult,div by using 3 variable
	static int a = 10;
	static    int b = 5;
	static     int c = 0;
	 
    public static void addition()
    {
    	    	int c = a+b;
    	System.out.println(c);//15
    }
     
       public static void substraction () 
       {
    	   int a = 20;
    	   int b = 10;
    	   int c = a-b;
    	   System.out.println(c);//10
       }
       public static void multiplication () 
       {
    	 int a = 50;
    	 int b =2;
    	 int c = a*b;
    	 System.out.println(c);// 100
    	   
    	   
       }
       public static void division () 
       {
    	 int a = 200;
    	 int b =50;
    	 int c = a/b;
         System.out.println(c);//4
       }
     public static void main(String[] args)
	{
		addition();
		substraction();
		multiplication();
		division();
		
	}

}

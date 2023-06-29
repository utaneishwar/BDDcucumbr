package constructor;

public class MultipleConstructor1
{
    public MultipleConstructor1(int a ,int b)  // first constructor
    {
           int c = a+b;
           System.out.println(c);
    } 
    
    public MultipleConstructor1( String s, String u, String t)  // first constructor
    {    this(50,40);
         String k = s+" "+u+ " " +t;    // providing Different 3 String Value 
           System.out.println(k);        //Ishwar Shalikrao Utane
    } 
    
    
    
	public static void main(String[] args) 
	{
		MultipleConstructor1 m = new MultipleConstructor1(10,20);
		MultipleConstructor1 m1 = new MultipleConstructor1("Ishwar","Shalikrao","Utane");
		// we can call on the basis of object only
		
	}

}

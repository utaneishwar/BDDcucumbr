package operator;

public class IncrementalDecremental {

	public static void main(String[] args) 
	{
		// two types of increment 1.pre-increment(++x)
		                      //  2.post-increment(x++)
		
		// two types of decrement   1. pre-decrement(--x)
		                      //    2. post-decrement(x--)
		
		
	int a = 10;
	 int  b = ++a;  // pre-increment 
		
		System.out.println(a);   // 11
		System.out.println(b);   // 11
		
		int a1 = 10;
		int  b1 = a1++;       // post-increment
		
		System.out.println(a1);  //11
		System.out.println(b1);   // 10
		
		int a2 = 10;
		int  b2 = -- a2;        //pre-decrement
		System.out.println(a2);   // 9
		System.out.println(b2);   // 9
		
		
		int a3 = 10;
		int b3 = a3--;           // post-decrement
		
		System.out.println(a3);   // 9
		System.out.println(b3);    //10
	}

}

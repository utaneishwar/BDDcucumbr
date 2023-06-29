package operator;

public class IncrementalDecremental {

	public static void main(String[] args)
	{
	// In  Increment  there are two types pre and post 
	// in pre increment first up all value increment then variable get with increment value	
	// but in post increment first up all value assign an then get with increment(final value) 
		
	
// in Decrement there two type also pre and post decrement
//  in pre decrement first up all value decrese and then assign variable  with decrement 
// In post decrement first up all value assign to variable and then get value with  decrement  (final value)		
		
		int x = 10;
		int y = ++x;
		
		System.out.println(" x value is:"+x);   // 11 
		
		System.out.println(" y value is :"+y);   //  11
		
		int w = 10;
		int v = w++;
		System.out.println(" w value is :"+w);    // 11
		System.out.println(" v value is :"+v);     // 10
		
		
		int t = 10;
		int u = --t;
		System.out.println(" t value is :"+t);    // 9
		System.out.println(" u value is :"+ u);    // 9
		
		
		int r = 10;
		int s = r--;
		System.out.println(" r value is :"+r);          // 9
		System.out.println(" s value is :"+s);             // 10
		
		
		
	}

}

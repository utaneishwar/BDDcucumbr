package durgasoft;

public class Test 
{
	static int x = 10;
	int y = 20;
	
	
	
	

	public static void main(String[] args)
	{
		Test t1 = new Test();
		t1.x = 888;
		t1.y = 999;
		
		Test t2 = new Test();
		t2.y = 500;
	System.out.println(t2.y);
      
	}

}

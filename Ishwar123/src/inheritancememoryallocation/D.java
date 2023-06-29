package inheritancememoryallocation;

    public class D extends E  //inheritance use 
    {
    
    
    	  // by default construictor called means in E class - will call E constructor 
    	   //  on that basis we can call following method.
    	
    	public void m9()
    	{
    		a.m1();
    		b.m5();
    		c.m7();
    	}
    	
    	public void m10() 
    	{
    		a.m3();
    		b.m6();
    		
    	}
    	
        public static void main(String[] args)
	  {
		D m = new D(); // due to this object called to default constructor in class d
		 m.m9();       
		 m.m10();
	
		  
	   }
	}



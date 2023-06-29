package interfacediscussion;

public class ClassXY implements InterfaceY,InterfaceX

{
   
	@Override
	public void m1(String i) {
		// TODO Auto-generated method stub
		InterfaceX.super.m1("ishwar");
	}
	
	public void m2()
	{
		 InterfaceX.super.m1("ishwar");
 		 InterfaceY.super.m1("ishwar");
	}
	
	
	
	@Override
	public void m4(String B)         
	{
	System.out.println("my name is ishwar  "+B);
	}
     
	
	
	public static void main(String[] args)
      {
    	  ClassXY xy=new ClassXY();
    	  xy.m2();                    //there have no create diamond ambiguity problem 
    
                xy.m4("bhalchandra");
               
        		     
      }

	
	
	
}

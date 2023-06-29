package variable;

public class D1
{
	//ASSIGNMENT NO 05:
//Wap  classname- first year, Sname-diff, Math- diff marks, Phy- diff marks
// in this progran take care of initial letter like(phy- phy, ...math -Math)	
	//otherwise get error:
	
	
	
	static String clas = "First year";
	        String sname = "Ishwar";
	        int Phy = 65;
	        int Math = 70;
	        
	        
	        
	    public static void main(String[] args)
	    {
	    	System.out.println(clas);
	    	D1 d = new D1();
	    	System.out.println(d.sname);
	    	System.out.println(d.Phy);
	    	System.out.println(d.Math);
	    	
	    	
	    	
	    System.out.println(clas);	
	    d.sname = "vivek";
	    System.out.println(d.sname);
	    D1 d2 = new D1();
	    d2.Phy = 55;
	    d2.Math= 60;
	    System.out.println(d2.Phy);
	    System.out.println(d2.Math);	
	    	
	    
	    
	    System.out.println(clas);
	    d.sname = "Avinash";
	    D1 d3 = new D1();
	    d3.Phy = 45;
	    d3.Math = 50;
	    System.out.println(d3.Phy);
	    	System.out.println(d3.Math);
	    	
	    	
	    	
	    	
	    	
	    	
	    	
	    	
	    	
	    	
			
		}    
	        
	        
	
	
	
	
	
	
	
	
	
	
}

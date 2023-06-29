package categoriesomethod;

public class AssNo71 
{
	// Ass no 07

	public static int  m1(int length, int breadth ) 
	{
	  int area = length * breadth ;
		
		return area;
     }
	
	   public static void main(String[] args) 
	   {
	int area1 =	m1(50,30);
	int area2 =	m1(20,60);
	int area3 =	m1(10,80);
	int totalarea = area1+area2+area3;
	System.out.println(" Total area is = "+totalarea);
	                          // we can put direct method value in area and can get 
	                            // total area value .
	
	}

}

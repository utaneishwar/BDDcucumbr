package stringclass;

public class ImmutableAndMutable {

	public static void main(String[] args) 
	{
	//1) Immutable it not chang the Original String value untill Assign it 
		
		String s ="Adity Kishor ";
		s.concat("utane");
		System.out.println(s);    // Adity Kishor 
		
		//2) mutable it  chang the Original String value  
		
				StringBuffer s1 =new StringBuffer("Adity Kishor ");
				s1.append("Utane");
				System.out.println(s1);    // Adity Kishor Utane
				
		
		
		
		

	}

}

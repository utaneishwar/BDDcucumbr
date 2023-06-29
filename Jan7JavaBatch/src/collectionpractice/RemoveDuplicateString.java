package collectionpractice;

public class RemoveDuplicateString {

	public static void main(String[] args) 
	{
		String []s =  {"manmad","pune", "mumbai" ,"manmad","pune"};
		
		 String []n = new String [s.length] ;
		 
		int j=0;
		
		 for(int i=0; i<s.length; i++)
		 {
			 if(!(n[j].contains(s[i])))        
			 {
				
				
			 }
			 else 
			 {
				 continue;
			 }
		 }
		 for(int i=0; i<n.length; i++)
		 {
		 System.out.println(n[i]);
		 }
		 
	
	}

}

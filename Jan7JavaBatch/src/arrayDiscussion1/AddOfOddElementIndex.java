package arrayDiscussion1;

public class AddOfOddElementIndex
{
	
 public static void main(String[] args) {
	
	 
	 
	 int a [] = {1,2,5,6};
	 
	 
	 int oddelement=0;
	 for(int i=0; i<a.length; i++)
	 {
		if(!(i%2==0))
		{
			oddelement=oddelement +a[i];
		}
		 
	 }
	 System.out.println(oddelement);  
}
	
	
	

}

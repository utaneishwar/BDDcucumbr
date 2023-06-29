package arraysDiscussion;

public class ReverseName {

	public static void main(String[] args)
	{
		String name[] = {"i" ,"s", "h" ,"w", "a" ,"r"};
		
		
		String z= " ";
		for (int i=name.length-1; i>=0; i--)
			
		{
		z=z+name[i];
		}
		
		
		System.out.println(z);	
	}

}

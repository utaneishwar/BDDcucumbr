package arraysDiscussion;

import java.util.Arrays;

public class Seperation135 {

	public static void main(String[] args)
	{
		// seperation of 1 ,3,and 5
		// another way
		
				int i []= {1,3,5,1,1,5,5,3,3,3,1,5,5};
				
				Arrays.sort(i);
				
				for (int j:i)
				{
					System.out.println(j);  // 1,3,5 comes in multiple no with in sequence mannar
				}
				
		}

}

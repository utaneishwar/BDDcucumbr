package stringclass;

public class CountSpaceInString {

	public static void main(String[] args)
	{
		 String set= "hello my name is ishwar";
		  char[] cr= set.toCharArray();
		  int space = 0;
		  for(int i=0; i<cr.length; i++)
		  {
			  if(!(Character.isAlphabetic(cr[i])))
			  {
				 space++;
			  }
		  }
		  System.out.println(space);  // 4
		  }

}

package collectionpractice;

import java.util.HashSet;

public class RemoveDuplicateChar {

	public static void main(String[] args)
  {
	String []s =  {"manmad","pune", "mumbai" ,"manmad","pune"};
	
    HashSet<String> hs = new HashSet<String>();
    
    for(int i=0; i<s.length; i++)
    {
      hs.add(s[i]);
     }

	System.out.println(hs);

	}

}

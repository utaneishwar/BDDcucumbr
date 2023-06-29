package collectionpractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

     public class RemoveDuplicate
   {

	public static void main(String[] args)
	{
		
      String s =  "This is an example of String Array is immutable" ;
		
		    String[] dupl = s.split(" ");
         
    HashSet <String > al = new HashSet<String>(Arrays.asList(dupl));
	
	System.out.println(al);
	
	}  
	
	    //output:  [Array, immutable, of, This, is, String, an, example]
       //          "is" remove
   }

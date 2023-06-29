package exceptionhandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class CheckedCategory1 {

	public static void main(String[] args)
	{
		// we discussed here checked category when compile time will tell handle exception that category called as checked category.
				// if path is valid then catch not executed if path is invalid then it will be executed
				
				
	String s = "C:\\Users\\intel\\Desktopabc \\manual test casses.xlsx" ;  // not valid path
  try 
   {
   FileInputStream fis =  new FileInputStream (s);    // it executed in normal because path is valid 
   System.out.println(" after file inputstream object line ");
   }
				
				
	catch ( FileNotFoundException e)     // this will be executed because path is not valid 
    {
	System.out.println(" FileNotFoundException arrived  ");
	System.out.println(e.getMessage());   // by using got message similar kind of exceptioin.
	}
				
	}

}

package exceptionhandling;

import java.io.FileInputStream;

public class CheckedCategory 
{
	
	

	public static void main(String[] args)
	{// we discussed here checked category when compile time will tell handle exception that category called as checked category.
		// if path is valid then catch not executed if path is invalid then it will be executed
		
		
		String s = "C:\\Users\\intel\\Desktop\\manual test casses.xlsx" ;
		try 
		{
			FileInputStream fis =  new FileInputStream (s);    // it executed in normal because path is valid 
			System.out.println(" after file inputstream object line ");
		}
		
		
		catch ( Exception e)
		{
			System.out.println(" exception arrived  ");
		}
		
		

	}

}

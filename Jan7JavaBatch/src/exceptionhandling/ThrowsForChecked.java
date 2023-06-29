package exceptionhandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ThrowsForChecked
{

	public static void main(String[] args) throws FileNotFoundException
	{
		
	String s ="C:\\Users\\intel\\Desktop\\Testcases"; 
			

	FileInputStream fis = new FileInputStream(s);
	// here the given file path is invalid hence 
	// throws keyword cannot handle the exception the code will be terminated in abnormal manner
	
	System.out.println(" after fis object ");
	
	
	}

}

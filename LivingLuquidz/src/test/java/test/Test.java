package test;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Test
{ // This is Test class inside Src/Test/Java this class is used to write the code
  public static void main(String[] args) throws IOException
  {
	  
	  String path = System.getProperty("user.dir")+"/LivingLuquidz/src/test/resources/TestData/Config.properties";
	  File file=new File(path);
	  FileInputStream fis = new FileInputStream(file);
	  Properties prop=new Properties();
	  prop.load(fis);
	     String value = prop.getProperty("username");
	   System.out.println(value);
}
	
	
	
	
	
}

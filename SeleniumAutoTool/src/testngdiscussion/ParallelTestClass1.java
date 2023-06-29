package testngdiscussion;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ParallelTestClass1
{
	@Test
	public void testcase1() 
	{

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.makemytrip.com/");
	}
	@Test
	public void testcase2() 
	{

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
	}
	
}

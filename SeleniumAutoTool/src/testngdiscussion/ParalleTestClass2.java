package testngdiscussion;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ParalleTestClass2 
{
	@Test
	public void testcase3() 
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
	}
	
}

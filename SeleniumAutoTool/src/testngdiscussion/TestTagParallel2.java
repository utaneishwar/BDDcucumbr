package testngdiscussion;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestTagParallel2 
{
	@Test
	public void google()
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
	}

}

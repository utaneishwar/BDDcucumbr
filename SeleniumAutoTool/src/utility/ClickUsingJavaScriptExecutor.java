package utility;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.idealized.Javascript;

import basicpackage.BaseTest;

public class ClickUsingJavaScriptExecutor {

	private static final String JavaScriptExecutor = null;

	public static void main(String[] args)
	{
		// Application 3: 
		
		WebDriver driver = BaseTest.LaunchBrowser("https://www.spotify.com/in-en/signup");
		
	//	driver.findElement(By.xpath("//*[@id='confirm']")).sendKeys("@velocitypune.com");
		// this is  a normal way to click 
		
		
		 WebElement maleradio = driver.findElement(By.xpath("//*[@id='gender_option_male']"));
	      
	     JavascriptExecutor js = (JavascriptExecutor)driver;   // click on radio button byusing Javascript 
	
          js.executeScript("arguments[0].click();", maleradio);

	}

}

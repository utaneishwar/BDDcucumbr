package testngdiscussion;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import basicpackage.BaseTest;

public class MMTTestclass 
{
	
	
		static WebDriver driver; 
		 @Test
		   public void SearchFlight() throws InterruptedException
		   {
			  driver = BaseTest.LaunchBrowser("https://www.makemytrip.com/");
			  Thread.sleep(3000);
			 WebElement searchbutton = driver.findElement(By.xpath("//*[text()='Search123']"));
			   JavascriptExecutor js = (JavascriptExecutor)driver;
			js.executeAsyncScript("arguments[0].click();", searchbutton);
			 
	       }
		  
	}



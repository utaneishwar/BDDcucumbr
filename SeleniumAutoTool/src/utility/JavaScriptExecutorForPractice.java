package utility;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import basicpackage.BaseTest;

public class JavaScriptExecutorForPractice 
{

	public static void main(String[] args) 
	{//JavaScriptExecutor is an Interface in wich executeScript() is method 
		//with the help of this method Execute the Script from JavaScript
		
		WebDriver driver = BaseTest.LaunchBrowser("https://jqueryui.com/Datepicker");
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		js.executeScript("Window.ScrollBy(0,-500)");
		
		
		
		WebElement scrollelement = driver.findElement(By.xpath("//*[text()='Effect']"));
	     
		  js.executeScript("arguments[0]",scrollelement);
	    
	}

}

package basicpackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import net.bytebuddy.asm.Advice.Return;

public class BaseTest
{// in this class we made one method in that method we write code for launchbrowser and that can be use 
	//for another class inside another  package 
	
	public static WebDriver driver;
	
	
  public static WebDriver LaunchBrowser(String url)
   {
	 driver = new ChromeDriver();
	
	driver.manage().window().maximize();
	 driver.get(url);
	 
	return driver;
	
   }
























}
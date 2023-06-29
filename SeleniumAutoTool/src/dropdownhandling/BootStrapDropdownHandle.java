package dropdownhandling;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import basicpackage.BaseTest;

public class BootStrapDropdownHandle {

	public static void main(String[] args) 
	{
		WebDriver driver=BaseTest.LaunchBrowser("https://paytm.com/recharge");
		driver.findElement(By.xpath("(//*[@type='text'])[1]")).click();
		
	  List<WebElement> allvalues = driver.findElements(By.xpath("//*[@class='_3xI1']"));

			  int countvalue = allvalues.size();
			  
			  for(int i =0; i<countvalue; i++)
			  {
				 String text = allvalues.get(i).getText();
				 System.out.println(text);
			  }
	}

}

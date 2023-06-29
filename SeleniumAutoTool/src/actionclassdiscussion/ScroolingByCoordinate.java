package actionclassdiscussion;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ScroolingByCoordinate {

	public static void main(String[] args) 
	{
		// Scrolling by cordinate by using ScrollByAmount(x,y)method
		

		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com/");
		
		
		Actions act = new Actions(driver);
		
		
	}

}

package actionclassdiscussion;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Scrolling {

	public static void main(String[] args) throws InterruptedException 
	{ 
		//SCROLLING: to perform scroll operation it is optional inside action class
		// scrollToElement(webElement): introduce in "selenium' 4 version so we can able to call the scroolTOElement
		
		
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com/");
		
		Thread.sleep(3000);
		WebElement scrollelement = driver.findElement(By.xpath("//*[@class='a-color-base']"));
		
		Actions act = new Actions(driver);
		
		act.scrollToElement(scrollelement).perform();
		
		act.scrollByAmount(0, 1000);
		
	}

}

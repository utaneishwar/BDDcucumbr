package webtable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AssOfWebTable 
{
	// Assignment of webTable to print the all value from table in syaematic way
	@Test
	public void Getallvalues()
	{
		
		WebDriver driver = new ChromeDriver();
		
	   driver.get("https://demo.guru99.com/test/web-table-element.php");
		
			driver.manage().window().maximize();
		List<WebElement> elements = driver.findElements(By.xpath("//*[@class='leftcontainer']//tbody//tr//td"));
			
			int i=1;
			for( WebElement  element:elements)
			{
				String text = element.getText();
						
		       System.out.print(text+"  "); 
		       if(i==5)
		       {
		    	   System.out.println(" ");
		    	   i=1;
		       }
		       else
		       {
		    	   i++; 
		       }
				
			}
		      	
			}
			
		
	}
	
	



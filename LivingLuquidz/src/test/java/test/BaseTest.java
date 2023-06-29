package test;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

import net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForField.Read;
import pagess.AddToCart;
import pagess.Beers;
import pagess.Search;
import pagess.Spirit;
import utility.ReadProp;

//BaseTestClass: use for only launching
public class BaseTest
{ public static WebDriver driver;
Search search;
Spirit spirit; 
AddToCart addtocart;
Beers beer;

@BeforeSuite
public void initBrowser() throws IOException 
{

	if(ReadProp.getPropData("browser").equals("chrome"))
	{
		driver =new ChromeDriver();
	}
	else 
	{
		driver=new FirefoxDriver();
	}
	driver.manage().window().maximize();
	driver.get(ReadProp.getPropData("url"));



}

@BeforeClass  // constructor
public void createObject()
{
	search = new Search(driver);
	spirit = new Spirit(driver);
	addtocart=new AddToCart(driver);
	beer=new Beers(driver);
}

@AfterSuite
public void tearDown()
{

	driver.close();
}

}

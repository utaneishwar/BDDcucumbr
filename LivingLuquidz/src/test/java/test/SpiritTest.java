package test;


import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.Assert;
import org.testng.annotations.Test;

import pagess.Spirit;

public class SpiritTest extends BaseTest
{
 

	@Test(priority=4)
	public void selectProduct()
	{
       spirit.selectSpirits(); 
	
	}
	@Test(priority=5)
	public void SortByHighPrice() throws InvalidFormatException, IOException
	{
      spirit.sortDropdown("Price High to Low"); 
		
	}
	

	@Test(priority=6)
	public void SortByAlphabates() 
	{
    spirit.sortDropdown("Name A - Z");
	
	}
	
	
	
	
	
}

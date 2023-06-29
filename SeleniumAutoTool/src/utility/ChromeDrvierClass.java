package utility;

public class ChromeDrvierClass implements WebDriverInterfce,TakeScreenshotInterface 

{
	@Override
	public void takescreenshot()
	{
		System.out.println("screenshot");
		
	}

	@Override
	public void get()
	{
		System.out.println("get method");
		
	}

	public static void main(String[] args)
	{
		WebDriverInterfce driver = new ChromeDrvierClass();
		   driver.get();       
		
		
		
  //	driver.takescreenshot();   we cannot access here so we have to use casting 
		
		TakeScreenshotInterface dt = (TakeScreenshotInterface)driver;  // casting apply here 
		
		     dt.takescreenshot();
		
		

	}


}

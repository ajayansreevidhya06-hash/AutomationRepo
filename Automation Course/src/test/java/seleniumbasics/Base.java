package seleniumbasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base 
{
		
	public WebDriver driver;////WebDriver declaration ->WebDriver is a predefined interface
		
	public void browserLaunch()
	{
		driver=new ChromeDriver(); ////WebDriver Initialization
		driver.get("https://selenium.qabible.in/");
		driver.manage().window().maximize();
		//driver.close();
	}	
		public void closeAndQuit()
		{
			//driver.close();
			  driver.quit();
		}
		
	
	public static void main(String[] args) 
	{
		Base base =new Base();
		base.browserLaunch();
		//base.closeAndQuit();
		
	}

}

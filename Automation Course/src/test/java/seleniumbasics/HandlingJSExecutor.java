package seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class HandlingJSExecutor extends Base

{
	
	public void verfiyJS() {
		
		 driver.navigate().to("https://selenium.qabible.in/simple-form-demo.php");
		 WebElement showButton =driver.findElement(By.id("button-one"));
		 JavascriptExecutor js=(JavascriptExecutor)driver;
		 js.executeScript("arguments[0].click();", showButton);
		// js.executeScript("window.scrollBy(0,350)", "");
		 js.executeScript("window.scrollBy(350,0)", "");
	}

	public static void main(String[] args) 
	{
		HandlingJSExecutor HandlingJSExecutorObj=new HandlingJSExecutor();
		HandlingJSExecutorObj.browserLaunch();
		HandlingJSExecutorObj.verfiyJS();

	}

}

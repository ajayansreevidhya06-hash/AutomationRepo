package seleniumbasics;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class HandlingAlerts extends Base
{
	
	public void verifySimpleAlert()
	
	{
		driver.navigate().to("https://demoqa.com/alerts");
		WebElement simpleAlert =driver.findElement(By.xpath("//button[@id='alertButton']"));
		simpleAlert.click();
		
		Alert alertObj =driver.switchTo().alert();
		alertObj.accept();
		
	}
	
	public void verifyConfirmAlert()
	{
		driver.navigate().to("https://demoqa.com/alerts");
		WebElement simpleAlert =driver.findElement(By.xpath("//button[@id='confirmButton']"));
		simpleAlert.click();
		Alert alertObj =driver.switchTo().alert();
		alertObj.accept();
		//alertObj.dismiss();
	}

	public static void main(String[] args) 
	{
		
		HandlingAlerts handlingAlertObj=new HandlingAlerts();
		handlingAlertObj.browserLaunch();
		//handlingAlertObj.verifySimpleAlert();
		handlingAlertObj.verifyConfirmAlert();
		
	}

}

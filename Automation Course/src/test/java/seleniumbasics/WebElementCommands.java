package seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class WebElementCommands extends Base{

	
	public void verfifyWebElements()
	{
	  driver.navigate().to("https://selenium.qabible.in/simple-form-demo.php");
		//text box located
		WebElement messageBox =driver.findElement(By.id("single-input-field"));
		
		//to enter text into text box
		messageBox.sendKeys("Test Message");
		
		WebElement showButton =driver.findElement(By.id("button-one"));
		showButton.click();
		
		WebElement yourMessage = driver.findElement(By.id("message-one"));
		System.out.println(yourMessage.getText());
		
		messageBox.clear();
	}
	public static void main(String[] args) {
		
		WebElementCommands objWebElementCommands =new WebElementCommands();
		objWebElementCommands.browserLaunch();
		objWebElementCommands.verfifyWebElements();

	}

}

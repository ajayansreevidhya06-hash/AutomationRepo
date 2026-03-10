package seleniumbasics;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class MutipleWindowHandling extends Base
{
	
	public void verifyMultipleWindow()
	{
		driver.navigate().to("https://demo.guru99.com/popup.php");
		String firstWindow=driver.getWindowHandle();
		
		WebElement clickHereLink=driver.findElement(By.xpath("//a[text()='Click Here']"));
		clickHereLink.click();
		
		Set<String> handleIds=driver.getWindowHandles();
		
		Iterator<String> itr=handleIds.iterator();
		while(itr.hasNext())
		{
			
			String currentId = itr.next();
			if(!currentId.equals(firstWindow))
			{
				
				driver.switchTo().window(currentId);
				WebElement emailID=driver.findElement(By.name("emailid"));
				emailID.sendKeys("abc.a@gmail.com");
				WebElement submit=driver.findElement(By.name("btnLogin"));
				submit.click();
			}
		}
		
		
	}

	public static void main(String[] args) {
		
		MutipleWindowHandling MutipleWindowHandlingObj=new MutipleWindowHandling();
		MutipleWindowHandlingObj.browserLaunch();
		MutipleWindowHandlingObj.verifyMultipleWindow();

	}

}

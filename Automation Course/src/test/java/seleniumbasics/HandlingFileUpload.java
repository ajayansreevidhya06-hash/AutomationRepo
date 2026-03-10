package seleniumbasics;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class HandlingFileUpload extends Base
{
	
	public void verifyFileUploadUsingSendKeys()
	{
		driver.navigate().to("https://demo.guru99.com/test/upload/");
		WebElement fileUpload=driver.findElement(By.id("uploadfile_0"));
		fileUpload.sendKeys("C:\\Users\\manoj\\git\\AutomationRepo\\Automation Course\\src\\test\\resources\\Sree.pdf\\");
		WebElement terms =driver.findElement(By.id("terms"));
		terms.click();
		WebElement submit =driver.findElement(By.id("submitbutton"));
		submit.click();
	}
	public void verifyFileUploadUsingRobot() throws AWTException
	{
		driver.navigate().to("https://www.ilovepdf.com/pdf_to_word");
		WebElement fileUploadRobot=driver.findElement(By.id("pickfiles"));
		fileUploadRobot.click();
		StringSelection StringSelectionObj=new StringSelection("C:\\Users\\manoj\\git\\AutomationRepo\\Automation Course\\src\\test\\resources\\Sree.pdf\\");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(StringSelectionObj, null);
		Robot robotToUploadPdf =new Robot();
		robotToUploadPdf.delay(2500);
		robotToUploadPdf.keyPress(KeyEvent.VK_ENTER); 
		robotToUploadPdf.keyRelease(KeyEvent.VK_ENTER); 
		robotToUploadPdf.keyPress(KeyEvent.VK_CONTROL); 
		robotToUploadPdf.keyPress(KeyEvent.VK_V); 
		robotToUploadPdf.keyRelease(KeyEvent.VK_CONTROL); 
		robotToUploadPdf.keyRelease(KeyEvent.VK_V); 
		robotToUploadPdf.keyPress(KeyEvent.VK_ENTER); 
		robotToUploadPdf.keyRelease(KeyEvent.VK_ENTER);
		
	}

	public static void main(String[] args) {
		HandlingFileUpload HandlingFileUploadObj=new HandlingFileUpload();
		HandlingFileUploadObj.browserLaunch();
		//HandlingFileUploadObj.verifyFileUploadUsingSendKeys();
		try {
			HandlingFileUploadObj.verifyFileUploadUsingRobot();
		} catch (AWTException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}

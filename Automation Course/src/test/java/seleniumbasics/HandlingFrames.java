package seleniumbasics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class HandlingFrames extends Base{
	
	public void verifyFrames() 
	{
		driver.navigate().to("https://demoqa.com/frames");
		List<WebElement> framesList=driver.findElements(By.tagName("iframe"));
		System.out.println(framesList.size());
		
		WebElement frame=driver.findElement(By.id("frame1"));
		driver.switchTo().frame(frame);
		
		WebElement frameTitle=driver.findElement(By.id("sampleHeading"));
		System.out.println(frameTitle.getText());
		
		driver.switchTo().defaultContent();//going back from this specific frame 
	}

	public static void main(String[] args) 
	{
		HandlingFrames handlingFramesObj=new HandlingFrames();
		handlingFramesObj.browserLaunch();
		handlingFramesObj.verifyFrames();
	}
}

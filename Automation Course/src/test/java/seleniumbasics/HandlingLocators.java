package seleniumbasics;

import org.openqa.selenium.By;

public class HandlingLocators extends Base

{
	
	public void verifyLocators()
	{
		
		
		driver.findElement(By.id("single-input-field"));
		driver.findElement(By.className("form-control"));
		driver.findElement(By.tagName("input"));
		driver.findElement(By.name("viewport"));
		driver.findElement(By.linkText("Simple Form Demo"));
		driver.findElement(By.partialLinkText("Simple"));
		driver.findElement(By.cssSelector("input[id='single-input-field']"));
		driver.findElement(By.xpath("//button[@id='button-one']"));
		driver.findElement(By.xpath("//button[text()='Show Message']"));
		driver.findElement(By.xpath("//button[starts-with(text(),'Show ']"));
		//abosulte xpath -   s/html/body/section/div/div/div[2]/div[1]/div/div[2]/form/div[1]/input
		driver.findElement(By.xpath("//div[contains[(text(),'Single Input Field']//parent:div[@class='card']"));
		driver.findElement(By.xpath("//div[@class='card']//child:button[@id='button-one']"));
		driver.findElement(By.xpath("//button[@id='button-one']//following::div[@class='card']"));
		driver.findElement(By.xpath("//button[@id='button-one']//preceding:: div[@class='card']"));
		driver.findElement(By.xpath("//button[@id='button-one']//ancestor::div"));
		driver.findElement(By.xpath("/div[@class='card']//descendant::div"));
		
		
	}
	public static void main(String[] args) {
		HandlingLocators handlingLocators=new HandlingLocators();	
		handlingLocators.browserLaunch();
		handlingLocators.verifyLocators();

	}

}

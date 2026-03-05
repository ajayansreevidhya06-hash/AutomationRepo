package seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class HandlingTables extends Base
{
	
	public void verifyTables()
	{
		driver.navigate().to("https://money.rediff.com/indices/nse");
		
		WebElement WebTable=driver.findElement(By.id("dataTable")); //xpath = //table[@id='dataTable']
		//System.out.println(WebTable.getText());
			
		WebElement tableRow = driver.findElement(By.xpath("//table[@id='dataTable']/tbody/tr[2]"));
		System.out.println(tableRow.getText()); //getting the text from 2nd row
	}

	public static void main(String[] args) 
	{
		HandlingTables tableObject=new HandlingTables();
		tableObject.browserLaunch();
		tableObject.verifyTables();

	}

}

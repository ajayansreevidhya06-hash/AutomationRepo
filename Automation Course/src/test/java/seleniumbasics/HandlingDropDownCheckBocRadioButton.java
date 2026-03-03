package seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class HandlingDropDownCheckBocRadioButton extends Base{

	
	
	public void verifyDropdown()
	{
		driver.navigate().to(" https://www.webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");
		WebElement dropdown=driver.findElement(By.id(null));
		Select select =new Select(dropdown);
	    //select.selectByIndex(2);
		//select.selectByValue("c#");
		select.selectByVisibleText("SQL");
		
	}
	public static void main(String[] args) {
		HandlingDropDownCheckBocRadioButton objDropdown =new HandlingDropDownCheckBocRadioButton();
		objDropdown.browserLaunch();
		objDropdown.verifyDropdown();

	}

}

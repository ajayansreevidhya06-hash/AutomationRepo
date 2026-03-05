package seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class HandlingDropDownCheckBocRadioButton extends Base{

	
	
	public void verifyDropdown()
	{
		driver.navigate().to("https://www.webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");
		WebElement dropdown=driver.findElement(By.id("dropdowm-menu-1"));
		Select select =new Select(dropdown);
	    //select.selectByIndex(2);
		//select.selectByValue("c#");
		select.selectByVisibleText("SQL");
		
	}
	
	public void verfiyCheckBox() 
	{
		driver.navigate().to("https://www.webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");
		WebElement checkbox=driver.findElement(By.xpath("//input[@value='option-1']"));
		System.out.println("Before selection "+checkbox.isSelected()); //before
		checkbox.click();
		System.out.println(checkbox.isSelected());//after checkBox selection
		
	}
	public void verfiyRadioButton() 
	{
		driver.navigate().to("https://www.webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");
		WebElement radioButton=driver.findElement(By.xpath("//input[@value='green']"));
		radioButton.click();
		System.out.println(radioButton.isSelected());
	}
	
	public static void main(String[] args) {
		HandlingDropDownCheckBocRadioButton objDropdown =new HandlingDropDownCheckBocRadioButton();
		objDropdown.browserLaunch();
		//objDropdown.verifyDropdown();
		//objDropdown.verfiyCheckBox();
		objDropdown.verfiyRadioButton();

	}

}

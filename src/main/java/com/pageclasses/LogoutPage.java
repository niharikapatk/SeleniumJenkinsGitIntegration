package com.pageclasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogoutPage {

	public WebDriver driver;
	
	@FindBy(css=".oxd-userdropdown-tab")
	private WebElement dropdownLoc;
	@FindBy(xpath="//*[contains(text(),'Logout')]")
	private WebElement logoutLoc;
	
	
	public LogoutPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	public void clickDropDown()
	{
		dropdownLoc.click();
	}
	
	public void clickLogout()
	{
		logoutLoc.click();
	}
	
}

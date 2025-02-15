package com.pageclasses;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	public WebDriver driver;
	private String uname;
	private String pwd;
	
	@FindBy(name="username")
	private WebElement unameLoc;
	
	@FindBy(name="password")
	private WebElement pwdLoc;
	
	@FindBy(css="button[type='submit']")
	private WebElement submitLoc;
	
	
	public LoginPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}

	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	
	public void Login(String u,String p)
	{
		setUname(u);
		unameLoc.sendKeys(getUname());
		setPwd(p);
		pwdLoc.sendKeys(getPwd());
		submitLoc.click();
		
		
		
	}
	
	
	public String validateTitle() {
		// TODO Auto-generated method stub
		
		@Nullable
		String title = driver.getTitle();
		return title;
	}
}

package com.utils;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

import com.pageclasses.LoginPage;
import com.pageclasses.LogoutPage;

public class BaseUtils {

	public WebDriver driver;
	public LoginPage lp;
	public LogoutPage lo;
	
	
	
	@BeforeTest
	public void setUp()
	{
		
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		lp=new LoginPage(driver);
		lo=new LogoutPage(driver);
	}
}

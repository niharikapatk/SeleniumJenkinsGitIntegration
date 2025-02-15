package com.seleniumgridheadless;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParallelTestsHeadless {
public WebDriver driver;
  @Test
  @Parameters({"bname"})
  public void crossBowser(String bname) throws MalformedURLException, InterruptedException {
	  
	  if(bname.equals("Chrome"))
	  {
		  ChromeOptions options=new ChromeOptions();
		  
		  URL u=new URL("http://localhost:4444/wd/hub");
		  
		  driver=new RemoteWebDriver(u,options);
		  System.out.println("Chrome execution completed");
		  
	  }else if(bname.equals("Edge"))
	  {
		  EdgeOptions options=new EdgeOptions();
		  
		  URL u=new URL("http://localhost:4444/wd/hub");
		  
		  driver=new RemoteWebDriver(u,options);
		  System.out.println("Edge execution completed");
	  }else if(bname.equals("Firefox"))
	  {
		  FirefoxOptions options=new FirefoxOptions();
		  
		  URL u=new URL("http://localhost:4444/wd/hub");
		  
		  driver=new RemoteWebDriver(u,options);
		  System.out.println("Firefox execution completed");
	  }
	  
	  driver.get("https://www.amazon.in/");
	 
  }
}

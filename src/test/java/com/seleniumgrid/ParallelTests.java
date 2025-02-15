package com.seleniumgrid;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;



public class ParallelTests {
public WebDriver driver;
  @Test
  @Parameters({"bname"})
  public void crossBowser(String bname) {
	  
	  if(bname.equals("Chrome"))
	  {
		  driver=new ChromeDriver();
		  System.out.println("Executing in chrome");
		  
	  }else if(bname.equals("Edge"))
	  {
		  driver=new EdgeDriver();
		  System.out.println("Executing in edge");
	  }else if(bname.equals("Firefox"))
	  {
		  driver=new FirefoxDriver();
		  System.out.println("Executing in Firefox");
	  }
	
	  driver.get("https://www.amazon.in/");
	  
	  
  }
}

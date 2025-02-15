package com.testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.utils.BaseUtils;

public class LoginPageTestcase extends BaseUtils{

	
	@Test(priority=1)
	public void testValidateTitile()
	{
		String title = lp.validateTitle();
		Assert.assertEquals(title, "OrangeHRM","TestPass");
		
	
	}
	
	@Test(priority=1)
	public void testLogin()
	{
		lp.Login("Admin", "admin123");
	}
}

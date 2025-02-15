package com.testcases;

import org.testng.annotations.Test;

import com.pageclasses.LogoutPage;
import com.utils.BaseUtils;

public class LogoutPageTestcases extends BaseUtils{

	
	@Test
	public void logout()
	{
		lp.Login("Admin", "admin123");
		lo.clickDropDown();
		lo.clickLogout();
	}
}

package com.craftsvilla.testscripts;

import org.testng.annotations.Test;

import com.craftsvilla.generic.BaseTest;
import com.craftsvilla.generic.ReadExcel;
import com.craftsvilla.pom.HomePage;
import com.craftsvilla.pom.SignInPage;

public class SignInScripts extends BaseTest
{
	public SignInPage sp  = null;
	public HomePage  hp = null;
	@Test
	public void registerUser()
	{
		sp = new SignInPage(driver);
		hp = new HomePage(driver);
		String[][] credentials = ReadExcel.getData(filePath, "Sheet1");
		
		for(int i = 1; i<credentials.length;i++)
		{
			String email = credentials[i][0];
			String password = credentials[i][1];
			
			sp.clickOnSignIn();
			sp.enterEmail(email);
			sp.clickContinue();
			sp.enterNewPassword(password);
			sp.clickCheckBox();
			sp.clickCheckBox();
			sp.register();
			hp.gotoAccount();
			hp.logout();
			
			
			
		}
		
	}

}

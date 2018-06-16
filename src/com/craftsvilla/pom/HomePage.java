package com.craftsvilla.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.craftsvilla.generic.BasePage;

public class HomePage extends BasePage
{
	public HomePage(WebDriver driver)
	{
		super(driver);
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath ="//i[@class='icon first_arrow hidden-xs']")
	private WebElement userId;
	
	@FindBy(xpath = "//i[@class='icon logout']")
		private WebElement signOut;
	
	public void gotoAccount()
	{
		verifyElementPresent(userId);
		mouseHover(driver, userId);
	}
	
	public void logout()
	{
		verifyElementPresent(signOut);
		signOut.click();
	}

}

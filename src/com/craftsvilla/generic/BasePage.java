package com.craftsvilla.generic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;

public class BasePage 
{
	public WebDriver driver = null;
	
	public BasePage(WebDriver driver)
	{
		this.driver = driver;
	}
	
	public void verifyElementPresent(WebElement ele)
	{
		WebDriverWait w = new WebDriverWait(driver, 10);
		try
		{
			w.until(ExpectedConditions.visibilityOf(ele));
			Reporter.log(ele +" is present");
		}
		catch(Exception e)
		{
			e.printStackTrace();
			Reporter.log(ele +" not found");
		}
	}
	
	
	public void verifyTitle(String expTitle)
	{
		WebDriverWait w = new WebDriverWait(driver, 10);
		try
		{
			w.until(ExpectedConditions.titleContains(expTitle));
			String actualTitle = driver.getTitle();
			Assert.assertEquals(actualTitle, expTitle);
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
			Reporter.log("Expected and actual title doesn't match");
		}
		
	}

	public void mouseHover(WebDriver driver, WebElement ele)
	{
		WebDriverWait w = new WebDriverWait(driver, 10);
		try
		{
			Actions action = new Actions(driver);
			action.moveToElement(ele).perform();
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
			Reporter.log(ele+" not found");
		}
		
	}
	
	public void handleDropdown(WebElement ele)
	{
		
	}
	
	public void alertPopup()
	{
		
	}
	
	public void confirmationPopup()
	{
		
	}
}

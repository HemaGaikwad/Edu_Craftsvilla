package com.craftsvilla.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.craftsvilla.generic.BasePage;

public class Accessories extends BasePage
{
	
	public Accessories(WebDriver driver)
	{
		super(driver);
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//a[text()='ACCESSORIES ']")
	private WebElement accessories;
	
	@FindBy(linkText = "Kundan Jewellery")
	private WebElement kundan;
	
	@FindBy(linkText = "Temple Jewellery")
	private WebElement temple;
	
	@FindBy(linkText = "Watches")
	private WebElement watches;
	
	
	public void gotoAccessories()
	{
		verifyElementPresent(accessories);
		mouseHover(driver, accessories);
	}
	
	public void goToKundan()
	{
		verifyElementPresent(kundan);
		kundan.click();
		
	}
	
	public void goToTempleJewellery()
	{
		verifyElementPresent(temple);
		temple.click();
	}

	public void goToWatches()
	{
	verifyElementPresent(watches);
	watches.click();
	}
}

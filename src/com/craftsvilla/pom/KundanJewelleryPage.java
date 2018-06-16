package com.craftsvilla.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.craftsvilla.generic.BasePage;

public class KundanJewelleryPage extends BasePage
{
	public KundanJewelleryPage(WebDriver driver)
	{
		super(driver);
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "//img[@src='https://img3.craftsvilla.com/image/upload/w_300,h_450,c_lfill,f_auto/C/V/CV-MENTE15607293360--ENTERCARTS-Craftsvilla_1.jpg-1517113472']")
	private WebElement product_pendant;
	
	
	public void choosePedant()
	{
		verifyElementPresent(product_pendant);
		product_pendant.click();
	}
	

}
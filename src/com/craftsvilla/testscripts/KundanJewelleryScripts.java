package com.craftsvilla.testscripts;

import org.testng.annotations.Test;

import com.craftsvilla.generic.BaseTest;
import com.craftsvilla.pom.Accessories;
import com.craftsvilla.pom.CheckOutPage;
import com.craftsvilla.pom.KundanJewelleryPage;
import com.craftsvilla.pom.ProductDescriptionPage;

public class KundanJewelleryScripts extends BaseTest
{
	public Accessories ap = null;
	public KundanJewelleryPage kj = null;
	public ProductDescriptionPage pd = null;
	public CheckOutPage cp = null;
	
	@Test
	public void TC_01_BuyKundanJewellery()
	{
		ap = new Accessories(driver);
		kj = new KundanJewelleryPage(driver);
		pd = new ProductDescriptionPage(driver);
		cp = new CheckOutPage(driver);
		
		try
		{
			ap.gotoAccessories();
			ap.goToKundan();
			kj.choosePedant();
			pd.verifyProductName();
			pd.buyProduct();
			cp.verifyProduct();
			cp.enterEmail("abc@gmail.com");
			cp.enterFirstName("abc");
		}
		catch (Exception e) 
		{
			e.printStackTrace();


		}
		
		
		
		
	}

}

package com.pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class contactus {

	WebDriver driver;
	public contactus(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	By contactus=By.linkText("Contact Us");
	public WebElement contactus1()
	{
		return driver.findElement(contactus);
	}

}

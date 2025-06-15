package com.SwagLab.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class checkoutPage {
	private WebDriver driver;
	//constructor
	public checkoutPage(WebDriver driver)
	{
		this.driver=driver;
	}
	//locator
	private By checkout=By.xpath("//button[@name='checkout']");
	private By cartButton=By.xpath("//button[text()='Add to cart']");
	 private By cartPageOption=By.xpath("//a[@class='shopping_cart_link']");
	 private By fname=By.xpath("//input[@id='first-name']");
	 //private By fname =By.xpath("//input[@id='first-name']");)
	 private By lname=By.xpath("//input[@id='last-name']");
	 private By address=By.xpath("//input[@id='postal-code']");
	 private By contiueButton=By.xpath("//input[@id='continue']");
	// private By  cartBag=By.xpath("//span[@class='shopping_cart_badge']");
	
	//method
	public void clickOncartButton()
	{
		//driver.findElement(checkout).click();
		driver.findElement(cartButton).click();
		
		
	}
	
	public void clickoncheckoutButton()
	{
		driver.findElement(cartButton).click();
	}
	public void clickcartBag()
	{
		driver.findElement(cartPageOption).click();
	}
	
	public void clickoncheckout()
	{
		driver.findElement(checkout).click();
	}
	public void checkoutYourInformation() {
		driver.findElement(fname).sendKeys("ashwini");
		driver.findElement(lname).sendKeys("asss");
		driver.findElement(address).sendKeys("123456");
	}
	public void clickoncountinue()
	{
		driver.findElement(contiueButton).click();
	}

}

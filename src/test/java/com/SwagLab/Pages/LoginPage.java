package com.SwagLab.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	    
	
	public WebDriver driver;
	//constructor
	public LoginPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	//locators
	
	private By username=By.id("user-name");
	private By password=By.id("password");
	private By loginbtn=By.id("login-button");
	
	//methods
	
	public String getAppUrl()
	{
		return driver.getCurrentUrl();
	}
	
	public String getAppTitle()
	{
		return driver.getTitle();
	}
	public void enterUserName(String un)
	{
		driver.findElement(username).sendKeys(un);
	}
	
	public void enterPassword(String pw)
	{
		driver.findElement(password).sendKeys(pw);
	}
	public void clickLoginButton()
	{
		driver.findElement(loginbtn).click();
	}
	public  InventoryPage doLogin(String un,String pw)
	{
		driver.findElement(username).sendKeys(un);
		driver.findElement(password).sendKeys(pw);
		driver.findElement(loginbtn).click();
		return new InventoryPage(driver);
	}
	
		
	}
	
	
	
	



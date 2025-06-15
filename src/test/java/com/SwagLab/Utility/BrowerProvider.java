package com.SwagLab.Utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowerProvider {
	public static WebDriver driver;
	
	static ThreadLocal<WebDriver> tdriver=new ThreadLocal<WebDriver>();
	
	public static WebDriver setDriver(String bname)
	{
		switch(bname)
		{
		case "chrome":driver=new ChromeDriver();
		tdriver.set(driver);break;
		case "edge":driver=new EdgeDriver();
		tdriver.set(driver);break;
		case "Firefox":driver=new FirefoxDriver();
		tdriver.set(driver);break;
		
	
		
		
		}
		return getDriver();
		
	}

	public static WebDriver getDriver() {
		// TODO Auto-generated method stub
		return tdriver.get();
	}

}

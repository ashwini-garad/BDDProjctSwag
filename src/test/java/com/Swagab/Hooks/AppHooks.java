package com.Swagab.Hooks;

import java.time.Duration;

import org.openqa.selenium.WebDriver;

import com.SwagLab.Utility.BrowerProvider;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class AppHooks {
	
	public WebDriver driver;
	@Before
	public void setUp()
	{
		driver= BrowerProvider.setDriver("edge");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		
	}
	/*@After
	public void tearDown()
	{
	driver.close();
	}*/

}

package com.SwagLab.Steps;

import org.testng.Assert;

import com.SwagLab.Pages.LoginPage;
import com.SwagLab.Utility.BrowerProvider;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStep {
	LoginPage lp = new LoginPage(BrowerProvider.getDriver());
	String actTitle;

	@Given("Open Swaglab appliation")
	public void open_swaglab_appliation() {
		BrowerProvider.getDriver().get("https://www.saucedemo.com/");
	}

	@When("user get the current title")
	public void user_get_the_current_title() {

		String actTitle = lp.getAppTitle();
		System.out.println("application title is:=" + actTitle);
		System.out.println(lp.getAppTitle());
	}

	@Then("Ttile should be match {string}")
	public void ttile_should_be_match(String expTitle) {
		
		//String expTitle=driver.
		Assert.assertEquals(actTitle,expTitle,"Application Title not matched!");
		System.out.println("application title matched....");
	}

	@When("user enter valid username and password")
	public void user_enter_valid_username_and_password() {
		lp.enterUserName("standard_user");
		lp.enterPassword("secret_sauce");
	}

	@When("click on login button")
	public void click_on_login_button() {
		lp.clickLoginButton();
	}

	@Then("user should be login and navigate to Inventory page")
	public void user_should_be_login_and_navigate_to_inventory_page() {
		String exp="Inventory";
		Assert.assertTrue(lp.getAppUrl().contains(exp),"Test failss...");
		System.out.println("login completed ....user  is on inventory page....!");
	}

}

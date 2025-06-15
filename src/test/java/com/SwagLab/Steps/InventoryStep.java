package com.SwagLab.Steps;

import java.util.List;

import org.testng.Assert;

import com.SwagLab.Pages.InventoryPage;
import com.SwagLab.Pages.LoginPage;
import com.SwagLab.Utility.BrowerProvider;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class InventoryStep {
	LoginPage lp=new LoginPage(BrowerProvider.getDriver());
	InventoryPage ip;
	int count;
	String procuctName;
	@Given("User must be login with valid credentials")
	public void user_must_be_login_with_valid_credentials( DataTable table) {
	    // Write code here that turns the phrase above into concrete actions
	    // For automatic transformation, change DataTable to one of
	    // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
	    // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
	    // Double, Byte, Short, Long, BigInteger or BigDecimal.
	    //
	    // For other transformations you can register a DataTableType.
		BrowerProvider.getDriver().get("https://www.saucedemo.com/");
	   List<List<String>> data=table.cells();
	   String un=data.get(0).get(0);
	   String pwd=data.get(0).get(1);
	 ip=  lp.doLogin(un, pwd);
	   
	}

	@Given("User is on inventory page")
	public void user_is_on_inventory_page() {
	    Assert.assertTrue(lp.getAppUrl().contains("inventory"));
	    System.out.println("user is on inventory page");
	}

	@When("user get the current count of product")
	public void user_get_the_current_count_of_product() {
	    count=ip.getProductCount();
	}

	@Then("total product should match to {int}")
	public void total_product_should_match_to(Integer expCount) {
	   Assert.assertEquals(count, expCount);
	   System.out.println("product count is matched....!"+count);
	}

	@When("User getthe product details")
	public void user_getthe_product_details() {
	    
      ip.getProductDetails();
	}

	@Then("All product should be display")
	public void all_product_should_be_display() {
	    System.out.println("product detailed get displayed...");
	}

	@When("User add product to cart {string}")
	public void user_add_product_to_cart(String pname) {
		procuctName=ip.addProductToCart(pname);
	}

	@Then("Product should beadded to the cart")
	public void product_should_beadded_to_the_cart() {

System.out.println("product added to cart"+procuctName);
	}

	@When("user click on cart option")
	public void user_click_on_cart_option() {
	    ip.ClickOnCartOption();
	}

	@Then("cart page should be open")
	public void cart_page_should_be_open() {
String url=ip.launchCartPage();
Assert.assertTrue(url.contains("cart")) ;
System.out.println("cart page is open");

	}




}

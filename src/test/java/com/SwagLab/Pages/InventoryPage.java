package com.SwagLab.Pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class InventoryPage {
	
	private WebDriver driver;
	
	 public InventoryPage(WebDriver driver)
			{
		 this.driver=driver;
			}
	 private By product=By.xpath("//div[@class='inventory_list']//div[@class='inventory_item']");
	 private By cartButton=By.xpath("//button[text()='Add to cart']");
	 private By cartPageOption=By.xpath("//a[@class='shopping_cart_link']");
	 //method
	 
	 public int getProductCount()
	 {
		 return driver.findElements(product).size();
	 }
	 
	 public void getProductDetails()
	 {
	List<WebElement> list= driver.findElements(product);
System.out.println("*******product details");

for(WebElement i:list)
{
	System.out.println(i.getText());
}
	 }

public String addProductToCart(String pname)
{
	List<WebElement> list=driver.findElements(product);
	
 for(WebElement i:list)
 {
	 if(i.getText().contains(pname))
	 {
		 i.click();
		 break;
	 }
 }
 driver.findElement(cartButton).click();
 //System.out.println("product added to cart"+pname);
 return pname;
}
public void ClickOnCartOption()
{
	driver.findElement(cartPageOption).click();
}
 
 public String launchCartPage()
 {
	 driver.findElement(cartPageOption).click();
	 return driver.getCurrentUrl();
 }

}

	 



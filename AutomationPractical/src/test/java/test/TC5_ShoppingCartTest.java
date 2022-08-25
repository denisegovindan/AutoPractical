package test;

import java.io.IOException;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pageObjects.MyStoreSearchPage;
import pageObjects.ShoppingCartPage;
import pageObjects.SignInPage;

import util.*;
public class TC5_ShoppingCartTest extends Base{
	private static WebDriver driver = null;
	private static String quantity = "5";
	private static int result;

	TC5_ShoppingCartTest e;
	@Before
	public void init() throws IOException {
        e= new TC5_ShoppingCartTest();
		driver = initializeDriver();
	
	}
	
	@Test	
	public void shoppingCart_TC_5() throws Exception{ 
		
         ShoppingCartPage  shopping = new ShoppingCartPage(driver);
         Util.customWait();	
		 shopping.addItem();
		 Util.customWait();
		 shopping.clickImage();      
		 Util.customWait();				
		 shopping.frameSwitch();
		 Util.customWait();
		 shopping.submit();
		 Util.customWait();	
		 shopping.active();
		 Util.customWait();	
		 shopping.closeButton();
		 Util.customWait();	
		 shopping.viewCart();
		 Util.customWait();	
		 shopping.increaseQuantity(quantity);	
		 Util.customWait();
		 String unitPrice = shopping.unitPrice();
		 Util.customWait();
		 String result = Util.calculateTotal(unitPrice.substring(1), quantity);		
		 Util.customWait();
		 String displayTotal = shopping.displayTotal();	
		 Util.customWait();		 
		 Assert.assertEquals(result, displayTotal.substring(1));
	}

	@After
	public void teardown()
	{		
		driver.close();	
	}
}

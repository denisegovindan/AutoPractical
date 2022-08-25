package test;

import java.io.IOException;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pageObjects.MyStoreSearchPage;
import util.*;
public class TC2_SearchTest extends Base {
	private static WebDriver driver = null;
	
	TC2_SearchTest b;
	@Before
	public void init() throws IOException {
        b= new TC2_SearchTest();
		driver = initializeDriver();
	
	}
	@Test
	public  void mystoreSearch_TC_2() {
         MyStoreSearchPage  search = new MyStoreSearchPage(driver);
         String searchCriteria = "Blouse,Faded Short Sleeve T-shirts,Printed Chiffon Dress";
         String[] items = searchCriteria.split("[,]", 0);
         for(String myStr: items) {
            search.stringManip(myStr);
            search.search_Button();
            Boolean verifyTitle = MyStoreSearchPage.getTitle(driver).getAttribute("title").equals(myStr);
            Assert.assertTrue(verifyTitle);
         }       
	}

	@After
	public void teardown()
	{		
		driver.close();	
	}
}

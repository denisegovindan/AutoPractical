package test;

import java.io.IOException;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import util.*;
import pageObjects.MyStoreSearchPage;

public class TC1_SearchTest extends Base{
	private static WebDriver driver = null;

	TC1_SearchTest a;
	@Before
	public void init() throws IOException {
        a= new TC1_SearchTest();
		driver = initializeDriver();
	
	}
	@Test
	public void mystoreSearch_TC1() throws Exception {
        MyStoreSearchPage  search = new MyStoreSearchPage(driver);
        search.search_Top();
        search.search_Button();
        Util.customWait();
        Boolean verifyTitle = MyStoreSearchPage.getTitle(driver).getAttribute("title").equals("Printed Summer Dress");
        Assert.assertTrue(verifyTitle);
	}
    
	@After
	public void teardown()
	{		
		driver.close();	
	}

}

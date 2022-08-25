package test;

import java.io.IOException;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pageObjects.WomanCategoryPage;
import pageObjects.WomanTopCategoryPage;
import util.*;

public class TC6_GenericTest extends Base{
	private static WebDriver driver = null;
	 static String strUrl;
	
	TC6_GenericTest f;

	@Before
	public void init() throws IOException {
		f = new TC6_GenericTest();
		driver = initializeDriver();
	}
		
	  @Test
      public void genericTest() throws Exception{    
		
		WomanCategoryPage woman = new WomanCategoryPage(driver);//Category
		WomanTopCategoryPage top = new WomanTopCategoryPage(driver);//SubCategory
		woman.hoverOverWomanCategory();
		top.hoverOvertShirts();
		strUrl = driver.getCurrentUrl();
		Util.customWait();
		Assert.assertEquals(top.getTopUrl(), strUrl);
   
    
}

	@After
	public void teardown() {
		driver.close();
	}

}

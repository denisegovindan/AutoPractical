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
public class TC3_DataDrivenTest extends Base{
	private static WebDriver driver = null;

	TC3_DataDrivenTest c;
	@Before
	public void init() throws IOException {
        c = new TC3_DataDrivenTest();
        String path = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver",path + "\\src\\main\\resources\\chromedriver.exe");		 
		 driver = new Waits();//Overide execute ChromeDriver 
		 driver.manage().window().maximize();		
	}
	
	
	@Test
	public void mystoreSearch_TC1() throws Exception {	//Using Data driven approach	
        String excelData = Util.getRowCount(1, 0);
        String excelDataSearch = Util.getRowCount(1, 1);
		driver.get(excelData);
		MyStoreSearchPage  search = new MyStoreSearchPage(driver);
		search.stringManip(excelDataSearch);
		search.search_Button();
		Util.customWait();
        Boolean verifyTitle = MyStoreSearchPage.getTitle(driver).getAttribute("title").equals(excelDataSearch);
        Util.customWait();
        Assert.assertTrue(verifyTitle);
        Util.customWait();
        Util.markSheet(1, 2,verifyTitle);
	}

	@After
	public void teardown()
	{		
		driver.close();	
	}
}

package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MyStoreSearchPage {
	private static WebElement element = null;
	public WebDriver driver = null;
	
	By searchTop = By.cssSelector("#search_query_top");
	By submitSearch = By.name("submit_search");
	static By title = By.xpath("//body[1]/div[1]/div[2]/div[1]/div[3]/div[2]/ul[1]/li[1]/div[1]/div[2]/h5[1]/a[1]");
	
	public MyStoreSearchPage(WebDriver driver) {		
		this.driver=driver;	
	}

	public void search_Top() {
		driver.findElement(searchTop).clear();
		driver.findElement(searchTop).sendKeys("Printed Summer Dress");
	}
	public void search_Button() {
		driver.findElement(submitSearch).sendKeys(Keys.ENTER);	
	}
	public void stringManip(String name) {
		driver.findElement(searchTop).clear();
		driver.findElement(searchTop).sendKeys(name);
	}

	public static WebElement getTitle(WebDriver driver) {
		element = driver.findElement(title);
		return element;
	}




}

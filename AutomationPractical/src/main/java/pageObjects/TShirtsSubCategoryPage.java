package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import util.Util;

public class TShirtsSubCategoryPage {//SubCategory

	
	public WebDriver driver = null;
	By woman = By.xpath("//body[1]/div[1]/div[2]/div[1]/div[1]/a[2]");
	By tops = By.xpath("//body[1]/div[1]/div[2]/div[1]/div[1]/a[3]");
	
	
	public TShirtsSubCategoryPage(WebDriver driver) {		
		this.driver=driver;	
	}
	
	public void hoverOvertShirts() throws Exception {
		Actions actions = new Actions(driver);
		WebElement menuOption = driver.findElement(woman);
		actions.moveToElement(menuOption).perform();
		Util.customWait();
		menuOption.click();
		
	}
}

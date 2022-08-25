package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import util.Util;

public class WomanTopCategoryPage { //SubCategory
	
	public WebDriver driver = null;
	By tShirts = By.xpath("//body[1]/div[1]/div[1]/header[1]/div[3]/div[1]/div[1]/div[6]/ul[1]/li[1]/ul[1]/li[1]/ul[1]/li[1]/a[1]");
	By blouses = By.xpath("//body[1]/div[1]/div[1]/header[1]/div[3]/div[1]/div[1]/div[6]/ul[1]/li[1]/ul[1]/li[1]/ul[1]/li[2]/a[1]");
	By urlTop =  By.xpath("//body[1]/div[1]/div[1]/header[1]/div[3]/div[1]/div[1]/div[6]/ul[1]/li[1]/ul[1]/li[1]/ul[1]/li[1]/a[1]");
	
	public WomanTopCategoryPage(WebDriver driver) {		
		this.driver=driver;	
	}
	
	public void hoverOvertShirts() throws Exception {
		Actions actions = new Actions(driver);
		WebElement menuOption = driver.findElement(tShirts);
		actions.moveToElement(menuOption).perform();
		Util.customWait();
		menuOption.click();
	}
	public void hoverOverBlouses() {
		Actions actions = new Actions(driver);
		WebElement menuOption = driver.findElement(blouses);
		actions.moveToElement(menuOption).perform();
	}
	public String getTopUrl() {
		return driver.findElement(urlTop).getAttribute("href");
	}
}

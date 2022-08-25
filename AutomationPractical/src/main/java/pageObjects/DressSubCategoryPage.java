package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import util.Util;

public class DressSubCategoryPage {//SubCategory

	public WebDriver driver = null;
	By casualDresses = By.xpath("//body[1]/div[1]/div[1]/header[1]/div[3]/div[1]/div[1]/div[6]/ul[1]/li[2]/ul[1]/li[1]/a[1]");
	By eveningDresses = By.xpath("//body[1]/div[1]/div[1]/header[1]/div[3]/div[1]/div[1]/div[6]/ul[1]/li[2]/ul[1]/li[2]/a[1]");
	By summerDresses =  By.xpath("//body[1]/div[1]/div[1]/header[1]/div[3]/div[1]/div[1]/div[6]/ul[1]/li[2]/ul[1]/li[3]/a[1]");
	
	public DressSubCategoryPage(WebDriver driver) {		
		this.driver=driver;	
	}
	
	public void hoverOvertShirts() throws Exception {
		Actions actions = new Actions(driver);
		WebElement menuOption = driver.findElement(casualDresses);
		actions.moveToElement(menuOption).perform();
		Util.customWait();
		menuOption.click();
	}
	
}

package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class WomanCategoryPage { //Category
	public WebDriver driver = null;
	By womanMainMenu = By.xpath("//body[1]/div[1]/div[1]/header[1]/div[3]/div[1]/div[1]/div[6]/ul[1]/li[1]/a[1]");

	public WomanCategoryPage(WebDriver driver) {
		this.driver=driver;
		
	}
public void hoverOverWomanCategory() {
	Actions actions = new Actions(driver);
	WebElement menuOption = driver.findElement(womanMainMenu);
	actions.moveToElement(menuOption).perform();
}

}

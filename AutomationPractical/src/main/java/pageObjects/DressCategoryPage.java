package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class DressCategoryPage {
	public WebDriver driver = null;
	By dressMainMenu = By.xpath("//body[1]/div[1]/div[1]/header[1]/div[3]/div[1]/div[1]/div[6]/ul[1]/li[2]/a[1]");

	public DressCategoryPage(WebDriver driver) {
		this.driver=driver;
		
	}
public void hoverOverWomanCategory() {
	Actions actions = new Actions(driver);
	WebElement menuOption = driver.findElement(dressMainMenu);
	actions.moveToElement(menuOption).perform();	
}

}

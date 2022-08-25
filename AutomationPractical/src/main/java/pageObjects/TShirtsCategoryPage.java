package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class TShirtsCategoryPage {
	
		public WebDriver driver = null;
		By tshirtMainMenu = By.xpath("//body[1]/div[1]/div[1]/header[1]/div[3]/div[1]/div[1]/div[6]/ul[1]/li[3]/a[1]");

		public TShirtsCategoryPage(WebDriver driver) {
			this.driver=driver;
			
		}
	public void hoverOverTshirtCategory() {
		Actions actions = new Actions(driver);
		WebElement menuOption = driver.findElement(tshirtMainMenu);
		actions.moveToElement(menuOption).perform();
	}
}

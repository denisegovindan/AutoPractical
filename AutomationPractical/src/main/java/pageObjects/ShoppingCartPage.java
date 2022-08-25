package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ShoppingCartPage {
	public WebDriver driver = null;
	
	By addItem =  By.xpath("//header/div[3]/div[1]/div[1]/div[6]/ul[1]/li[1]/a[1]");	                        
	By image = By.xpath("//body[1]/div[1]/div[2]/div[1]/div[3]/div[2]/ul[1]/li[1]/div[1]/div[1]/div[1]/a[1]/img[1]");
	By frame = By.xpath("//iframe[starts-with(@id,'fancybox-frame')]");
	By submit = By.name("Submit");
	By close = By.xpath("//body[1]/div[1]/div[1]/header[1]/div[3]/div[1]/div[1]/div[4]/div[1]/div[1]/span[1]");
	By viewCart = By.xpath("//body[1]/div[1]/div[1]/header[1]/div[3]/div[1]/div[1]/div[3]/div[1]/a[1]");
	By incQuant = By.xpath("//body[1]/div[1]/div[2]/div[1]/div[3]/div[1]/div[2]/table[1]/tbody[1]/tr[1]/td[5]/input[2]");
	By unitP = By.xpath("//body[1]/div[1]/div[2]/div[1]/div[3]/div[1]/div[2]/table[1]/tbody[1]/tr[1]/td[4]/span[1]/span[1]");
	By displayTot = By.xpath("//body[1]/div[1]/div[2]/div[1]/div[3]/div[1]/div[2]/table[1]/tbody[1]/tr[1]/td[6]/span[1]");
	
	public ShoppingCartPage(WebDriver driver) {		
		this.driver=driver;	
	}

	public void addItem() {
		driver.findElement(addItem).click();		 
	}
	public void clickImage() {
		driver.findElement(image).click(); 
	}
	
	public void frameSwitch() {
		 driver.switchTo().frame(driver.findElement(frame));
	}
	public void submit() {
		driver.findElement(submit).click();
	}
	public void active() {
		driver.switchTo().activeElement();
	}
	
	public void closeButton() {
		driver.findElement(close).click();
	}
	
	public void viewCart() {
		driver.findElement(viewCart).click();
	}

	public void increaseQuantity(String quant) {
		driver.findElement(incQuant).clear();
		driver.findElement(incQuant).sendKeys(quant);
	}
	public String unitPrice() {
		return driver.findElement(unitP).getText();
	}
	
	public String displayTotal() {
		return driver.findElement(displayTot).getText();
	}
	
}

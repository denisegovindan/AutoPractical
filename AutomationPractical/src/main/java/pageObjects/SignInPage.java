package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import util.Constant;

public class SignInPage {
	public WebDriver driver = null;
	
	By signIn = By.xpath("//a[contains(text(),'Sign in')]");
	By emailText = 	By.cssSelector("#email");
	By textPassword = By.cssSelector("#passwd");
	By submitLoginButton = By.name("SubmitLogin");
	
	public SignInPage(WebDriver driver) {		
		this.driver=driver;	
	}
	
	public void signInButton() {
		 driver.findElement(signIn).click();
	}

	public void textEmail() {
		driver.findElement(emailText).sendKeys(Constant.Username);
	}
	public void textPassword() {
		driver.findElement(textPassword).sendKeys(Constant.Password);
	}

	public void submitLoginButton() {
		driver.findElement(submitLoginButton).click();
	}
}


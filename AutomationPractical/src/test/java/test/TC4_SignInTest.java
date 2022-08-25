package test;

import java.io.IOException;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pageObjects.SignInPage;
import util.*;

public class TC4_SignInTest extends Base{
	private static WebDriver driver = null;
	
	TC4_SignInTest d;
	@Before
	public void init() throws IOException {
        d= new TC4_SignInTest();
		driver = initializeDriver();
	
	}
	@Test
	public void constantVariableSignIn_TC_4() throws Exception{
        SignInPage  sign = new SignInPage(driver);
        sign.signInButton();    
        sign.textEmail(); 
        sign.textPassword();  
        sign.submitLoginButton();
		}

	@After
	public void teardown()
	{		
		driver.close();	
	}

}

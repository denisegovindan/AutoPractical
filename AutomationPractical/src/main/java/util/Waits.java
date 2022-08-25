package util;

import java.util.Map;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.Response;

public class Waits extends ChromeDriver{ //Custom overide for waits
	@Override
	protected Response execute(String driverCommand, Map<String, ?> parameters) {
	    try {
	        // wait 5000 millis and after that run command
	        Thread.sleep(3000);
	    } catch (InterruptedException ex) {}
	    return super.execute(driverCommand, parameters);
	}
	
}

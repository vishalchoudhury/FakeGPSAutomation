package Framework;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;

import io.appium.java_client.android.AndroidDriver;

public class Shutdown {
	
	public static void driverShutDown(AndroidDriver driver, Logger Log) { 
		Log.info("Going to closedown");
		try {
			driver.quit();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}

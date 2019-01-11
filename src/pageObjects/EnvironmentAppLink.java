package pageObjects;

import org.openqa.selenium.By;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class EnvironmentAppLink {
	
	private static MobileElement element = null;
	
	public static MobileElement activeEnv(AndroidDriver driver) {
		
		element = (MobileElement) driver.findElement(By.id("android:id/summary"));
		
		return element;
		
	}
	
	public static MobileElement changeEnv(AndroidDriver driver) {
		
		element = (MobileElement) driver.findElement(By.xpath("//android.widget.CheckedTextView[@text='Production']"));
		
		return element;
		
	}
	
	public static MobileElement getStarted(AndroidDriver driver) {
		
		element = (MobileElement) driver.findElement(By.id("com.harman.spark:id/get_started"));
		
		return element;
		
	}

}

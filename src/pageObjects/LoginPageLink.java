package pageObjects;

import org.openqa.selenium.By;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class LoginPageLink {
	
	private static MobileElement element = null;
	
	public static MobileElement username(AndroidDriver driver) {
		
		element = (MobileElement) driver.findElement(By.id("username"));
		
		return element;
		
	}
	
	public static MobileElement password(AndroidDriver driver) {
		
		element = (MobileElement) driver.findElement(By.id("password"));
		
		return element;
		
	}
	
	public static MobileElement loginButton(AndroidDriver driver) {
		
		element = (MobileElement) driver.findElement(By.xpath("//android.widget.Button[@text='Login']"));
		
		return element;
		
	}
	
	

}

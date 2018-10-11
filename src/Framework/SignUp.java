package Framework;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.android.AndroidDriver;

public class SignUp {
	
	public static AndroidDriver SignUpPage(AndroidDriver driver) {
		
		PageObjects call = new PageObjects(driver);
		WebDriverWait wait = new WebDriverWait(driver, 60);
		driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
		System.out.println("Going to click the signup button");
		wait.until(ExpectedConditions.elementToBeClickable(call.signupBtn)).click();
		return driver;
		
	}

}

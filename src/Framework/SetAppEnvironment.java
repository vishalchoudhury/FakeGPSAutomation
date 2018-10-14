package Framework;

import org.apache.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class SetAppEnvironment {
	
	public static AndroidDriver chooseEnvironment(AndroidDriver driver, Logger log) {
		
		log.info("Setting prod Environment as a default environment");
		
		WebDriverWait wait = new WebDriverWait(driver, 10);
		
		MobileElement activeEnv = (MobileElement) wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("android:id/summary"))));
		
		Assert.assertTrue(activeEnv.isDisplayed());
		
		activeEnv.click();
		
		log.info("Choosing the env prod");
		
		MobileElement env = (MobileElement) wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//android.widget.CheckedTextView[@text='Production']"))));
		
		Assert.assertEquals(env.getText(),"Production");
		
		env.click();
		
		MobileElement getStarted = (MobileElement) wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("com.harman.spark:id/get_started"))));
		
		Assert.assertTrue(getStarted.isDisplayed());
		
		getStarted.click();
		
		/*MobileElement signUpBtn = (MobileElement) wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("sign-up-mobile"))));
		
		Assert.assertTrue(signUpBtn.isDisplayed());
		
		signUpBtn.click();*/
		
		return driver;
	}

}

package Framework;

import java.io.IOException;

import org.apache.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pageObjects.EnvironmentAppLink;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class SetAppEnvironment {
	
	public static AndroidDriver chooseEnvironment(AndroidDriver driver, Logger log) throws IOException {
		
		log.info("Setting prod Environment as a default environment");
		
		WebDriverWait wait = new WebDriverWait(driver, 10);
		
		MobileElement activeEnv = (MobileElement) wait.until(ExpectedConditions.visibilityOf(EnvironmentAppLink.activeEnv(driver)));
		
		Assert.assertTrue(activeEnv.isDisplayed());
		
		activeEnv.click();
		
		log.info("Choosing the env prod");
		
		MobileElement env = (MobileElement) wait.until(ExpectedConditions.visibilityOf(EnvironmentAppLink.changeEnv(driver)));
		
		Assert.assertEquals(env.getText(),"Staging");
		
		env.click();
		
		MobileElement getStarted = (MobileElement) wait.until(ExpectedConditions.visibilityOf(EnvironmentAppLink.getStarted(driver)));
		
		Assert.assertTrue(getStarted.isDisplayed());
		
		driver = Screenshot.takeScreenshot(driver);
		
		getStarted.click();
		
		return driver;
	}

}

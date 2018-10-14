package Framework;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.log4testng.Logger;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class LoginPage {
	
	public static AndroidDriver loginAction(AndroidDriver driver, String username, String password) {
		
		WebDriverWait wait = new WebDriverWait(driver, 10);
		
		//log.info("Seting up the username");
		
		MobileElement uName = (MobileElement) wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("username"))));
		
		Assert.assertTrue(uName.isDisplayed());
		
		uName.sendKeys(username);
		
		MobileElement pWord = (MobileElement) wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("password"))));
		
		Assert.assertTrue(pWord.isDisplayed());
		
		pWord.sendKeys(password);
		
		MobileElement loginBtn = (MobileElement) wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.className("android.widget.Button"))));
		
		Assert.assertTrue(loginBtn.isDisplayed());
		
		loginBtn.click();
		
		MobileElement account_icon = (MobileElement) wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//android.view.ViewGroup[@text='Account']"))));
		
		Assert.assertTrue(account_icon.isDisplayed());
		
		account_icon.click();
		
		MobileElement signOutBtn = (MobileElement) wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("com.harman.spark:id/account_sign_out"))));
		
		Assert.assertTrue(signOutBtn.isDisplayed());
		
		signOutBtn.click();
		return driver;
	}

}

package Framework;

import java.io.File;
import java.io.IOException;
import java.util.UUID;

import org.apache.commons.io.FileUtils;
import org.junit.Assert;
import pageObjects.LoginPageLink;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.log4testng.Logger;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class LoginPage {
	
	public static AndroidDriver loginAction(AndroidDriver driver, String username, String password) throws IOException {
		
		WebDriverWait wait = new WebDriverWait(driver, 10);
		
		//log.info("Seting up the username");
		
		MobileElement uname = (MobileElement )wait.until(ExpectedConditions.visibilityOf(LoginPageLink.username(driver)));
		
		Assert.assertTrue(uname.isDisplayed());
		
		uname.sendKeys(username);
		
		driver = Screenshot.takeScreenshot(driver);
		
		MobileElement pWord = (MobileElement) wait.until(ExpectedConditions.visibilityOf(LoginPageLink.password(driver)));
		
		Assert.assertTrue(pWord.isDisplayed());
		
		pWord.sendKeys(password);
		
		driver.hideKeyboard();
		
		driver = Screenshot.takeScreenshot(driver);
		
		MobileElement loginBtn = (MobileElement) wait.until(ExpectedConditions.visibilityOf(LoginPageLink.loginButton(driver)));
		
		Assert.assertTrue(loginBtn.isDisplayed());
		
		loginBtn.click();
		
		return driver;
	}

}

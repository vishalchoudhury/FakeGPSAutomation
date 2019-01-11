package Framework;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pageObjects.DashboardPageLink;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import junit.framework.Assert;

public class DashboardPage {
	
	public static AndroidDriver clickWatchIt(AndroidDriver driver) throws IOException {
		
		WebDriverWait wait = new WebDriverWait(driver, 20);
		
		MobileElement watchItButton = (MobileElement) wait.until(ExpectedConditions.visibilityOf(DashboardPageLink.watchITLink(driver)));
		
		Assert.assertTrue(watchItButton.isDisplayed());
		
		watchItButton.click();
		
		driver = Screenshot.takeScreenshot(driver);
		
		return driver;
	}
	
	public static AndroidDriver clickWifi(AndroidDriver driver) throws IOException {
		
		WebDriverWait wait = new WebDriverWait(driver, 20);
		
		MobileElement wifiButton = (MobileElement) wait.until(ExpectedConditions.visibilityOf(DashboardPageLink.wifiLink(driver)));
		
		Assert.assertTrue(wifiButton.isDisplayed());
		
		wifiButton.click();
		
		driver = Screenshot.takeScreenshot(driver);
		
		return driver;
	}

	public static AndroidDriver clickVirtualMechanic(AndroidDriver driver) throws IOException {
		
		WebDriverWait wait = new WebDriverWait(driver, 20);
		
		MobileElement virtualMechanicButton = (MobileElement) wait.until(ExpectedConditions.visibilityOf(DashboardPageLink.virtualMechanicLink(driver)));
		
		Assert.assertTrue(virtualMechanicButton.isDisplayed());
		
		virtualMechanicButton.click();
		
		MobileElement backButton = (MobileElement) wait.until(ExpectedConditions.visibilityOf(DashboardPageLink.backButtonLink(driver)));
		
		backButton.click();
		
		driver = Screenshot.takeScreenshot(driver);
		
		return driver;
	}
	
	public static AndroidDriver clickBatteryStatus(AndroidDriver driver) throws IOException, InterruptedException {
		
		WebDriverWait wait = new WebDriverWait(driver, 20);
		
		MobileElement BatteryStatusButton = (MobileElement) wait.until(ExpectedConditions.visibilityOf(DashboardPageLink.batteryStatusLink(driver)));
		
		Assert.assertTrue(BatteryStatusButton.isDisplayed());
		
		BatteryStatusButton.click();
		
		MobileElement backButton = (MobileElement) wait.until(ExpectedConditions.visibilityOf(DashboardPageLink.backButtonLink(driver)));
		
		Thread.sleep(5000);
		
		driver = Screenshot.takeScreenshot(driver);
		
		backButton.click();
		
		return driver;
	}
	
	public static AndroidDriver chevron(AndroidDriver driver) throws IOException {
		
		WebDriverWait wait = new WebDriverWait(driver, 20);
		
		MobileElement chevronButton = (MobileElement) wait.until(ExpectedConditions.visibilityOf(DashboardPageLink.chevronLink(driver)));
		
		Assert.assertTrue(chevronButton.isDisplayed());
		
		chevronButton.click();
		
		return driver;
	}
	
	public static AndroidDriver DrivingScore(AndroidDriver driver) throws IOException {
		
		WebDriverWait wait = new WebDriverWait(driver, 20);
		
		MobileElement drivingScoreButton = (MobileElement) wait.until(ExpectedConditions.visibilityOf(DashboardPageLink.drivingScoreLink(driver)));
		
		Assert.assertTrue(drivingScoreButton.isDisplayed());
		
		drivingScoreButton.click();
		
		MobileElement backButton = (MobileElement) wait.until(ExpectedConditions.visibilityOf(DashboardPageLink.backButtonLink(driver)));
		
		driver = Screenshot.takeScreenshot(driver);
		
		backButton.click();
		
		return driver;
	}
	
	public static AndroidDriver LastTripDetail(AndroidDriver driver) throws IOException {
		
		WebDriverWait wait = new WebDriverWait(driver, 20);
		
		MobileElement tripDetailButton = (MobileElement) wait.until(ExpectedConditions.visibilityOf(DashboardPageLink.lastTripLink(driver)));
		
		Assert.assertTrue(tripDetailButton.isDisplayed());
		
		tripDetailButton.click();
		
		MobileElement backButton = (MobileElement) wait.until(ExpectedConditions.visibilityOf(DashboardPageLink.backButtonLink(driver)));
		
		driver = Screenshot.takeScreenshot(driver);
		
		backButton.click();
		
		return driver;
	}
	
	public static AndroidDriver ViewAllTrip(AndroidDriver driver) throws IOException {
		
		WebDriverWait wait = new WebDriverWait(driver, 20);
		
		MobileElement viewAllTripButton = (MobileElement) wait.until(ExpectedConditions.visibilityOf(DashboardPageLink.viewAllTripLink(driver)));
		
		Assert.assertTrue(viewAllTripButton.isDisplayed());
		
		viewAllTripButton.click();
		
		MobileElement backButton = (MobileElement) wait.until(ExpectedConditions.visibilityOf(DashboardPageLink.backButtonLink(driver)));
		
		backButton.click();
		
		driver = Screenshot.takeScreenshot(driver);
		
		return driver;
	}
	
	public static AndroidDriver geofence(AndroidDriver driver) throws IOException {
		
		WebDriverWait wait = new WebDriverWait(driver, 20);
		
		MobileElement geofenceButton = (MobileElement) wait.until(ExpectedConditions.visibilityOf(DashboardPageLink.geofenceLink(driver)));
		
		Assert.assertTrue(geofenceButton.isDisplayed());
		
		geofenceButton.click();
		
		MobileElement backButton = (MobileElement) wait.until(ExpectedConditions.visibilityOf(DashboardPageLink.geoFencebackLink(driver)));
		
		backButton.click();
		
		driver = Screenshot.takeScreenshot(driver);
		
		return driver;
	}
	
	public static AndroidDriver FamilyShare(AndroidDriver driver) throws IOException {
		
		WebDriverWait wait = new WebDriverWait(driver, 20);
		
		String visibleText = "MANAGE";
		
		driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(1)).scrollIntoView(new UiSelector().textContains(\""+visibleText+"\").instance(0))");
		
		MobileElement familyShareButton = (MobileElement) wait.until(ExpectedConditions.visibilityOf(DashboardPageLink.familyShareLink(driver)));
		
		Assert.assertTrue(familyShareButton.isDisplayed());
		
		familyShareButton.click();
		
		MobileElement backButton = (MobileElement) wait.until(ExpectedConditions.visibilityOf(DashboardPageLink.backButtonLink(driver)));
		
		driver = Screenshot.takeScreenshot(driver);
		
		backButton.click();
		
		return driver;
	}
	
	public static AndroidDriver vehiclePreferences(AndroidDriver driver) throws IOException {
		
		WebDriverWait wait = new WebDriverWait(driver, 20);
		
		String visibleText = "SETTINGS";
		
		driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\""+visibleText+"\").instance(0))").click();;
		
		
		/*MobileElement vehiclePreferencesButton = (MobileElement) wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("com.harman.spark:id/home_panel_vehicle_preference_settings"))));
		
		Assert.assertTrue(vehiclePreferencesButton.isDisplayed());
		
		vehiclePreferencesButton.click();*/
		
		MobileElement backButton = (MobileElement) wait.until(ExpectedConditions.visibilityOf(DashboardPageLink.backButtonLink(driver)));
		
		driver = Screenshot.takeScreenshot(driver);
		
		backButton.click();
		
		return driver;
	}
	
	public void scrollAndClick(String visibleText, AndroidDriver driver) {
	    
		driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\""+visibleText+"\").instance(0))").click();
		
	}
}

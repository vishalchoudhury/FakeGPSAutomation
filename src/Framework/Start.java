package Framework;

import java.io.File;
import java.net.URL;
import java.util.AbstractMap.SimpleEntry;
import java.util.concurrent.TimeUnit;

import org.apache.commons.logging.Log;
import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.ConsoleAppender;
import org.apache.log4j.FileAppender;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.apache.log4j.PatternLayout;
import org.apache.log4j.SimpleLayout;
import org.apache.poi.hwpf.model.SavedByEntry;
import org.jboss.netty.util.Timeout;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.functions.ExpectedCondition;
import io.appium.java_client.remote.AndroidMobileCapabilityType;

public class Start {

	public static AndroidDriver driver;
	//public static Logger Log = Logger.getLogger(Logger.class.getName());
	//static Logger mainLogger = LogManager.getLogger(SavedByEntry.class.getName());
	
	public static void main(String[] args) throws Exception {
		
		/*BasicConfigurator.configure();
		ConsoleAppender appender = new ConsoleAppender();
		mainLogger.addAppender(appender);
		mainLogger.info("This is just a logger");
		appender.activateOptions();
		PatternLayout layoutHelper = new PatternLayout();
		layoutHelper.setConversionPattern("%-5p [%t]: %m%n");
		layoutHelper.activateOptions();
		appender.setLayout(layoutHelper);
		mainLogger.addAppender(appender);
		mainLogger.info("Pattern 1 is displayed like this");
		layoutHelper.setConversionPattern("%C %m%n");
		mainLogger.info("Pattern 2 is displayed like this");*/
		
		Logger OutLogger = new LogManager().getLogger("OutLogger");
		//BasicConfigurator.configure();
		FileAppender fileAppender = new FileAppender();
		fileAppender.setFile("test-output\\logfile.txt");
		fileAppender.setLayout(new SimpleLayout());
		OutLogger.addAppender(fileAppender);
		fileAppender.activateOptions();
		
		OutLogger.debug("Assigning the capabilities to the driver");
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability("deviceName", "Huawei P20");
		capabilities.setCapability(CapabilityType.PLATFORM, "Android");
		capabilities.setCapability("platformVersion", "8.0.0");
		capabilities.setCapability("platformName", "Android");
		capabilities.setCapability(AndroidMobileCapabilityType.ENABLE_PERFORMANCE_LOGGING,true);
		capabilities.setCapability("autoGrantPermissions", true);
		File file = new File("C:\\Apllications and installer\\APK","Spark_V1.9.0.10_stage.apk");
		capabilities.setCapability("app", file);
		capabilities.setCapability("appPackage", "com.harman.spark");
		capabilities.setCapability("appActivity", "com.tantalumcorporation.phoenix.authentication.AuthenticateActivity");
		capabilities.setCapability("clearSystemFiles", "true");
		
		OutLogger.info("Driver is comunicating to the appium client");
		driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
		
		driver.manage().timeouts().implicitlyWait(80, TimeUnit.SECONDS);
		
		WebDriverWait wait = new WebDriverWait(driver, 10);
		
		OutLogger.info("Feeding the UserID");
		
		MobileElement userName = (MobileElement) wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("username"))));
		
		userName.sendKeys("oct4t");
		
		OutLogger.info("Feeding the password");
		
		MobileElement passWord = (MobileElement) wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("password"))));
		
		passWord.sendKeys("Test@123");
		
		OutLogger.info("Goin to click the login button");
		
		MobileElement login = (MobileElement) wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.className("android.widget.Button"))));
		
		login.click();
		
		OutLogger.info("Upscroll the chevron");
		
		capabilities.setCapability("appActivity", "com.tantalumcorporation.phoenix.home.HomeActivity");
		
		driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
		
		Thread.sleep(50000);
		
		MobileElement chevron = (MobileElement) wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("com.tantalumcorporation.phoenix:id/home_bottom_menu_device_name"))));
		
		chevron.click();
		
		OutLogger.info("Going to quit the driver");

		driver.quit();
		
	}

}

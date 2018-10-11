package Framework;

import java.io.File;
import java.net.URL;
import java.util.concurrent.TimeUnit;
import org.apache.log4j.Logger;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.AndroidMobileCapabilityType;

public class Driver {
	
	public static AndroidDriver setDriver(AndroidDriver driver,Logger log, Logger OutLogger, DesiredCapabilities capabilities) {
		
		OutLogger.info("Setting Up the Driver");
		
		capabilities.setCapability("deviceName", "Nexus 6");
		capabilities.setCapability(CapabilityType.PLATFORM, "Android");
		capabilities.setCapability("platformVersion", "7.1.1");
		capabilities.setCapability("platformName", "Android");
		capabilities.setCapability(AndroidMobileCapabilityType.ENABLE_PERFORMANCE_LOGGING,true);
		capabilities.setCapability("autoGrantPermissions", true);
		File file = new File("C:\\Apllications and installer\\APK","app-spark-qaRelease.apk");
		capabilities.setCapability("app", file);
		capabilities.setCapability("appPackage", "com.harman.spark");
		capabilities.setCapability("appActivity", "com.tantalumcorporation.phoenix.common.environment.EnvironmentActivity");
		capabilities.setCapability("clearSystemFiles", "true");
		try {
			driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
		}catch(Exception e) {
			e.printStackTrace();
			OutLogger.info("Driver Failure");
		}
		driver.manage().timeouts().implicitlyWait(80, TimeUnit.SECONDS);
		return driver;
	}

}

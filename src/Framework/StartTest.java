package Framework;

import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class StartTest {
	public static AndroidDriver driver;
	public static DesiredCapabilities capabilities = new DesiredCapabilities();
	public static Logger Log = Logger.getLogger(Logger.class.getName());
	public static Logger OutLogger = new LogManager().getLogger("OutLogger");
	
	
	@Test
	public void loginPage() {
		
		System.out.println("Inside Test");
		
	}
	
	@BeforeTest
	public void beforeTest() {
		Log.info("Setting up the log file");
		
		OutLogger = FileLoggerSetting.fileLoggerSetting(OutLogger);
		
		Log.info("Setting up the driver");
		
		driver = Driver.setDriver(driver,Log,OutLogger,capabilities);
		
		Log.info("Setting up the environment");
		
		driver = SetAppEnvironment.chooseEnvironment(driver, Log);
	}
	
	@AfterTest
	public void afterTest() {
		
		Shutdown.driverShutDown(driver, Log);
		
	}
	

}

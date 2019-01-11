package Framework;

import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import java.io.IOException;
import utility.ExcelUtils;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;

public class StartTest {
	public static AndroidDriver driver;
	public static DesiredCapabilities capabilities = new DesiredCapabilities();
	public static Logger Log = Logger.getLogger(Logger.class.getName());
	public static Logger OutLogger = new LogManager().getLogger("OutLogger");
	public static String Path = "C:\\Users\\VChoudhury\\eclipse-workspace\\HarmanSpark\\testData\\TestData.xlsx";
	public static String SheetName = "TestResult";
	
	@DataProvider(name = "Authentication")
	public static Object[][] credentials() throws Exception {
			
			SheetName = "TestCredentials";
			ExcelUtils.setExcelFile(Path, SheetName);
	        return new Object[][] { { ExcelUtils.getCellData(1, 0), ExcelUtils.getCellData(1, 1)} };
	        
	}
	
	
	@Test(dataProvider = "Authentication", priority = 0)
	public void loginPage(String sUsername, String sPassword) throws Exception {
		
        //ExcelUtils.setExcelFile(Path, SheetName);
		//ExcelUtils.setCellData("Execute Login", 1, 0);
		
		driver = LoginPage.loginAction(driver, sUsername, sPassword);
		
		//ExcelUtils.setCellData("PASS", 1, 1);
		
	}
	
	@Test(priority = 1)
	public void watchItOperation() throws Exception {
		
		//ExcelUtils.setCellData("Execute WatchIT", 2, 0);
		
		driver = DashboardPage.clickWatchIt(driver);
		
		//ExcelUtils.setCellData("PASS", 2, 1);
	}
	
	@Test(priority = 2)
	public void WifiOperation() throws Exception {
		
		//ExcelUtils.setCellData("Execute Wifi", 3, 0);
		
		driver = DashboardPage.clickWifi(driver);
		
		//ExcelUtils.setCellData("PASS", 3, 1);
	}
	
	@Test(priority = 3)
	public void VirtualMechanic() throws Exception {
		
		//ExcelUtils.setCellData("Execute Virtual Mechanic", 4, 0);
		
		driver = DashboardPage.clickVirtualMechanic(driver);
		
		//ExcelUtils.setCellData("PASS", 4, 1);
		
	}
	
	@Test(priority = 4)
	public void clickBatteryStatus() throws Exception {
		
		//ExcelUtils.setCellData("Execute Battery", 5, 0);
		
		driver = DashboardPage.clickBatteryStatus(driver);
		
		//ExcelUtils.setCellData("Execute Battery", 5, 1);
	}
	
	@Test(priority = 5)
	public void clickChevron() throws IOException {
		
		driver = DashboardPage.chevron(driver);
		
	}
	
	@Test(priority = 6)
	public void clickDrivingScore() throws Exception {
		
		//ExcelUtils.setCellData("Execute Driving score", 6, 0);
		
		driver = DashboardPage.DrivingScore(driver);
		
		//ExcelUtils.setCellData("PASS", 6, 1);
		
	}
	
	@Test(priority = 7)
	public void viewLastTripDetail() throws Exception {
		
		//ExcelUtils.setCellData("Execute Last Trip", 7, 0);
		
		driver = DashboardPage.LastTripDetail(driver);
		
		//ExcelUtils.setCellData("PASS", 7, 1);
	}
	
	@Test(priority = 8)
	public void showAllTrips() throws Exception {
		
		//ExcelUtils.setCellData("Execute View All trips", 8, 0);
		
		driver = DashboardPage.ViewAllTrip(driver);
		
		//ExcelUtils.setCellData("PASS", 8, 1);
	}
	
	@Test(priority = 9)
	public void clickGeofence() throws Exception {
		
		//ExcelUtils.setCellData("Execute Geofence", 9, 0);
		
		driver = DashboardPage.geofence(driver);
		
		//ExcelUtils.setCellData("PASS", 9, 1);
		
	}
	
	@Test(priority = 10)
	public void clickFamilyShare() throws Exception {
		
		//ExcelUtils.setCellData("Execute Family Share", 10, 0);
		
		driver = DashboardPage.FamilyShare(driver);
		
		//ExcelUtils.setCellData("PASS", 10, 1);
		
	}
	
	@Test(priority = 11)
	public void clickVehiclePreferences() throws Exception {
		
		//ExcelUtils.setCellData("Execute Vehicle Prefernces", 11, 0);
		
		driver = DashboardPage.vehiclePreferences(driver);
		
		//ExcelUtils.setCellData("PASS", 11, 1);
	}
	
	@BeforeTest
	public void beforeTest() throws IOException {
		DOMConfigurator.configure("log4j.xml");
		
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

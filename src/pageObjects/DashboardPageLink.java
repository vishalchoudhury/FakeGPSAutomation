package pageObjects;

import org.openqa.selenium.By;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class DashboardPageLink {
	
	public static MobileElement element = null;
	
	public static MobileElement backButtonLink(AndroidDriver driver) {
		
		element = (MobileElement) driver.findElement(By.className("android.widget.ImageButton"));
		
		return element;
	}
	
	public static MobileElement geoFencebackLink(AndroidDriver driver) {
		
		element = (MobileElement) driver.findElement(By.xpath("//android.widget.ImageButton[@content-desc='Navigate up']"));
		
		return element;
	}
	
	public static MobileElement watchITLink(AndroidDriver driver) {
		
		element = (MobileElement) driver.findElement(By.id("com.harman.spark:id/lookout_panel"));
		
		return element;
	}
	
	public static MobileElement wifiLink(AndroidDriver driver) {
		
		element = (MobileElement) driver.findElement(By.id("com.harman.spark:id/wifi_panel"));
		
		return element;
	}
	
	public static MobileElement virtualMechanicLink(AndroidDriver driver) {
		
		element = (MobileElement) driver.findElement(By.id("com.harman.spark:id/vehicle_health_panel"));
		
		return element;
	}
	
	public static MobileElement batteryStatusLink(AndroidDriver driver) {
		
		element = (MobileElement) driver.findElement(By.id("com.harman.spark:id/battery_health_panel"));
		
		return element;
	}

	public static MobileElement chevronLink(AndroidDriver driver) {
		
		element = (MobileElement) driver.findElement(By.id("com.harman.spark:id/home_bottom_sheet_header_touch"));
		
		return element;
	}
	
	public static MobileElement drivingScoreLink(AndroidDriver driver) {
		
		element = (MobileElement) driver.findElement(By.id("com.harman.spark:id/driving_score_panel_learn_more"));
		
		return element;
	}
	
	public static MobileElement lastTripLink(AndroidDriver driver) {
		
		element = (MobileElement) driver.findElement(By.id("com.harman.spark:id/last_trip_panel_more_details"));
		
		return element;
	}
	
	public static MobileElement viewAllTripLink(AndroidDriver driver) {
		
		element = (MobileElement) driver.findElement(By.id("com.harman.spark:id/last_trip_panel_all_trips_details"));
		
		return element;
	}
	
	public static MobileElement geofenceLink(AndroidDriver driver) {
		
		element = (MobileElement) driver.findElement(By.id("com.harman.spark:id/places_panel_cta_button"));
		
		return element;
	}
	
	public static MobileElement familyShareLink(AndroidDriver driver) {
		
		element = (MobileElement) driver.findElement(By.id("com.harman.spark:id/home_bottom_family_sharing_button"));
		
		return element;
	}
	
	public static MobileElement vehiclePreferenceLink(AndroidDriver driver) {
		
		element = (MobileElement) driver.findElement(By.id("com.harman.spark:id/home_panel_vehicle_preference_settings"));
		
		return element;
	}
	
}

package Framework;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PageObjects {
	
	AndroidDriver driver;
	
	public PageObjects(AndroidDriver driver) {
		
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	//Signup link
	@FindBy(id="sign-up-mobile")
	public MobileElement signupBtn;
	
	
}

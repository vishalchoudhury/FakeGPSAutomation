package Framework;

import java.io.File;
import java.io.IOException;
import java.util.UUID;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;

import io.appium.java_client.android.AndroidDriver;

public class Screenshot {
	
	public static AndroidDriver takeScreenshot(AndroidDriver driver) throws IOException{
		
		File srcFile=driver.getScreenshotAs(OutputType.FILE);
	    String filename=UUID.randomUUID().toString(); 
	    String path_screenshot = "C:\\Users\\VChoudhury\\eclipse-workspace\\HarmanSpark\\UIAutomatorClips\\";
		File targetFile=new File(path_screenshot + filename +".jpg");
	    FileUtils.copyFile(srcFile,targetFile);
	    return driver;
	}

}

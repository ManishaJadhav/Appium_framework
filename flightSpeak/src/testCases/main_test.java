package testCases;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.appium.java_client.android.AndroidDriver;
import utility.Constant;
import utility.ExcelUtils;

public class main_test {
	
	public static void main(String args[]) throws Exception
	{
		WebDriver driver;

		
		ExcelUtils.setExcelFile(Constant.Path_TestData + Constant.File_TestData,"Capabilities");
		
		  DesiredCapabilities capabilities = new DesiredCapabilities();
		  
		  String BROWSER_NAME = ExcelUtils.getCellData(Constant.Android_capabilities, Constant.BROWSER_NAME);
		  capabilities.setCapability("BROWSER_NAME", BROWSER_NAME);
			
			String VERSION = ExcelUtils.getCellData(Constant.Android_capabilities, Constant.VERSION);
			capabilities.setCapability("VERSION", VERSION); 
			
			String deviceName = ExcelUtils.getCellData(Constant.Android_capabilities, Constant.deviceName);
			capabilities.setCapability("deviceName",deviceName);
			
			
			String platformName = ExcelUtils.getCellData(Constant.Android_capabilities, Constant.platformName);
			capabilities.setCapability("platformName",platformName);
			
			String path = ExcelUtils.getCellData(Constant.Android_capabilities, Constant.path);
			File file = new File (path);
			 capabilities.setCapability("app",file.getAbsolutePath());
			 capabilities.setCapability("resetKeyboard", true);
		   driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
	}

}

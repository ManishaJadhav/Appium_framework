package testCases;

import io.appium.java_client.android.AndroidDriver;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class testsa {
	
	
	public static void main(String args[]) throws Exception
	{
		
		WebDriver driver;

			
			 
		  DesiredCapabilities capabilities = new DesiredCapabilities();
			capabilities.setCapability("BROWSER_NAME", "Android");
			capabilities.setCapability("VERSION", "6.0"); 
			capabilities.setCapability("deviceName","ZX1D62QSMV");
			capabilities.setCapability("platformName","Android");
			File file = new File ("E:\\Workspace\\flightSpeak\\src\\apk\\Time4CareEvv2.apk");
			 capabilities.setCapability("app",file.getAbsolutePath());
		   driver = new RemoteWebDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
				//System.out.println("patform is correct");
				 
					System.out.println("apk is correct");
					
	}

}

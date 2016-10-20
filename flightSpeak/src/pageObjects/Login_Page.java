package pageObjects;

import io.appium.java_client.DeviceActionShortcuts;
import io.appium.java_client.android.AndroidDeviceActionShortcuts;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidKeyCode;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Login_Page extends BaseClass {
    
	static WebElement element;
	 public Login_Page(WebDriver driver){
     	super(driver);
 }      

	 public static WebElement  txt_username()
	 
	 {
		 element = driver.findElement(By.xpath("//android.widget.EditText[@text = 'Username']"));
		 
		return element;
		 
	 }
	 

	 public static WebElement  txt_Password()
	 
	 {
		
		 element = driver.findElement(By.xpath("//android.widget.EditText[@resource-id ='com.paragyte.publicpartnerships.evv:id/activityLoginEdtPassword']"));
		 
		return element;
		
		 
	 }
	 
 public static WebElement  btn_LogIN()
	 
	 {
		 element = driver.findElement(By.xpath("//android.widget.Button[@text = 'Login']"));
		 
		return element;
		 
	 }
 public static void  back()
 
 {
	 ((AndroidDeviceActionShortcuts) driver).pressKeyCode(AndroidKeyCode.BACK);
	 
	
	 
 }
 
 
 
}

package Snapshot.AWSTest;
import io.appium.java_client.android.AndroidDriver;

import java.awt.event.KeyEvent;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;


public class LaunchAppOnEmulator {

	public static void main(String[] args) throws IOException {
		
		 DesiredCapabilities capabilities = new DesiredCapabilities();
		 capabilities.setCapability("deviceName", "Android Emulator");
		 capabilities.setCapability("browserName", "Android");
		 capabilities.setCapability("platformVersion", "4.3");
		 capabilities.setCapability("platformName", "Android");
		
		 capabilities.setCapability("appPackage", "com.android.camera");
		 capabilities.setCapability("appActivity", "com.android.camera.Camera");
		 
		 
		 AndroidDriver driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
		 System.out.println("Application Opened");
		 driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		 Runtime.getRuntime().exec("adb shell input keyevent 115");
		 driver.quit();
	}
	
}

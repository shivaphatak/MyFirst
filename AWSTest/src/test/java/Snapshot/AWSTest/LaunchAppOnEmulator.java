package Snapshot.AWSTest;

import io.appium.java_client.android.AndroidDriver;

import java.io.IOException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

public class LaunchAppOnEmulator {

	public static void main(String[] args) throws IOException {

		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability("deviceName", "Android Emulator");
		capabilities.setCapability("browserName", "Android");
		capabilities.setCapability("platformVersion", "4.3");
		capabilities.setCapability("platformName", "Android");

		capabilities.setCapability("appPackage", "com.android.camera");
		capabilities.setCapability("appActivity", "com.android.camera.Camera");
		capabilities.setCapability("appPackage",
				"in.amazon.mShop.android.shopping");
		capabilities.setCapability("appActivity",
				"com.amazon.mShop.home.HomeActivity");

		AndroidDriver driver = new AndroidDriver(new URL(
				"http://127.0.0.1:4723/wd/hub"), capabilities);
		System.out.println("Application Opened");
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.findElement(By.id("in.amazon.mShop.android.shopping:id/action_bar_burger_icon")).click();
		// Runtime.getRuntime().exec("adb shell input keyevent 115");
		driver.quit();
	}

}

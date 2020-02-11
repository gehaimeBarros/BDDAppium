package br.com.rsinet_hubTesteBDDAppium.TesteMobileAppiumUtils;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;

public class Driver {
	private static DesiredCapabilities capabilities;

	private static AndroidDriver<WebElement> driver;

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static AndroidDriver<WebElement> Iniciar() throws MalformedURLException {
	//	if (driver == null) {
			capabilities = new DesiredCapabilities();
			capabilities.setCapability(CapabilityType.BROWSER_NAME, "");
			capabilities.setCapability("deviceName", "AOSP on IA Emulator");
			capabilities.setCapability("platformVersion", "9");
			capabilities.setCapability("platformName", "Android");
			capabilities.setCapability("appPackage", "com.Advantage.aShopping");
			capabilities.setCapability("appActivity", "com.Advantage.aShopping.SplashActivity");
			capabilities.setCapability("unicodeKeyboard", true);
			capabilities.setCapability("resetKeyBoard", true);
			driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		//}
		return driver;

	}

	public static void Quit(WebDriver driver) {
		//if (driver != null) {
			driver.quit();
		//	driver = null;
		}
	}





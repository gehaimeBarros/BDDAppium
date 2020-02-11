package br.com.rsinet_hubTesteBDDAppium.TesteMobileAppiumSteps;

import java.net.MalformedURLException;

import org.openqa.selenium.WebElement;

import br.com.rsinet_hubTesteBDDAppium.TesteMobileAppiumUtils.Driver;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import io.appium.java_client.android.AndroidDriver;

public class Hooks {
public static AndroidDriver<WebElement> driver;
	
	@Before
	public void before() throws MalformedURLException {
	driver = Driver.Iniciar();
		
	}
	@After
	public void after() {
		Driver.Quit(driver);
	}

}


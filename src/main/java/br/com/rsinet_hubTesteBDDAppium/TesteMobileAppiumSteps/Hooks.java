package br.com.rsinet_hubTesteBDDAppium.TesteMobileAppiumSteps;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.cucumber.listener.Reporter;
import com.google.common.io.Files;

import br.com.rsinet_hubTesteBDDAppium.TesteMobileAppiumUtils.TestCont;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class Hooks {

	public AndroidDriver<MobileElement> driver;
	private TestCont testContext;
	public Hooks(TestfCont context) {
		testContext = context;
	}
	
	@Before
	public void before() throws MalformedURLException {
		driver = testContext.getDriverFactory().getDriver();

	}

	@After
	public void after(Scenario scenario) {
		String screenshotName = scenario.getName().replaceAll(" ", "_");
		try {
			File sourcePath = ((TakesScreenshot) testContext.getDriverFactory().getDriver())
					.getScreenshotAs(OutputType.FILE);

			File destinationPath = new File(
					"C:\\Users\\gehaime.silva\\Documents\\TesteAppimComple\\"
							+ screenshotName + ".png");

			Files.copy(sourcePath, destinationPath);

			Reporter.addScreenCaptureFromPath(destinationPath.toString());
		} catch (IOException e) {
			System.out.println("Erro" + e.getMessage());
		}
		testContext.getDriverFactory().getQuit();
	}

}

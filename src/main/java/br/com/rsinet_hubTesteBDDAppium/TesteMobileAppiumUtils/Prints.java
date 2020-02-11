package br.com.rsinet_hubTesteBDDAppium.TesteMobileAppiumUtils;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.cucumber.listener.Reporter;
import com.google.common.io.Files;

import cucumber.api.Scenario;
import cucumber.api.java.After;

public class Prints {

		@After(order = 1)
		public void afterScenario(Scenario scenario) {
			String screenshotName = scenario.getName().replaceAll(" ", "_");
			try {

				File sourcePath = ((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.FILE);

				File destinationPath = new File("C:\\Users\\gehaime.silva\\Pictures\\Appium" + screenshotName + Gerar.dataHoraParaArquivo() + ".png");

				Files.copy(sourcePath, destinationPath);

				Reporter.addScreenCaptureFromPath(destinationPath.toString());

			} catch (IOException e) {
				System.out.println("falha no Teste");
			}

		}
	}
package br.com.rsinet_hubTesteBDDAppium.TesteMobileAppiumBDD;

import java.io.File;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import com.cucumber.listener.Reporter;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "C:\\Users\\gehaime.silva\\Desktop\\APPIUMBDD\\TesteMobileAppiumBDD\\Features\\Lupa_Test.feature",
		glue = "br.com.rsinet_hubTesteBDDAppium/TesteMobileAppiumSteps",
		plugin = {"com.cucumber.listener.ExtentCucumberFormatter:C:\\Users\\gehaime.silva\\Pictures\\Appium\\Cadastro.html"},
     	monochrome = true,
     	snippets = SnippetType.CAMELCASE,
		dryRun = false

		)
public class Runner {
	@AfterClass
	public static void writeExtentReport() {
	Reporter.loadXMLConfig(new File("C:\\Users\\gehaime.silva\\Desktop\\APPIUMBDD\\TesteMobileAppiumBDD\\extension-config.xml"));
	}
}
package br.com.rsinet_hubTesteBDDAppium.TesteMobileAppiumBDD;

import java.io.File;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import com.cucumber.listener.Reporter;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "C:\\Users\\gehaime.silva\\Desktop\\4444444444444444\\BDDAppium\\Features",
		glue = "br.com.rsinet_hubTesteBDDAppium/TesteMobileAppiumSteps",
		plugin = {"com.cucumber.listener.ExtentCucumberFormatter:C:\\Users\\gehaime.silva\\Documents\\TesteAppimComple\\CadastroDoUsuarioECompra.html"},
     	monochrome = true,
     	snippets = SnippetType.CAMELCASE,
		dryRun = false

		)
public class Runner {
	@AfterClass
	public static void writeExtentReport() {
	Reporter.loadXMLConfig(new File("C:\\Users\\gehaime.silva\\Desktop\\4444444444444444\\BDDAppium\\extension-config.xml"));
	}
}
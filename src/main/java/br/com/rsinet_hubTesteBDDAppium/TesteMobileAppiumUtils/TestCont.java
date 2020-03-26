package br.com.rsinet_hubTesteBDDAppium.TesteMobileAppiumUtils;

import java.net.MalformedURLException;

public class TestCont {
	
	private Driver driverManager;
	private PageObjectManager pageObjectManager;

	public TestCont() throws MalformedURLException {
		driverManager = new Driver();
		pageObjectManager = new PageObjectManager(Driver.Iniciar());

	}

	public  Driver getDriverFactory() {
		return driverManager;

	}

	public PageObjectManager getPageObjectFactory() {
		return pageObjectManager;

	}

}

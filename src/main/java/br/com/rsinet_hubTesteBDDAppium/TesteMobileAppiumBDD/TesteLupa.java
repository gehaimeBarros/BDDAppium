package br.com.rsinet_hubTesteBDDAppium.TesteMobileAppiumBDD;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;


public class TesteLupa {
	
	public TesteLupa(AndroidDriver<MobileElement> driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(how = How.ID, using = "com.Advantage.aShopping:id/editTextSearch")
	private static WebElement Procura;
	@FindBy(how = How.ID, using = "com.Advantage.aShopping:id/imageViewSearch")
	private static WebElement Busca;
	@FindBy(how = How.ID, using = "com.Advantage.aShopping:id/editTextSearch")
	private static WebElement procurarProduto;
	@FindBy(how = How.ID, using = "com.Advantage.aShopping:id/imageViewSearch")
	private static WebElement clicaPraBusca;
	@FindBy(how = How.XPATH, using = "//android.widget.RelativeLayout[@content-desc=\"Search\"]/android.widget.LinearLayout/android.widget.GridView/android.widget.RelativeLayout[4]/android.widget.TextView[1]")
	private static WebElement product;
	
	public void Search() {
		Procura.click();
		Procura.sendKeys("mice");
	}
	public void buscar() {
		Busca.click();
	}
	public void procurarProduto() {
		procurarProduto.click();
		procurarProduto.sendKeys("Xiaomi");
	}
	public void clica() {
		clicaPraBusca.click();
	}
	public void product() {
		product.click();
	}
}




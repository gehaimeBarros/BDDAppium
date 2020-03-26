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
	@FindBy(how = How.XPATH, using = "//android.widget.RelativeLayout[@content-desc=\"Search\"]/android.widget.LinearLayout/android.widget.GridView/android.widget.RelativeLayout[3]")
	private static WebElement product;
	@FindBy(how = How.ID, using = "com.Advantage.aShopping:id/textViewProductName")
	private static WebElement Respos1;
	@FindBy(how = How.ID, using = "com.Advantage.aShopping:id/textViewNoProductsToShow")
	private static WebElement Respos2;
	
	public String getRespos1() {
		return Respos1.getText();
	}
	public String getRespos2() {
		return Respos2.getText();
	}

	public void getSearch() {
		Procura.click();
		Procura.sendKeys("tablet");
	}
	public void getBuscar() {
		Busca.click();
	}
	public void getProcurarProduto() {
		procurarProduto.click();
		procurarProduto.sendKeys("Xiaomi");
	}
	public void getClica() {
		clicaPraBusca.click();
	}
	public void getProduct() {
		product.click();
	}
}




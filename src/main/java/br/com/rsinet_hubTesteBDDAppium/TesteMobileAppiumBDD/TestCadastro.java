package br.com.rsinet_hubTesteBDDAppium.TesteMobileAppiumBDD;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import br.com.rsinet_hubTesteBDDAppium.TesteMobileAppiumUtils.Constantes;
import br.com.rsinet_hubTesteBDDAppium.TesteMobileAppiumUtils.Driver;
import br.com.rsinet_hubTesteBDDAppium.TesteMobileAppiumUtils.Excell;
import io.appium.java_client.MobileElement;
import io.appium.java_client.PerformsTouchActions;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.offset.PointOption;

public class TestCadastro {
	
	private TouchAction actions = new TouchAction((PerformsTouchActions) Driver.driver);
	
	public TestCadastro(AndroidDriver<MobileElement> driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(how = How.ID, using = "com.Advantage.aShopping:id/imageViewMenu")
	private static WebElement novo;
	@FindBy(how = How.ID, using = "com.Advantage.aShopping:id/textViewMenuUser")
	private static WebElement menu;
	@FindBy(how = How.ID, using = "com.Advantage.aShopping:id/textViewSingUpToday")
	private static WebElement novaConta;
	@FindBy(how = How.XPATH, using = "//android.view.ViewGroup[@content-desc=\"Home Page\"]/android.widget.LinearLayout[2]/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.RelativeLayout/android.widget.EditText")
	private static WebElement usuario;
	@FindBy(how = How.XPATH, using = "//android.view.ViewGroup[@content-desc=\"Home Page\"]/android.widget.LinearLayout[2]/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.RelativeLayout/android.widget.EditText")
	private static WebElement email;
	@FindBy(how = How.XPATH, using = "//android.view.ViewGroup[@content-desc=\"Home Page\"]/android.widget.LinearLayout[2]/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[3]/android.widget.RelativeLayout/android.widget.EditText")
	private static WebElement senha;
	@FindBy(how = How.XPATH, using = "//android.view.ViewGroup[@content-desc=\"Home Page\"]/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[4]/android.widget.RelativeLayout/android.widget.EditText")
	private static WebElement confirmaSenha;
	@FindBy(how = How.XPATH, using = "//android.view.ViewGroup[@content-desc=\"Home Page\"]/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.RelativeLayout[1]/android.widget.EditText")
	private static WebElement nome;
	@FindBy(how = How.XPATH, using = "//android.view.ViewGroup[@content-desc=\"Home Page\"]/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.RelativeLayout[2]/android.widget.EditText")
	private static WebElement sobrenome;
	@FindBy(how = How.XPATH, using = "//android.view.ViewGroup[@content-desc=\"Home Page\"]/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.EditText")
	private static WebElement telefone;
	@FindBy(how = How.ID, using = "com.Advantage.aShopping:id/textViewCountries")
	private static WebElement pais;
	@FindBy(how = How.XPATH, using = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.TextView[2]")
	private static WebElement selecionarPais;
	@FindBy(how = How.XPATH, using = "//*[@resource-id='com.Advantage.aShopping:id/AosEditTextState']/child::*[1]")
	private static WebElement estado;
	@FindBy(how = How.XPATH, using = "//*[@resource-id='com.Advantage.aShopping:id/AosEditTextStreet']/child::*[1]")
	private static WebElement endereco;
	@FindBy(how = How.XPATH, using = "//*[@resource-id='com.Advantage.aShopping:id/AosEditTextCity']/child::*[1]")
	private static WebElement cidade;
	@FindBy(how = How.XPATH, using = "//*[@resource-id='com.Advantage.aShopping:id/AosEditTextZip']/child::*[1]")
	private static WebElement Cep;
	@FindBy(how = How.ID, using = "com.Advantage.aShopping:id/buttonRegister")
	private static WebElement registrar;
	@FindBy(how = How.ID, using = "com.Advantage.aShopping:id/buttonRegister")
	private static WebElement registrar2;
	@FindBy(how = How.ID, using = "com.Advantage.aShopping:id/imageViewMenu")
	private static WebElement Opçoes;
	@FindBy(how = How.ID, using = "com.Advantage.aShopping:id/textViewMenuUser")
	private static WebElement Resp1;
	@FindBy(how = How.ID, using = "com.Advantage.aShopping:id/textViewMenuUser")
	private static WebElement Resp2;
	
	public void registrar2() {
		registrar2.click();
	}
	public String Resp1() {
		return Resp1.getText();
	}
	public String Resp2() {
		return Resp2.getText();
	}

	public void MenuDeAçoes() {
		novo.click();
		menu.click();
		novaConta.click();
	}

	@SuppressWarnings("rawtypes")
	public void CadastroDeCliente (AndroidDriver<MobileElement> driver) throws Exception {
		Excell.setExcelFile(Constantes.caminho + Constantes.arquivo, "Planilha1");
		usuario.click();
		usuario.sendKeys(Excell.getCellData(0, 1));
		email.click();
		email.sendKeys(Excell.getCellData(1, 1));
		senha.click();
		senha.sendKeys(Excell.getCellData(2, 1));
		confirmaSenha.click();
		confirmaSenha.sendKeys(Excell.getCellData(3, 1));
		actions.press(PointOption.point(1068, 1120)).moveTo(PointOption.point(1071, 253)).release().perform();
		nome.click();
		nome.sendKeys(Excell.getCellData(4, 1));
		sobrenome.click();
		sobrenome.sendKeys(Excell.getCellData(5, 1));
		telefone.click();
		telefone.sendKeys(Excell.getCellData(6, 1));
		pais.click();
		selecionarPais.click();
		estado.click();
		estado.sendKeys(Excell.getCellData(8, 1));
		endereco.click();
		endereco.sendKeys(Excell.getCellData(9, 1));
		cidade.click();
		cidade.sendKeys(Excell.getCellData(10, 1));
		Cep.click();
		Cep.sendKeys(Excell.getCellData(11, 1));
		actions.press(PointOption.point(1056, 1771)).moveTo(PointOption.point(1065, 992)).release().perform();
	}
	
	public void registrar() {
		registrar.click();
	}
	public void Opçoes() {
		Opçoes.click();
	}
}
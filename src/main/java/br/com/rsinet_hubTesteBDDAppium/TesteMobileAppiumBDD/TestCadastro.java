package br.com.rsinet_hubTesteBDDAppium.TesteMobileAppiumBDD;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.offset.PointOption;

public class TestCadastro {

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
	@FindBy(how = How.ID, using = "com.Advantage.aShopping:id/imageViewMenu")
	private static WebElement Opçoes;

	public void novo() {
		novo.click();
	}

	public void menu() {
		menu.click();
	}

	public void novaConta() {
		novaConta.click();
	}

	public void usuario() {
		usuario.click();
		usuario.sendKeys("GGhhj33");
	}

	public void email() {
		email.click();
		email.sendKeys("gehaime.eww@hotmail.com");
	}

	public void senha() {
		senha.click();
		senha.sendKeys("Am#2019");
	}

	@SuppressWarnings("rawtypes")
	public void confirmaSenha(AndroidDriver<MobileElement> driver) {
		confirmaSenha.click();
		confirmaSenha.sendKeys("Am#2019");
		TouchAction actions = new TouchAction(driver);
		actions.press(PointOption.point(1068, 1120)).moveTo(PointOption.point(1071, 253)).release().perform();

	}

	public void nome() {
		nome.click();
		nome.sendKeys("Gehaime");
	}

	public void sobrenome() {
		sobrenome.click();
		sobrenome.sendKeys("Barros");
	}

	public void telefone() {
		telefone.click();
		telefone.sendKeys("94343-4343");
	}

	public void pais() {
		pais.click();
	}

	public void selecionarPais() {
		selecionarPais.click();
	}

	public void estado() {
		estado.click();
		estado.sendKeys("Funares");
	}

	public void endereco() {
		endereco.click();
		endereco.sendKeys("RrugaGjonme");
	}

	public void cidade() {
		cidade.click();
		cidade.sendKeys("Jagodine ");
	}

	public void Cep(AndroidDriver<MobileElement> driver) {
		Cep.click();
		Cep.sendKeys("04342-344");
		@SuppressWarnings("rawtypes")
		TouchAction actions = new TouchAction(driver);
		actions.press(PointOption.point(1056, 1771)).moveTo(PointOption.point(1065, 992)).release().perform();

	}

	public void registrar() {
		registrar.click();
	}

	public void Opçoes(AndroidDriver<MobileElement> driver) {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(Opçoes)).click();
		//Opçoes.click();
	}

}

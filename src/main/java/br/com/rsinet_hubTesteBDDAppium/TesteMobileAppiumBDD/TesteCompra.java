package br.com.rsinet_hubTesteBDDAppium.TesteMobileAppiumBDD;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;


public class TesteCompra {
	
	public TesteCompra(AndroidDriver<MobileElement> driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(how = How.XPATH, using = "//android.view.ViewGroup[@content-desc=\"Home Page\"]/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.support.v7.widget.RecyclerView/android.widget.RelativeLayout[1]/android.widget.TextView")
	private static WebElement Categoria;
	@FindBy(how = How.XPATH, using = "//android.widget.RelativeLayout[@content-desc=\"Laptops\"]/android.widget.LinearLayout/android.widget.GridView/android.widget.RelativeLayout[4]/android.widget.TextView")
	private static WebElement laptop;
	@FindBy(how = How.ID, using = "com.Advantage.aShopping:id/imageViewMenu")
	private static WebElement Menu;
	@FindBy(how = How.ID, using = "com.Advantage.aShopping:id/textViewMenuUser")
	private static WebElement loggin;
	@FindBy(how = How.XPATH, using = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.LinearLayout[2]/android.widget.RelativeLayout[3]/android.widget.EditText")
	private static WebElement IdUsuario;
	@FindBy(how = How.XPATH, using = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.LinearLayout[2]/android.widget.RelativeLayout[4]/android.widget.EditText")
	private static WebElement Senha;
	@FindBy(how = How.ID, using = "com.Advantage.aShopping:id/buttonLogin")
	private static WebElement confirma;
	@FindBy(how = How.ID, using = "com.Advantage.aShopping:id/textViewProductQuantity")
	private static WebElement quantidade;
	@FindBy(how = How.XPATH, using = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.EditText")
	private static WebElement numeros;
	@FindBy(how = How.ID, using = "com.Advantage.aShopping:id/textViewApply")
	private static WebElement apply;
	@FindBy(how = How.ID, using = "com.Advantage.aShopping:id/buttonProductAddToCart")
	private static WebElement addCarrinho;
	@FindBy(how = How.ID, using = "com.Advantage.aShopping:id/imageViewCart")
	private static WebElement CarrinhoDeCompras;
	@FindBy(how = How.XPATH, using = "//android.view.ViewGroup[@content-desc=\"Home Page\"]/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.support.v7.widget.RecyclerView/android.widget.RelativeLayout[3]/android.widget.TextView")
	private static WebElement tablet;
	@FindBy(how = How.XPATH, using = "//android.widget.RelativeLayout[@content-desc=\"Tablets\"]/android.widget.LinearLayout/android.widget.GridView/android.widget.RelativeLayout[3]/android.widget.TextView[1]")
	private static WebElement EscolherTablet;
	@FindBy(how = How.ID, using = "com.Advantage.aShopping:id/textViewProductName")
	private static WebElement Respo1;
	@FindBy(how = How.ID, using = "com.Advantage.aShopping:id/textViewCartQuantity")
	private static WebElement Respo2;

	public String getRespo1() {
		return Respo1.getText();
	}
	public String getRespo2() {
		return Respo2.getText();
	}
	
	public void getCategoria() {
		Categoria.click();
	}

	public void getLaptop() {
		laptop.click();
	}
	
	public void getMenu() {
		Menu.click();
	}

	public void getLoggin() {
		loggin.click();
	}

	public void getIdUsuario() {
		IdUsuario.sendKeys("Geh7878");
	}

	public void getSenha() {
		Senha.sendKeys("Am#2019");
	}

	public void getConfirma() {
		confirma.click();
	}

	public void getQuantidade() {
		quantidade.click();
	}
	public void getNumero() {
		numeros.sendKeys("100");
	}

	public void getApply() {
		apply.click();
	}

	public void getAddCarrinho() {
		addCarrinho.click();
	}

	public void getCarrinhoDeCompras() {
		CarrinhoDeCompras.click();
	}
	public void getTablet() {
		tablet.click();
	}
	public void getEscolherTablet() {
		EscolherTablet.click();
	}
}




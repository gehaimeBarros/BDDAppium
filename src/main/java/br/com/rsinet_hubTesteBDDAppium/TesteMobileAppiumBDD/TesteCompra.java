package br.com.rsinet_hubTesteBDDAppium.TesteMobileAppiumBDD;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;


public class TesteCompra {
	
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

	public void Categoria() {
		Categoria.click();
	}

	public void laptop() {
		laptop.click();
	}
	
	public void menu() {
		Menu.click();
	}

	public void loggin() {
		loggin.click();
	}

	public void idusuario() {
		IdUsuario.sendKeys("Geh7878");
	}

	public void senha() {
		Senha.sendKeys("Am#2019");
	}

	public void confirma() {
		confirma.click();
	}

	public void quantidade() {
		quantidade.click();
	}
	public void numero() {
		numeros.sendKeys("100");
	}

	public void apply() {
		apply.click();
	}

	public void addCarrinho() {
		addCarrinho.click();
	}

	public void CarrinhoDeCompras() {
		CarrinhoDeCompras.click();
	}
	public void tablet() {
		tablet.click();
	}
	public void EscolherTablet() {
		EscolherTablet.click();
	}
}




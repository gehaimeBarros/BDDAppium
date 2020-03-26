package br.com.rsinet_hubTesteBDDAppium.TesteMobileAppiumUtils;

import br.com.rsinet_hubTesteBDDAppium.TesteMobileAppiumBDD.TestCadastro;
import br.com.rsinet_hubTesteBDDAppium.TesteMobileAppiumBDD.TesteCompra;
import br.com.rsinet_hubTesteBDDAppium.TesteMobileAppiumBDD.TesteLupa;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class PageObjectManager {
	public  AndroidDriver<MobileElement> driver;
	
	private TestCadastro Cadastro;
	private TesteCompra Compra;
	private TesteLupa Busca;

	public PageObjectManager(AndroidDriver<MobileElement> driver) {
		this.driver = driver;
	}

	public TestCadastro getCadastro() {
		return (Cadastro == null) ? Cadastro = new TestCadastro(driver) : Cadastro;
	}

	public TesteCompra getCompra() {
		return (Compra == null) ? Compra = new TesteCompra(driver) : Compra;
	}
	public TesteLupa getBusca() {
		return (Busca == null) ? Busca = new TesteLupa(driver) : Busca;
	}
}
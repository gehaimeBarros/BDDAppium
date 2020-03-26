package br.com.rsinet_hubTesteBDDAppium.TesteMobileAppiumSteps;

import org.junit.Assert;


import br.com.rsinet_hubTesteBDDAppium.TesteMobileAppiumBDD.TestCadastro;
import br.com.rsinet_hubTesteBDDAppium.TesteMobileAppiumUtils.TestCont;
import cucumber.api.java.es.Dado;
import cucumber.api.java.pt.Entao;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class CadastroSteps {

	private static AndroidDriver<MobileElement> driver;
	private TestCadastro cadastro;
	private TestCont testContext;

	public CadastroSteps(TestCont context) {
		testContext = context;
		cadastro = testContext.getPageObjectFactory().getCadastro();
	}


	@Dado("^que estou no aplicativo advantage shopping mobile$")
	public void que_estou_no_aplicativo_advantage_shopping_mobile() throws Throwable {
	}

	@Dado("^clico em fazer login$")
	public void clico_em_fazer_login() throws Throwable {
		cadastro.MenuDeAçoes();
	}

	@Dado("^clico preencher cadastro$")
	public void clico_preencher_cadastro() throws Throwable {
		cadastro.CadastroDeCliente(driver);
	}

	@Entao("^e o usuario estara cadastrado$")
	public void e_o_usuario_estara_cadastrado() throws Throwable {
		cadastro.registrar();
		cadastro.Opçoes();
		Assert.assertTrue(cadastro.Resp1().contains("Gehr32"));


	}

	@Entao("^o usuario nao sera registrado$")
	public void o_usuario_nao_sera_registrado() throws Throwable {
		cadastro.registrar2();
		cadastro.Opçoes();
		Assert.assertTrue(cadastro.Resp2().contains("Gehr32"));


	}
}

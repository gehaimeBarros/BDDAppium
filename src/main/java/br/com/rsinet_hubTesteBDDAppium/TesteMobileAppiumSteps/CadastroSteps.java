package br.com.rsinet_hubTesteBDDAppium.TesteMobileAppiumSteps;

import org.junit.Assert;


import br.com.rsinet_hubTesteBDDAppium.TesteMobileAppiumBDD.TestCadastro;
import br.com.rsinet_hubTesteBDDAppium.TesteMobileAppiumUtils.TestCont;
import cucumber.api.java.es.Dado;
import cucumber.api.java.pt.Entao;

public class CadastroSteps {

	private TestCadastro cadastrando;
	private TestCont testContext;

	public CadastroSteps(TestCont context) {
		testContext = context;
		cadastrando = testContext.getPageObjectFactory().getCadastro();
	}


	@Dado("^que estou no aplicativo advantage shopping mobile$")
	public void que_estou_no_aplicativo_advantage_shopping_mobile() throws Throwable {
	}

	@Dado("^clico em fazer login$")
	public void clico_em_fazer_login() throws Throwable {
		cadastrando.getMenuDeAçoes();
	}

	@Dado("^clico preencher cadastro$")
	public void clico_preencher_cadastro() throws Throwable {
		cadastrando.getCadastroDeCliente();
	}

	@Entao("^e o usuario estara cadastrado$")
	public void e_o_usuario_estara_cadastrado() throws Throwable {
		cadastrando.getRegistrar();
		cadastrando.getOpçoes();
		Assert.assertTrue(cadastrando.getResp1().contains("Jucca25"));


	}

	@Entao("^o usuario nao sera registrado$")
	public void o_usuario_nao_sera_registrado() throws Throwable {
		cadastrando.getRegistrar2();
		cadastrando.getOpçoes2();
		Assert.assertTrue(cadastrando.getResp2().contains("LOGIN"));


	}
}

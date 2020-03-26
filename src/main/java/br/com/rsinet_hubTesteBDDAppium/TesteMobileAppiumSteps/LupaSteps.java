package br.com.rsinet_hubTesteBDDAppium.TesteMobileAppiumSteps;


import org.junit.Assert;

import br.com.rsinet_hubTesteBDDAppium.TesteMobileAppiumBDD.TesteLupa;
import br.com.rsinet_hubTesteBDDAppium.TesteMobileAppiumUtils.TestCont;
import cucumber.api.java.es.Dado;
import cucumber.api.java.pt.Entao;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class LupaSteps {

	public static AndroidDriver<MobileElement> driver;
	private TesteLupa Buscas;
	private TestCont testContext;

	public LupaSteps(TestCont context) {
		testContext = context;
		Buscas = testContext.getPageObjectFactory().getBusca();
	}

	@Dado("^que o usuario na tela incial do aplicativo advantage mobile$")
	public void que_o_usuario_na_tela_incial_do_aplicativo_advantage_mobile() throws Throwable {
		
	}

	@Dado("^que o usuario clica e busca o seu produto$")
	public void que_o_usuario_clica_e_busca_o_seu_produto() throws Throwable {
		Buscas.Search();
		Buscas.buscar();
	}

	@Entao("^a pagina do resultado aparecera com o resultado da busca do seu produto$")
	public void a_pagina_do_resultado_aparecera_com_o_resultado_da_busca_do_seu_produto() throws Throwable {
		Buscas.product();
		Assert.assertTrue(Buscas.Respos1().contains("HP USB 3 BUTTON OPTICAL MOUSE"));	

	}

	@Dado("^que o usuario clica no campo de busca e procuro por um produto$")
	public void que_o_usuario_clica_no_campo_de_busca_e_procuro_por_um_produto() throws Throwable {
		Buscas.procurarProduto();

	}

	@Entao("^aparecera uma pagina informando que o produto nao foi encontrado$")
	public void aparecera_uma_pagina_informando_que_o_produto_nao_foi_encontrado() throws Throwable {
		Buscas.clica();
		Assert.assertTrue(Buscas.Respos1().contains("No results for \"xiaomi\""));	
	
	}

}

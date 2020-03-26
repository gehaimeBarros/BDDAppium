package br.com.rsinet_hubTesteBDDAppium.TesteMobileAppiumSteps;


import org.junit.Assert;

import br.com.rsinet_hubTesteBDDAppium.TesteMobileAppiumBDD.TesteCompra;
import br.com.rsinet_hubTesteBDDAppium.TesteMobileAppiumUtils.TestCont;
import cucumber.api.java.es.Dado;
import cucumber.api.java.pt.Entao;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class CompraSteps {
	public static AndroidDriver<MobileElement> driver;
	private TesteCompra compras;
	private TestCont testContext;

	public CompraSteps(TestCont context) {
		testContext = context;
		compras = testContext.getPageObjectFactory().getCompra();
	}

	@Dado("^que toco na categoria escolhida$")
	public void que_toco_na_categoria_escolhida() throws Throwable {
	
	}
	@Dado("^deve abrir a tela do produto escolhido$")
	public void deve_abrir_a_tela_do_produto_escolhido() throws Throwable {
		compras.getCategoria();
		
	}

	@Entao("^aparecera a tela do produto escolhido$")
	public void aparecera_a_tela_do_produto_escolhido() throws Throwable {
		compras.getLaptop();
		Assert.assertTrue(compras.getRespo1().contains("HP ENVY X360 - 15T LAPTOP"));

	}

	@Dado("^que estou logado e o carrinho esta vazio$")
	public void queEstouLogadoEOCarrinhoEstaVazio() throws Throwable {
		compras.getMenu();
		compras.getLoggin();
		compras.getIdUsuario();
		compras.getSenha();
		compras.getConfirma();

	}

	@Dado("^o usuario na categoria escolhida e selecionar o produto desejado e a quantidade$")
	public void o_usuario_na_categoria_escolhida_e_selecionar_o_produto_desejado_e_a_quantidade() throws Throwable {
		compras.getTablet();
		compras.getEscolherTablet();
		compras.getQuantidade();
		compras.getNumero();
		compras.getApply();
	}
	
	@Entao("^nao ira conseguir adiciona mais de dez itens no carrinho$")
	public void nao_ira_conseguir_adiciona_mais_de_dez_itens_no_carrinho() throws Throwable {
		compras.getAddCarrinho();
		compras.getCarrinhoDeCompras();
		Assert.assertTrue(compras.getRespo2().contains("10"));
	}
	}

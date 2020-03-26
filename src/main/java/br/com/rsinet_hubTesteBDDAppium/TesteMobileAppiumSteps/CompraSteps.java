package br.com.rsinet_hubTesteBDDAppium.TesteMobileAppiumSteps;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;

import br.com.rsinet_hubTesteBDDAppium.TesteMobileAppiumBDD.TesteCompra;
import br.com.rsinet_hubTesteBDDAppium.TesteMobileAppiumUtils.TestCont;
import cucumber.api.java.es.Dado;
import cucumber.api.java.pt.Entao;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class CompraSteps {
	public static AndroidDriver<MobileElement> driver;
	private TesteCompra compra;
	private TestCont testContext;

	public CompraSteps(TestCont context) {
		testContext = context;
		compra = testContext.getPageObjectFactory().getCompra();
	}

	@Dado("^que toco na categoria escolhida$")
	public void que_toco_na_categoria_escolhida() throws Throwable {
	
	}
	@Dado("^deve abrir a tela do produto escolhido$")
	public void deve_abrir_a_tela_do_produto_escolhido() throws Throwable {
		compra.Categoria();
		
	}

	@Entao("^aparecera a tela do produto escolhido$")
	public void aparecera_a_tela_do_produto_escolhido() throws Throwable {
		compra.laptop();
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.MICROSECONDS);
		String resposta = driver.findElement(By.id("com.Advantage.aShopping:id/textViewProductName")).getText();
		Assert.assertTrue(resposta.equals("HP ENVY X360 - 15T LAPTOP"));

	}

	@Dado("^que estou logado e o carrinho esta vazio$")
	public void que_estou_logado_e_o_carrinho_esta_vazio() throws Throwable {
		compra.menu();
		compra.loggin();
		compra.idusuario();
		compra.senha();
		compra.confirma();

	}

	@Dado("^o usuario na categoria escolhida e selecionar o produto desejado e a quantidade$")
	public void o_usuario_na_categoria_escolhida_e_selecionar_o_produto_desejado_e_a_quantidade() throws Throwable {
		compra.tablet();
		compra.EscolherTablet();
		compra.quantidade();
		compra.numero();
		compra.apply();
	}
	
	@Entao("^nao ira conseguir adiciona mais de dez itens no carrinho$")
	public void nao_ira_conseguir_adiciona_mais_de_dez_itens_no_carrinho() throws Throwable {
		compra.addCarrinho();
		compra.CarrinhoDeCompras();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.MILLISECONDS);
		String resposta = driver.findElement(By.id("com.Advantage.aShopping:id/textViewCartQuantity")).getText();
		Assert.assertTrue(resposta.equals("10"));
	}
}
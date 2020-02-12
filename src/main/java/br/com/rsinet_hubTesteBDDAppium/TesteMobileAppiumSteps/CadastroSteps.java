package br.com.rsinet_hubTesteBDDAppium.TesteMobileAppiumSteps;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;


import br.com.rsinet_hubTesteBDDAppium.TesteMobileAppiumBDD.TestCadastro;
import br.com.rsinet_hubTesteBDDAppium.TesteMobileAppiumUtils.Driver;
import br.com.rsinet_hubTesteBDDAppium.TesteMobileAppiumUtils.TakeSnapShot;
import cucumber.api.java.es.Dado;
import cucumber.api.java.pt.Entao;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class CadastroSteps {

	private static AndroidDriver<MobileElement> driver;
	private TestCadastro cadastro;

	@Dado("^que estou no aplicativo advantage shopping mobile$")
	public void que_estou_no_aplicativo_advantage_shopping_mobile() throws Throwable {
		driver = Driver.getDriver();
		cadastro = PageFactory.initElements(driver, TestCadastro.class);
		System.out.println(driver);
	}

	@Dado("^clico em fazer login$")
	public void clico_em_fazer_login() throws Throwable {
		cadastro.novo();
		cadastro.menu();
		cadastro.novaConta();
	}

	@Dado("^clico preencher cadastro$")
	public void clico_preencher_cadastro() throws Throwable {
		cadastro.usuario();
		cadastro.email();
		cadastro.senha();
		cadastro.confirmaSenha(driver);
		cadastro.nome();
		cadastro.sobrenome();
		cadastro.telefone();
		cadastro.pais();
		cadastro.selecionarPais();
		cadastro.estado();
		cadastro.endereco();
		cadastro.cidade();
		cadastro.Cep(driver);
	}

	@Entao("^e o usuario estara cadastrado$")
	public void e_o_usuario_estara_cadastrado() throws Throwable {
		cadastro.registrar();
		cadastro.Opçoes(driver);
		TakeSnapShot.tirarPrints("Cadastro bem sucedido " , driver);
		//driver.manage().timeouts().implicitlyWait(, TimeUnit.MILLISECONDS);
		String resposta = driver.findElement(By.id("com.Advantage.aShopping:id/textViewMenuUser")).getText();
		Assert.assertTrue(resposta.equals("GGhhj33"));


	}

	@Entao("^o usuario nao sera registrado$")
	public void o_usuario_nao_sera_registrado() throws Throwable {
		cadastro.registrar();
		cadastro.Opçoes(driver);
		TakeSnapShot.tirarPrints("Cadastro nao foi sucedido " , driver);
		//driver.manage().timeouts().implicitlyWait(35, TimeUnit.MILLISECONDS);
		String resposta = driver.findElement(By.id("com.Advantage.aShopping:id/textViewMenuUser")).getText();
		Assert.assertFalse(resposta.equals("GGhhj33"));

	}
}

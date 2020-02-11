package br.com.rsinet_hubTesteBDDAppium.TesteMobileAppiumSteps;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import br.com.rsinet_hubTesteBDDAppium.TesteMobileAppiumBDD.TestCadastro;
import br.com.rsinet_hubTesteBDDAppium.TesteMobileAppiumUtils.Driver;
import cucumber.api.java.es.Dado;
import cucumber.api.java.pt.Entao;
import io.appium.java_client.android.AndroidDriver;

public class CadastroSteps {

	public static AndroidDriver<WebElement> driver;

	@Dado("^que estou no aplicativo advantage shopping mobile$")
	public void que_estou_no_aplicativo_advantage_shopping_mobile() throws Throwable {
		driver = Driver.Iniciar();

	}

	@Dado("^clico em fazer login$")
	public void clico_em_fazer_login() throws Throwable {
		TestCadastro cadastro = new TestCadastro(driver);
		cadastro.novo();
		cadastro.menu();
		cadastro.novaConta();
	}

	@Dado("^clico preencher cadastro$")
	public void clico_preencher_cadastro() throws Throwable {
		TestCadastro cadastro = new TestCadastro(driver);
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
		TestCadastro cadastro = new TestCadastro(driver);
		cadastro.registrar();
		cadastro.Opçoes();
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.MICROSECONDS);
		String resposta = driver.findElement(By.id("com.Advantage.aShopping:id/textViewMenuUser")).getText();
		Assert.assertTrue(resposta.equals("Geh7878"));

	}

	@Entao("^o usuario nao sera registrado$")
	public void o_usuario_nao_sera_registrado() throws Throwable {
		TestCadastro cadastro = new TestCadastro(driver);
		cadastro.registrar();
		cadastro.Opçoes();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.MILLISECONDS);
		String resposta = driver.findElement(By.id("com.Advantage.aShopping:id/textViewMenuUser")).getText();
		Assert.assertFalse(resposta.equals("Geh7878"));
		Driver.Quit(driver);
	}
}

package br.com.alura.forum.aceitacao.cadastro;

import java.io.IOException;

import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.github.javafaker.Faker;

public class FluxoDeCadastroTest {

	@Ignore
	@Test
	public void deve_ser_capaz_de_criar_uma_conta() throws IOException {
		Faker faker = new Faker();
		
		ChromeDriver browser = new ChromeDriver();
		
		browser.get("http://192.168.50.10:8080/alura-forum");
		
		WebElement linkDeCadastro = browser.findElement(By.linkText("CADASTRE-SE"));
		
		linkDeCadastro.click();
		
		WebElement campoDeNome = browser.findElement(By.name("nome"));
		
		campoDeNome.sendKeys(faker.name().fullName());
		
		WebElement campoDeEmail = browser.findElement(By.name("email"));
		
		campoDeEmail.sendKeys(faker.internet().emailAddress());
		
		WebElement campoDeSenha = browser.findElement(By.name("senha"));
		
		String senha = faker.internet().password();
		
		campoDeSenha.sendKeys(senha);
		
		WebElement campoDeConfirmacaoDeSenha = browser.findElement(By.name("confirmacaoSenha"));
		
		campoDeConfirmacaoDeSenha.sendKeys(senha);
		
		WebElement botaoDeEnviarCadastro = browser.findElement(By.className("btn-login"));
		
		botaoDeEnviarCadastro.click();
		
		browser.close();
	}
	
}

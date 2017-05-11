package br.com.rodrigo.pages;

import org.openqa.selenium.support.ui.ExpectedConditions;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("http://meuimovelnet.com.br")
public class HomePage extends PageObject {

	/*
	 * WebElements da Página
	 */
	@FindBy(css="input[name='loginLink']")
	private WebElementFacade buttonEntrar;
	
	@FindBy(css="input[name='username']")
	private WebElementFacade username;
	
	@FindBy(css="input[name='password']")
	private WebElementFacade password;
	
	@FindBy(css="button[id='topsubbtn']")
	private WebElementFacade button;
	
	@FindBy(css=".alert-danger")
	private WebElementFacade msgLogin;
	
	@FindBy(css="input[value='Rodrigo |']")
	private WebElementFacade userLogado;
	
	
	private static final String MSG_LOGIN_INVALIDO = "Login/Senha inválidos!"; 
	
	
	public void login(String email, String senha) {
		buttonEntrar.click();
		username.type(email);
		password.type(senha);
		button.click();
		
	}

	public void assertLoginIncorreto() {
		msgLogin.waitForCondition().until(
				ExpectedConditions.textToBePresentInElement(msgLogin, MSG_LOGIN_INVALIDO));		
		
	}

	public void assertLoginCorreto(String nome) {
		userLogado.waitForCondition().until(
				ExpectedConditions.textToBePresentInElementValue(userLogado, nome));		
		
	}

}

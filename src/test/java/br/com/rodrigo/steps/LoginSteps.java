package br.com.rodrigo.steps;

import br.com.rodrigo.pages.HomePage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;

public class LoginSteps {
	
	HomePage homePage;
	
	@Dado("^Eu estou na página inicial$")
	public void eu_estou_na_página_inicial() {
		homePage.open();

	}

	@Quando("^Eu tento efetuar login com '(.*)' e '(.*)'$")
	public void eu_tento_efetuar_login_com_email_e(String email, String senha) {
		homePage.login(email, senha);

	}

	@Então("^Login não é permitido$")
	public void login_não_é_permitido() {
		homePage.assertLoginIncorreto();

	}

	@Então("^Usuário '(.*)' deve estar logado")
	public void usuário_deve_estar_logado(String nome) {
		homePage.assertLoginCorreto(nome);

	}


}

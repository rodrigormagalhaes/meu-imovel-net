package br.com.rodrigo.steps;

import br.com.rodrigo.pages.HomePage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginSteps {
	
	HomePage homePage;
	
	@Given("^Eu estou na página inicial$")
	public void eu_estou_na_página_inicial() {
		homePage.open();

	}

	@When("^Eu tento efetuar login com '(.*)' e '(.*)'$")
	public void eu_tento_efetuar_login_com_email_e(String email, String senha) {
		homePage.login(email, senha);

	}

	@Then("^Login não é permitido$")
	public void login_não_é_permitido() {
		homePage.assertLoginIncorreto();

	}
	
	@Then("^Usuário '(.*)' deve estar logado")
	public void o_usuário_Rodrigo_deve_estar_logado(String nome) {
		homePage.assertLoginCorreto(nome);

	}


}

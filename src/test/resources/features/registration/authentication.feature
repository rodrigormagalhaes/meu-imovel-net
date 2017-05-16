Feature: Authentication
	
	Scenario Outline: Login com credenciais inválidas 
		Given Eu estou na página inicial
  	 When Eu tento efetuar login com '<email>' e '<senha>'
		 Then Login não é permitido

		Examples:
		  | email              | senha  |
		  | teste@teste.com.br | 123456 |
		  | teste@teste.com.de | 123456 |
		  | teste@teste.com    | 113456 |
	
	@login_correto  
	Scenario: Login com usuário existente
		Given Eu estou na página inicial
		 When Eu tento efetuar login com 'teste@teste.com' e '123456'
		 Then Usuário 'rodrigo |' deve estar logado	
		 
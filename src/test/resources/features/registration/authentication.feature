Feature: Authentication
	
	Scenario Outline: Login com credenciais inválidas 
		Given Eu estou na página inicial
  	 When Eu tento efetuar login com '<email>' e '<senha>'
		 Then Login não é permitido

		Examples:
		  | email                     | senha  |
		  | rodrigorm.rm@gmail.com.br | 123456 |
		  | rodrigorm.rm@gmail.com.de | 123456 |
		  | rodrigorm.rm@gmail.com    | 113456 |
	
	@login_correto  
	Scenario: Login com usuário existente
		Given Eu estou na página inicial
		 When Eu tento efetuar login com 'rodrigorm.rm@gmail.com' e 'cx_rodrigo'
		 Then Usuário 'Rodrigo |' deve estar logado	

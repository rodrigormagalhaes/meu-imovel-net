# language: pt

Funcionalidade: Autenticação

	@teste_pt
	Esquema do Cenário: Login com credenciais inválidas
		Dado Eu estou na página inicial
 	Quando Eu tento efetuar login com '<email>' e '<senha>'
	 Então Login não é permitido 
	 
 		Exemplos:
		  | email              | senha  |
		  | teste@teste.com.br | 123456 |
		  | teste@teste.com.de | 123456 |
		  | teste@teste.com    | 113456 |
		  
	@login_correto  
	Cenário: Login com usuário existente
		Dado Eu estou na página inicial
	Quando Eu tento efetuar login com 'teste@teste.com' e '123456'
	 Então Usuário 'rodrigo |' deve estar logado	
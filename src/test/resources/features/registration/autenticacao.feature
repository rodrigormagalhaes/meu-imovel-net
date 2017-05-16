# language: pt
# encoding: utf-8

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
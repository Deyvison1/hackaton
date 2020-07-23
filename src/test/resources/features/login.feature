#language: pt
#enconding: UTF-8

@login
Funcionalidade: Login

@loginInvalido
Cenario: Realizar login invalido
Quando eu informar o usuario "user1"
E informar a senha "admin123"
E acionar o botao login
Entao o sistema apresenta a mensagem "Invalid credentials"

@loginSucesso
Cenario: Realizar login com sucesso
Quando eu informar o usuario "admin"
E informar a senha "admin123"
E acionar o botao login
Entao o sistema apresenta o usuario logado
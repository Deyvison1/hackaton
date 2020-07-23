package stepsDefinitions;



import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import pageObjects.LoginPage;

public class LoginSteps {
	
	LoginPage loginPage = new LoginPage();
	
	@Quando("eu informar o usuario {string}")
	public void eu_informar_o_usuario(String string) {
		loginPage.preencherUserName(string);
	}

	@Quando("informar a senha {string}")
	public void informar_a_senha(String string) {
		loginPage.preencherPassword(string);
		
	}

	@Quando("acionar o botao login")
	public void acionar_o_botao_login() {
		loginPage.acionarBotaoLogin();
	}

	@Entao("o sistema apresenta a mensagem {string}")
	public void o_sistema_apresenta_a_mensagem(String string) {
		
	}

	@Entao("o sistema apresenta o usuario logado")
	public void o_sistema_apresenta_o_usuario_logado() {
	   
	}

	
}




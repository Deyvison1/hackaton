package stepsDefinitions;

import io.cucumber.java.es.Dado;
import static utils.Utils.acessarSistema;

public class BaseSteps {

	@Dado("que eu acesse o sistema")
	public void queEuAcesseOSistema() {
		acessarSistema();
	}
}

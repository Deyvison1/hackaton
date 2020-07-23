package stepsDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;

import static utils.Utils.acessarSistema;
import static utils.Utils.driver;

public class Hooks {

	@Before
	public void suitUp() {
		acessarSistema();
	}
	
	@After
	public void tearDown() {
		driver.quit();
	}
	
}

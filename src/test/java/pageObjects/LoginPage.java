package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import static utils.Utils.driver;


public class LoginPage {
	
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id = "txtUsername")
	private WebElement userName;
	
	@FindBy(id = "txtPassword")
	private WebElement inputPassword;
	
	@FindBy(css = "#btnLogin")
	private WebElement btnLogin;
	
	public void preencherUserName(String string) {
		userName.sendKeys(string);
	}
	
	public void preencherPassword(String string) {
		inputPassword.sendKeys(string);
	}
	
	public void acionarBotaoLogin() {
		btnLogin.click();
	}

}
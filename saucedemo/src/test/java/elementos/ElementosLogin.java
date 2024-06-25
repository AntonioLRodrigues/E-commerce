package elementos;

import org.openqa.selenium.By;

import metodos.Metodos;

public class ElementosLogin extends Metodos{

	By inputUserName = By.id("user-name");
	By inputPassword = By.id("password");
	By loginButton = By.id("login-button");
	
	public By getInputUserName() {
		return inputUserName;
	}
	public By getInputPassword() {
		return inputPassword;
	}
	public By getLoginButton() {
		return loginButton;
	}
}

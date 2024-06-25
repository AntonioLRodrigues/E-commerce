package config;

import elementos.ElementosLogin;
import metodos.Metodos;

public class ConfigNavegador extends Metodos{
	
	ElementosLogin ell = new ElementosLogin();
	
	public void abrirNavegador() {
		abrirNavegador("https://www.saucedemo.com/");
		escrever(ell.getInputUserName(), "standard_user");
		escrever(ell.getInputPassword(), "secret_sauce");
		clicar(ell.getLoginButton());
	}
		
}

	
	


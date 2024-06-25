package pages;

import org.openqa.selenium.By;

import metodos.Metodos;

public class checkoutPages extends Metodos{

	homePage hp = new homePage();
	
	By FistName = By.id("first-name"); 
	By LastName = By.id("last-name");
	By ZipCode = By.id("postal-code");
	By BtnContinue = By.id("continue");
	By AssertCheckout = By.xpath("//span[@class='title'][contains(.,'Checkout: Your Information')]");
	By BtnCheckout = By.id("checkout");
	
	public void cadastroCheckout() {
		hp.adicionandoProdutosCarrinhoEValidando();
		clicar(BtnCheckout);
		validarTexto(AssertCheckout, "Checkout: Your Information");
		escrever(FistName, "Tony Leonel");
		escrever(LastName, "Rodrigues Junior");
		escrever(ZipCode, "111111111");
		clicar(BtnContinue);
	}
	
	
}

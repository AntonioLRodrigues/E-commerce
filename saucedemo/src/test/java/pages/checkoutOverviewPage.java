package pages;

import org.openqa.selenium.By;

import metodos.Metodos;

public class checkoutOverviewPage extends Metodos{

	By AssertCheckoutOverview = By.xpath("//span[contains(text(),'Checkout: Overview')]");
	By AssertSauceLabsBackpack = By.xpath("(//div[@class='inventory_item_name'])[1]");
	By AssertSauceLabsBikeLight = By.xpath("(//div[@class='inventory_item_name'])[2]");
	By AssertLabsBoltTShirt = By.xpath("(//div[@class='inventory_item_name'])[3]");
	By AssertLabsFleeceJacket = By.xpath("(//div[@class='inventory_item_name'])[4]");
	By AssertLabsOnesie = By.xpath("(//div[@class='inventory_item_name'])[5]");
	
	By AssertPayment = By.xpath("//*[contains(text(), 'Payment Information')]");
	By AssertShippingInformation = By.xpath("//*[contains(text(), 'Shipping Information')]");
	By AssertPaymentPriceTotal = By.xpath("//*[contains(text(), 'Price Total')]");
	By AssertTotal = By.xpath("//*[contains(text(), 'Total')]");
	By Btnfinish = By.xpath("//*[@id='finish']");
	By AssertComplete = By.xpath("//h2[contains(text(),'Thank you for your order!')]");
	
	checkoutPages cp = new checkoutPages();
	homePage hp = new homePage();
	
	public void checkoutOverviewPage1() throws InterruptedException {
		
		  validarTexto(AssertCheckoutOverview,"Checkout: Overview");
		  validarTexto(AssertSauceLabsBackpack, "Sauce Labs Backpack");
		  validarTexto(AssertSauceLabsBikeLight, "Sauce Labs Bike Light");
		  validarTexto(AssertLabsBoltTShirt, "Sauce Labs Bolt T-Shirt");
		  validarTexto(AssertLabsFleeceJacket, "Sauce Labs Fleece Jacket");
		  validarTexto(AssertLabsOnesie, "Sauce Labs Onesie");
		  scrollDown();
		  clicar(Btnfinish);
		  validarTexto(AssertComplete, "Thank you for your order!");
		
	}
	
	
}

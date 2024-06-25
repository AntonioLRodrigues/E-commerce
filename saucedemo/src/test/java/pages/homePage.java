package pages;

import org.openqa.selenium.By;

import metodos.Metodos;

public class homePage extends Metodos {
	/* Produtos Da loja */
	By SauceLabsBackpack = By.xpath("//button[contains(@data-test,'add-to-cart-sauce-labs-backpack')]");
	By SauceLabsBikeLight = By.id("add-to-cart-sauce-labs-bike-light");
	By SauceLabsBoltTShirt = By.id("add-to-cart-sauce-labs-bolt-t-shirt");
	By SauceLabsFleeceJacket = By.id("add-to-cart-sauce-labs-fleece-jacket");
	By SauceLabsOnesie = By.id("add-to-cart-sauce-labs-onesie");
	By BtnCarrinho = By.id("shopping_cart_container");
	
	/* Validação dos mesmos produtos */
	By AssertSauceLabsBackpack = By.xpath("//div[@class='inventory_item_name'][contains(.,'Sauce Labs Backpack')]");
	By AssertSauceLabsBikeLight = By.xpath("//div[@class='inventory_item_name'][contains(.,'Sauce Labs Bike Light')]");
	By AssertLabsBoltTShirt = By.xpath("//div[@class='inventory_item_name'][contains(.,'Sauce Labs Bolt T-Shirt')]");
	By AssertLabsFleeceJacket = By.xpath("//div[@class='inventory_item_name'][contains(.,'Sauce Labs Fleece Jacket')]");
	By AssertLabsOnesie = By.xpath("//div[@class='inventory_item_name'][contains(.,'Sauce Labs Onesie')]");
	By AssertNumeroProdutosCarrinho = By.xpath("//span[@class='shopping_cart_badge'][contains(.,'5')]");
	
	public void adicionandoProdutosCarrinhoEValidando(){
		validarTitle("Swag Labs");
		clicar(SauceLabsBackpack);
		clicar(SauceLabsBikeLight);
		clicar(SauceLabsBoltTShirt);
		clicar(SauceLabsFleeceJacket);
		clicar(SauceLabsOnesie);
		clicar(BtnCarrinho);
		validarTexto(AssertSauceLabsBackpack, "Sauce Labs Backpack");
		validarTexto(AssertSauceLabsBikeLight, "Sauce Labs Bike Light");
		validarTexto(AssertLabsBoltTShirt, "Sauce Labs Bolt T-Shirt");
		validarTexto(AssertLabsFleeceJacket, "Sauce Labs Fleece Jacket");
		validarTexto(AssertLabsOnesie, "Sauce Labs Onesie");
		validarTexto(AssertNumeroProdutosCarrinho, "5");
		
	}

	public By getSauceLabsBackpack() {
		return SauceLabsBackpack;
	}

	public By getSauceLabsBikeLight() {
		return SauceLabsBikeLight;
	}

	public By getSauceLabsBoltTShirt() {
		return SauceLabsBoltTShirt;
	}

	public By getSauceLabsFleeceJacket() {
		return SauceLabsFleeceJacket;
	}

	public By getSauceLabsOnesie() {
		return SauceLabsOnesie;
	}

	public By getBtnCarrinho() {
		return BtnCarrinho;
	}

	public By getAssertSauceLabsBackpack() {
		return AssertSauceLabsBackpack;
	}

	public By getAssertSauceLabsBikeLight() {
		return AssertSauceLabsBikeLight;
	}

	public By getAssertLabsBoltTShirt() {
		return AssertLabsBoltTShirt;
	}

	public By getAssertLabsFleeceJacket() {
		return AssertLabsFleeceJacket;
	}

	public By getAssertLabsOnesie() {
		return AssertLabsOnesie;
	}

	public By getAssertNumeroProdutosCarrinho() {
		return AssertNumeroProdutosCarrinho;
	}
	
}

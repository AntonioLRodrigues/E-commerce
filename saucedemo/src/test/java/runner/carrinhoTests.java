package runner;

import org.junit.Before;
import org.junit.Test;

import config.ConfigNavegador;
import metodos.Metodos;
import pages.homePage;

public class carrinhoTests extends Metodos {

	ConfigNavegador cn = new ConfigNavegador();
	homePage hp = new homePage();
	
	@Before
	public void setUp() {
		cn.abrirNavegador();
	}
	
	@Test
	public void testeAdicionando5ProdutosCarrinho() {
		hp.adicionandoProdutosCarrinhoEValidando();
		
	}
}

package runner;

import org.junit.Before;
import org.junit.Test;

import config.ConfigNavegador;
import pages.checkoutPages;

public class checkoutTests {

	ConfigNavegador cn = new ConfigNavegador();
	checkoutPages cp = new checkoutPages();
	
	@Before
	public void setUp() {
		cn.abrirNavegador();
	}
	
	@Test
	public void checkoutTest() {
		cp.cadastroCheckout();
	}
	
}

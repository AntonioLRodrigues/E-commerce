package runner;

import org.junit.Before;
import org.junit.Test;

import config.ConfigNavegador;
import pages.checkoutOverviewPage;
import pages.checkoutPages;

public class checkoutOverviewTest extends checkoutOverviewPage{

	ConfigNavegador cn = new ConfigNavegador();
	checkoutPages cp = new checkoutPages();
	
	@Before
	public void setUp() {
		cn.abrirNavegador();
	}
	
	@Test
	public void checkoutOverview() throws InterruptedException {
		cp.cadastroCheckout();
		checkoutOverviewPage1();
	}
	
	
}

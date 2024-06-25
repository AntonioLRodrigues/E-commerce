package metodos;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Metodos {

	
	public static WebDriver driver;
	
	public void abrirNavegador(String URL) {
		ChromeOptions options = new ChromeOptions();
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver(options);
		driver.get(URL);
		driver.manage().window().maximize();
	}
	
	public void clicar(By elemento) {
		driver.findElement(elemento).click();
		
	}
	public void escrever(By elemento, String texto) {
		driver.findElement(elemento).sendKeys(texto);	
	}
	
	public void validarTexto(By elemento, String textoEsperado) {
		String texto = driver.findElement(elemento).getText();
		assertEquals(textoEsperado, texto);
	}
	
	public void validarTitle(String titleEsperado) {
		String titleCapturado = driver.getTitle();
		assertEquals(titleEsperado, titleCapturado);
	}
	
	public void esperar(int tempo) throws InterruptedException {
		Thread.sleep(tempo);
	}
	
	public void scrollDown() {
		try {	
		JavascriptExecutor js = (JavascriptExecutor) driver;
			 js.executeScript( "window.scrollBy(10,document.body.scrollHeight)" );
	} catch (Exception e) {
		System.out.println(" ------ Erro no metodo -----" + e.getMessage());
		System.out.println(" ------ Causa do erro -----" + e.getCause());
	}
}
}

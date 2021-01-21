package br.com.projeto.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Testes {
	
	static WebDriver driver;

	public static void main(String[] args) {
		testeFindBy_FindAll();
	}
	
	static void testeFactory() {
		
		System.setProperty("webdriver.gecko.driver", "C:/Devtools/Drivers/geckodriver.exe");
		driver = new FirefoxDriver();
		driver.get("https://www.facebook.com");
		
		driver.manage().window().maximize();
		
		PageObjects obj = new PageObjects(driver);
		
		obj.getEmail().sendKeys("hugosanches1@hotmail.com");
		obj.getSenha().sendKeys("helaynn");
		obj.getButEntrar().click();
		
	}
	static void testeFindBy_FindAll() {
		
		System.setProperty("webdriver.gecko.driver", "C:/Devtools/Drivers/geckodriver.exe");
		driver = new FirefoxDriver();
		driver.get("https://www.facebook.com");
		
		driver.manage().window().maximize();
		
		PageObjects obj = new PageObjects(driver);

		System.out.println(obj.getLista().size());
		System.out.println(obj.getLista());
		
		System.out.println(obj.getListaAll().size());
		System.out.println(obj.getListaAll());
		
		obj.getListaAll().get(0).sendKeys("hugosanches1@hotmail.com");
		obj.getListaAll().get(1).sendKeys("helaynn");
		obj.getListaAll().get(2).click();
		
	}
}

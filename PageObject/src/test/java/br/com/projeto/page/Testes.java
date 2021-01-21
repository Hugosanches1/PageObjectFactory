package br.com.projeto.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Testes {
	
	static WebDriver driver;

	public static void main(String[] args) {
		testeFactory();
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
}

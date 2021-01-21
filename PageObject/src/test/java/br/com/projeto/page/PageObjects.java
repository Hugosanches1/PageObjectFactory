package br.com.projeto.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PageObjects {
	
	private WebDriver driver;
	
	@FindBy(id="email")
	private WebElement email;

	@FindBy(name="pass")
	private WebElement senha;
	
	@FindBy(xpath="//button[@name='login']")
	private WebElement butEntrar;

	public PageObjects(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public WebElement getEmail() {
		return email;
	}

	public WebElement getSenha() {
		return senha;
	}

	public WebElement getButEntrar() {
		return butEntrar;
	}

	
	
}

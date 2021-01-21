package br.com.projeto.page;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class PageObjects {
	
	private WebDriver driver;
	
	@FindBy(id="email")
	private WebElement email;

	@FindBy(name="pass")
	private WebElement senha;
	
	@FindBy(xpath="//button[@name='login']")
	private WebElement butEntrar;
	
	@FindBys({
		@FindBy(id="email"),
		@FindBy(name="pass")
	})
	private List<WebElement> lista;

	@FindAll({
		@FindBy(id="email"),
		@FindBy(name="pass"),
		@FindBy(xpath="//button[@name='login']")
	})
	private List<WebElement> listaAll;
	
	public List<WebElement> getLista() {
		return lista;
	}

	public List<WebElement> getListaAll() {
		return listaAll;
	}

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

package com.project.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class RegisterPage extends Base {
	
	By registerPageLocator = By.xpath("//h2[contains(text(),'Input form')]");
	By first_nameLocator = By.xpath("//input[@name='first_name']");
	By last_nameLocator = By.xpath("//input[@name='last_name']");
	By emailLocator = By.xpath("//input[@name='email']");
	By phoneLocator = By.xpath("//input[@name='phone']");
	By addressLocator = By.xpath("//input[@name='address']");
	By cityLocator = By.xpath("//input[@name='city']");
	By zipLocator = By.xpath("//input[@name='zip']");
	By websiteLocator = By.xpath("//input[@name='zip']");
	By hostingOptLocator = By.xpath("//input[@value='yes']");
	By projectDescLocator = By.xpath("//input[@value='yes']");
	By submitLocator = By.xpath("//button[@type='submit']");
	By selectLocator = By.name("state");
	
	
	public RegisterPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	public void registerUser() {
		
		if(isDisplayed(registerPageLocator)) {
				
		type("Yari", first_nameLocator);
		type("Mejia", last_nameLocator);
		type("yamechi@hotmail.com", emailLocator);
		type("8097567292", phoneLocator);
		type("23 Summer Bay avenue", addressLocator);
		type("Orlando", cityLocator);
		selectOption(selectLocator);
		type("32789", zipLocator);
		type("yari.com", websiteLocator);
		click(hostingOptLocator);
		type("Test Project", projectDescLocator);
		click(submitLocator);	
		
		}else {
			System.out.println("Page not found");
		}
		
	}
}

package com.project.pom;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

public class RegisterTest {
	
	private WebDriver driver;
	RegisterPage registerPage;

	@Before
	public void setUp() throws Exception {
		registerPage = new RegisterPage(driver);
		driver = registerPage.chromeDriverConnection();
		registerPage.visit("https://www.seleniumeasy.com/test/input-form-demo.html");
	}

	@After
	public void tearDown() throws Exception {
	//	driver.quit();
	}

	@Test
	public void test() {
		registerPage.registerUser();
	}

}

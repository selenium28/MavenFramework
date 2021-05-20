package com.webPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.generic.BaseClass;

public class LoginClass extends BaseClass{
	
	@FindBy(xpath = "//input[@id='txtUsername']")
	WebElement userName;
	
	@FindBy(xpath = "//input[@id='txtPassword']")
	WebElement password;
	
	@FindBy(xpath = "//input[@id='btnLogin']")
	WebElement loginButton;
	
	public LoginClass() {
		PageFactory.initElements(driver, this);
	}
	
	public void userName (String user) {
		userName.sendKeys(user);
	}
	
	public void password (String pass) {
		password.sendKeys(pass);
	}
	
	public void loginButton () {
		loginButton.click();
	}

}

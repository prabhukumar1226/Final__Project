package com.pages.adactin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage1 {
	public static WebDriver driver;
	
	@FindBy(id="login")
	private WebElement  L_login_button;
	
	@FindBy(id="username")
	private WebElement L_username;
	
	@FindBy(id="password")
	private WebElement L_password;
	
	
	@FindBy(xpath="//div[@class='login_forgot']")
	private WebElement L_forgot;
	
	@FindBy(xpath="//td[@class='login_register']")
	private WebElement L_newuser_register;
	
	@FindBy(xpath="//a[contains(text(),'info@a')]")
	private WebElement L_issue_emailbutton;
	
	@FindBy(xpath="//strong[contains(text(),'Go to Build 2 ')]")
	private WebElement L_go_to_build;
	
	
	

	public LoginPage1(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver, this);
	}

	public WebElement getL_issue_emailbutton() {
		return L_issue_emailbutton;
	}

	public WebElement getL_go_to_build() {
		return L_go_to_build;
	}

	public static WebDriver getDriver() {
		return driver;
	}

	public WebElement getL_login_button() {
		return L_login_button;
	}

	public WebElement getL_username() {
		return L_username;
	}

	public WebElement getL_password() {
		return L_password;
	}

	public WebElement getL_forgot() {
		return L_forgot;
	}

	public WebElement getL_newuser_register() {
		return L_newuser_register;
	}



}

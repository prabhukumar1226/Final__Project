package com.pages.adactin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SelectHotelPage3 {
	
	public static WebDriver driver;
	
	@FindBy(xpath="(//input[@type='radio'])[1]")
	private WebElement SelectHotel_radiobutton1;
	
	@FindBy(xpath="(//input[@type='radio'])[2]")
	private WebElement SelectHotel_radiobutton2;
	
	@FindBy(xpath="(//input[@type='radio'])[3]")
	private WebElement SelectHotel_radiobutton3;
	
	@FindBy(xpath="(//input[@type='radio'])[4]")
	private WebElement SelectHotel_radiobutton4;
	
	@FindBy(id="continue")
	private WebElement SelectHotel_continue;
	
	@FindBy(id="cancel")
	private WebElement SelectHotel_cancel;

	
	public SelectHotelPage3(WebDriver driver2) {
		this.driver=driver2;
		
		PageFactory.initElements(driver, this);
	}

	public static WebDriver getDriver() {
		return driver;
	}
	
	

	public WebElement getSelectHotel_radiobutton1() {
		return SelectHotel_radiobutton1;
	}

	public WebElement getSelectHotel_radiobutton2() {
		return SelectHotel_radiobutton2;
	}

	public WebElement getSelectHotel_radiobutton3() {
		return SelectHotel_radiobutton3;
	}

	public WebElement getSelectHotel_radiobutton4() {
		return SelectHotel_radiobutton4;
	}

	public WebElement getSelectHotel_continue() {
		return SelectHotel_continue;
	}

	public WebElement getSelectHotel_cancel() {
		return SelectHotel_cancel;
	}
	
	
	
	
}

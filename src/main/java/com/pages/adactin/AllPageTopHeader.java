package com.pages.adactin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AllPageTopHeader {

	public static WebDriver driver;
	
	@FindBy(xpath="//a[text()='Search Hotel']")
	private WebElement TH_srchhotel;
	
	@FindBy(xpath="//a[text()='Booked Itinerary']")
	private WebElement TH_bookitinerary;
	
	@FindBy(xpath="//a[text()='Change Password']")
	private WebElement TH_chngepasswrd;
	
	@FindBy(xpath="//a[text()='Logout']")
	private WebElement TH_logout;

	public static WebDriver getDriver() {
		return driver;
	}

	public WebElement getTH_srchhotel() {
		return TH_srchhotel;
	}

	public WebElement getTH_bookitinerary() {
		return TH_bookitinerary;
	}

	public WebElement getTH_chngepasswrd() {
		return TH_chngepasswrd;
	}

	public WebElement getTH_logout() {
		return TH_logout;
	}
	
	
}

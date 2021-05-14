package com.pages.adactin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookingConformationPage5 {
	
	public static WebDriver driver;
	
	@FindBy(id="my_itinerary")
	private WebElement BC_my_itinerary;
	
	@FindBy(id="search_hotel")
	private WebElement BC_searchotel;
	
	@FindBy(id="logout")
	private WebElement BC_logout;

	public BookingConformationPage5(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver, this);
	}

	public static WebDriver getDriver() {
		return driver;
	}

	public WebElement getBC_my_itinerary() {
		return BC_my_itinerary;
	}

	public WebElement getBC_searchotel() {
		return BC_searchotel;
	}

	public WebElement getBC_logout() {
		return BC_logout;
	}
	
	
	

}

package com.pages.adactin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchHotelPage2 {
	
	
	public static WebDriver driver;
	
	@FindBy(id="location")
	private WebElement SH_location_drop;
	
	@FindBy(id="hotels")
	private WebElement SH_hotel_drop;
	
	
	@FindBy(id="room_type")
	private WebElement SH_roomtype_drop;
	
	@FindBy(id="room_nos")
	private WebElement SH_number_of_room_drop;
	
	@FindBy(id="datepick_in")
	private WebElement SH_checkin_dob;
	
	@FindBy(id="datepick_out")
	private WebElement SH_checkout_dob;
	
	@FindBy(id="adult_room")
	private WebElement SH_adult_nos_drop;
	
	@FindBy(id="child_room")
	private WebElement SH_child_nos_drop;
	
	@FindBy(id="Submit")
	private WebElement SH_submit;
	
	@FindBy(id="Reset")
	private WebElement SH_reset;

	


	

	public SearchHotelPage2(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver, this);
	}

	public static WebDriver getDriver() {
		return driver;
	}

	public WebElement getSH_location_drop() {
		return SH_location_drop;
	}

	public WebElement getSH_hotel_drop() {
		return SH_hotel_drop;
	}

	public WebElement getSH_roomtype_drop() {
		return SH_roomtype_drop;
	}

	public WebElement getSH_number_of_room_drop() {
		return SH_number_of_room_drop;
	}

	public WebElement getSH_checkin_dob() {
		return SH_checkin_dob;
	}

	public WebElement getSH_checkout_dob() {
		return SH_checkout_dob;
	}

	public WebElement getSH_adult_nos_drop() {
		return SH_adult_nos_drop;
	}

	public WebElement getSH_child_nos_drop() {
		return SH_child_nos_drop;
	}

	public WebElement getSH_submit() {
		return SH_submit;
	}

	public WebElement getSH_reset() {
		return SH_reset;
	}
	
	 
}

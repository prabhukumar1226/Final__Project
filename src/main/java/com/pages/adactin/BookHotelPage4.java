package com.pages.adactin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookHotelPage4 {
	
	public static WebDriver driver;
	
	@FindBy(id="first_name")
	private WebElement BH_firstname;
	
	@FindBy(id="last_name")
	private WebElement BH_lastname;
	
	@FindBy(id="address")
	private WebElement BH_address;
	
	@FindBy(id="cc_num")
	private WebElement BH_cardnumber;
	
	@FindBy(id="cc_type")
	private WebElement BH_cardtype_drop;
	
	@FindBy(id="cc_exp_month")
	private WebElement BH_exp_mnth_drop ;
	
	@FindBy(id="cc_exp_year")
	private WebElement BH_exp_yr_drop;
	
	@FindBy(id="cc_cvv")
	private WebElement BH_cvv_no;
	
	@FindBy(id="book_now")
	private WebElement BH_booknow;
	
	@FindBy(id="cancel")
	private WebElement BH_cancel;

	
	public BookHotelPage4(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver, this);
	}

	public static WebDriver getDriver() {
		return driver;
	}

	public WebElement getBH_firstname() {
		return BH_firstname;
	}

	public WebElement getBH_lastname() {
		return BH_lastname;
	}

	public WebElement getBH_address() {
		return BH_address;
	}

	public WebElement getBH_cardnumber() {
		return BH_cardnumber;
	}

	public WebElement getBH_cardtype_drop() {
		return BH_cardtype_drop;
	}

	public WebElement getBH_exp_mnth_drop() {
		return BH_exp_mnth_drop;
	}

	public WebElement getBH_exp_yr_drop() {
		return BH_exp_yr_drop;
	}

	public WebElement getBH_cvv_no() {
		return BH_cvv_no;
	}

	public WebElement getBH_booknow() {
		return BH_booknow;
	}

	public WebElement getBH_cancel() {
		return BH_cancel;
	}
	
	
}

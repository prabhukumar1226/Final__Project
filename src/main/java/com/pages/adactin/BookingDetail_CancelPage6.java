package com.pages.adactin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookingDetail_CancelPage6 {
	
	public static WebDriver driver;
	
	@FindBy(xpath="(//input[@type='checkbox'])[1]")
	private WebElement BDC_selectAll;
	
	@FindBy(xpath="(//input[@type='checkbox'])[2]")
	private WebElement BDC_selectfrst;
	
	@FindBy(xpath="(//input[@type='checkbox'])[3]")
	private WebElement BDC_selectscnd;
	
	@FindBy(xpath="(//input[@type='checkbox'])[4]")
	private WebElement BDC_selectthrd;
	
	@FindBy(xpath="(//input[@type='submit'])[2]")
	private WebElement BDC_cancelselected;
	
	@FindBy(xpath="(//input[@type='submit'])[1]")
	private WebElement BDC_srchid_BH_gobtn;
	
	@FindBy(id="order_id_text")
	private WebElement BDC_srchid_BH_box;

	@FindBy(id="search_hotel")
	private WebElement BDC_searchotel;
	
	@FindBy(id="logout")
	private WebElement BDC_logout;
	
	@FindBy(xpath="//a[text()='Show all']")
	private WebElement BDC_srchid_showall;

	public BookingDetail_CancelPage6(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver, this);
	}

	public static WebDriver getDriver() {
		return driver;
	}

	public WebElement getBDC_selectAll() {
		return BDC_selectAll;
	}

	public WebElement getBDC_selectfrst() {
		return BDC_selectfrst;
	}

	public WebElement getBDC_selectscnd() {
		return BDC_selectscnd;
	}

	public WebElement getBDC_selectthrd() {
		return BDC_selectthrd;
	}

	public WebElement getBDC_cancelselected() {
		return BDC_cancelselected;
	}

	public WebElement getBDC_srchid_BH_gobtn() {
		return BDC_srchid_BH_gobtn;
	}

	public WebElement getBDC_srchid_BH_box() {
		return BDC_srchid_BH_box;
	}

	public WebElement getBDC_searchotel() {
		return BDC_searchotel;
	}

	public WebElement getBDC_logout() {
		return BDC_logout;
	}

	public WebElement getBDC_srchid_showall() {
		return BDC_srchid_showall;
	}
	
	
}

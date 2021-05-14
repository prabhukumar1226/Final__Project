package com.adactin.helper;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.pages.adactin.BookHotelPage4;
import com.pages.adactin.BookingConformationPage5;
import com.pages.adactin.BookingDetail_CancelPage6;
import com.pages.adactin.LoginPage1;
import com.pages.adactin.SearchHotelPage2;
import com.pages.adactin.SelectHotelPage3;

public class PageObjectManager {
	public static WebDriver driver;
	
	public static LoginPage1 lp;
	public static SearchHotelPage2 sh;
	public static SelectHotelPage3 shp;
	public static BookHotelPage4 bh;
	public static BookingConformationPage5 bcp;
	public static BookingDetail_CancelPage6 bdc;
	
	
	public PageObjectManager(WebDriver driver2) {
	
		this.driver=driver2;
		PageFactory.initElements(driver, this);
	}

	public LoginPage1 getInstanceLogin() {

		lp=new LoginPage1(driver);
		return lp;
	}
	
	public SearchHotelPage2 getInstanceSearchHotel() {
		sh=new SearchHotelPage2(driver);
		return sh;
		
	}
	
	public SelectHotelPage3 getInstanceSelectHotel() {
		
		shp=new SelectHotelPage3(driver);
		return shp;
	}
	
	public BookHotelPage4 getInstanceBookHotel() {
		bh=new BookHotelPage4(driver);
		return bh;
		
	}
	
	public BookingConformationPage5 getInstanceBookingConformation() {
		bcp=new BookingConformationPage5(driver);
		return bcp;
		
	}
	
	public BookingDetail_CancelPage6 getInstanceBookingDetail() {
		bdc=new BookingDetail_CancelPage6(driver);
		return bdc;
		
	}
}

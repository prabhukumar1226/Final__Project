package com.adactin.stepdefinition;

import org.openqa.selenium.WebDriver;

import com.adactin.helper.File_Reader_Manager;
import com.adactin.helper.PageObjectManager;
import com.adactin.runner.Test_Runner;
import com.base.io.BaseClass;
import com.pages.adactin.BookHotelPage4;
import com.pages.adactin.BookingConformationPage5;
import com.pages.adactin.BookingDetail_CancelPage6;
import com.pages.adactin.LoginPage1;
import com.pages.adactin.SearchHotelPage2;
import com.pages.adactin.SelectHotelPage3;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Step_Definition extends BaseClass {
	
	public static WebDriver driver=Test_Runner.driver;
	
	public static PageObjectManager pom =new PageObjectManager(driver);
	
	
	@Given("^user Launch The Application$")
	public void user_Launch_The_Application() throws Throwable {
		
		String url = File_Reader_Manager.getInstance().getInstanceCR().getUrl();
	  
		get(url);
	}

	@When("^user Enter \"([^\"]*)\" In Username Field$")
	public void user_Enter_In_Username_Field(String username) throws Throwable {
	    
		inputValue(pom.getInstanceLogin().getL_username(), username);
		
	}

	@When("^user Enter The \"([^\"]*)\" In Password Field$")
	public void user_Enter_The_In_Password_Field(String passowrd) throws Throwable {
	   
		inputValue(pom.getInstanceLogin().getL_password(), passowrd);
	}

	@Then("^User Click The Login Button And It Navigates To Search Hotel Page$")
	public void user_Click_The_Login_Button_And_It_Navigates_To_Search_Hotel_Page() throws Throwable {
	   
		clickOfElement(pom.getInstanceLogin().getL_login_button()); 
	}

	@When("^user Select The Location In Location Field$")
	public void user_Select_The_Location_In_Location_Field() throws Throwable {
	   
		actions(pom.getInstanceSearchHotel().getSH_location_drop(), "c");
	   robot("ctc1");
	}

	@When("^user Select The Hotel IN Hotel Field$")
	public void user_Select_The_Hotel_IN_Hotel_Field() throws Throwable {
	    
		actions(pom.getInstanceSearchHotel().getSH_hotel_drop(), "c");
		robot("ctc1");
	}

	@When("^user Select The Room Type In Room Field$")
	public void user_Select_The_Room_Type_In_Room_Field() throws Throwable {
	    
		actions(pom.getInstanceSearchHotel().getSH_roomtype_drop(), "c");
		robot("ctc1");
	}

	@When("^user Select The Number Of Room In Number Of Room Field$")
	public void user_Select_The_Number_Of_Room_In_Number_Of_Room_Field() throws Throwable {
	    
		actions(pom.getInstanceSearchHotel().getSH_number_of_room_drop(), "c");
		robot("ctc0");
		
	}

	@When("^user Enter The Check In Date In Check In Date Field$")
	public void user_Enter_The_Check_In_Date_In_Check_In_Date_Field() throws Throwable {
	   
		inputValue(pom.getInstanceSearchHotel().getSH_checkin_dob(), "11/05/2021");
	}

	@When("^user Enter The Check Out Date In Check Out Date Field$")
	public void user_Enter_The_Check_Out_Date_In_Check_Out_Date_Field() throws Throwable {
	   
		inputValue(pom.getInstanceSearchHotel().getSH_checkout_dob(), "12/05/2021");
	}

	@When("^user Select The Adult Per Room In Adult Per Room Field$")
	public void user_Select_The_Adult_Per_Room_In_Adult_Per_Room_Field() throws Throwable {
	    
		actions(pom.getInstanceSearchHotel().getSH_adult_nos_drop(), "c");
		robot("ctc2");
	}

	@When("^user Select The Children Per Room In Children Per Room Field$")
	public void user_Select_The_Children_Per_Room_In_Children_Per_Room_Field() throws Throwable {
	   
		actions(pom.getInstanceSearchHotel().getSH_child_nos_drop(), "c");
		robot("ctc0");
	}

	@When("^user Click The Reset Button In Reset GUI Button$")
	public void user_Click_The_Reset_Button_In_Reset_GUI_Button() throws Throwable {
	   
		
	}

	@Then("^user Click The Search Button And It Navigates To Select Hotel Page$")
	public void user_Click_The_Search_Button_And_It_Navigates_To_Select_Hotel() throws Throwable {
	    
		clickOfElement(pom.getInstanceSearchHotel().getSH_submit());	
	}

	@When("^user Select The Hotel In Check Box$")
	public void user_Select_The_Hotel_In_Check_Box() throws Throwable {

		clickOfElement(pom.getInstanceSelectHotel().getSelectHotel_radiobutton1());
	}

	@Then("^user Click The Continue Button And It Navigates To Book Hotel Page$")
	public void user_Click_The_Continue_Button_And_It_Navigates_To_Book_Hotel_Page() throws Throwable {
	   
		clickOfElement(pom.getInstanceSelectHotel().getSelectHotel_continue());
		
	}

	@When("^user Enter The First Name In First Name Field$")
	public void user_Enter_The_First_Name_In_First_Name_Field() throws Throwable {
	   
		inputValue(pom.getInstanceBookHotel().getBH_firstname(), "GeethaGovinda");
	}

	@When("^user Enter The Last Name In Last Name Field$")
	public void user_Enter_The_Last_Name_In_Last_Name_Field() throws Throwable {
	   
		inputValue(pom.getInstanceBookHotel().getBH_lastname(), "kumar");
	}

	@When("^user Enter The Billing Address In Billing Address Field$")
	public void user_Enter_The_Billing_Address_In_Billing_Address_Field() throws Throwable {
	    
		inputValue(pom.getInstanceBookHotel().getBH_address(), "1/23, coloumbia st, us.3667543");
	}

	@When("^user Enter The Credit Card Number In Credit Card Number Field$")
	public void user_Enter_The_Credit_Card_Number_In_Credit_Card_Number_Field() throws Throwable {
	   
		String cardNumber = File_Reader_Manager.getInstance().getInstanceCR().getCardNumber();
		inputValue(pom.getInstanceBookHotel().getBH_cardnumber(), cardNumber);
	}

	@When("^user Select The Credit Card Type In Credit Card Type Field$")
	public void user_Select_The_Credit_Card_Type_In_Credit_Card_Type_Field() throws Throwable {
	    
		actions(pom.getInstanceBookHotel().getBH_cardtype_drop(), "c");
		robot("ctc1");
	}

	@When("^user Select The Credit Card Expiry Month In Expiry Date Field$")
	public void user_Select_The_Credit_Card_Expiry_Month_In_Expiry_Date_Field() throws Throwable {
	    actions(pom.getInstanceBookHotel().getBH_exp_mnth_drop(), "c");
		robot("ctc7");
	}

	@When("^user Select The Credit Card Expiry Year In Expiry Date Field$")
	public void user_Select_The_Credit_Card_Expiry_Year_In_Expiry_Date_Field() throws Throwable {
	   
		actions(pom.getInstanceBookHotel().getBH_exp_yr_drop(), "c");
		robot("ctc12");
		Thread.sleep(3000);	}

	@When("^user Enter The Cvv Number In Cvv Number Field$")
	public void user_Enter_The_Cvv_Number_In_Cvv_Number_Field() throws Throwable {
		
	    String cvv = File_Reader_Manager.getInstance().getInstanceCR().getCvv();

	   inputValue(pom.getInstanceBookHotel().getBH_cvv_no(), cvv);
	}

	@Then("^user Click The Book Now Button And It Navigates To Booking Conformation Page$")
	public void user_Click_The_Book_Now_Button_And_It_Navigates_To_Booking_Conformation_Page() throws Throwable {
	    
		clickOfElement(pom.getInstanceBookHotel().getBH_booknow());
	}

	@Then("^user Click The My Itinerary Button And It Navigates To Booked Itinerary$")
	public void user_Click_The_My_Itinerary_Button_And_It_Navigates_To_Booked_Itinerary() throws Throwable {
	    explicit(pom.getInstanceBookingConformation().getBC_my_itinerary());
		clickOfElement(pom.getInstanceBookingConformation().getBC_my_itinerary());
	}

	@When("^user Select The Any Order Id In Order Id Check Box$")
	public void user_Select_The_Any_Order_Id_In_Order_Id_Check_Box() throws Throwable {
	    
		clickOfElement(pom.getInstanceBookingDetail().getBDC_selectfrst());
	}

	@Then("^user Click The Cancel Selected And It Navigates To Alert Box$")
	public void user_Click_The_Cancel_Selected_And_It_Navigates_To_Alert_Box() throws Throwable {
	    
		clickOfElement(pom.getInstanceBookingDetail().getBDC_cancelselected());
	}

	@Then("^user Accpet The Cancel In Alert Box$")
	public void user_Accpet_The_Cancel_In_Alert_Box() throws Throwable {
	   
		alert("accept");
	}
}

$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Adactin.feature");
formatter.feature({
  "line": 1,
  "name": "Hotel Booking In Adactin Application",
  "description": "",
  "id": "hotel-booking-in-adactin-application",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "comments": [
    {
      "line": 2,
      "value": "#background"
    }
  ],
  "line": 5,
  "name": "user To Login",
  "description": "",
  "id": "hotel-booking-in-adactin-application;user-to-login",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 4,
      "name": "@smokeTest"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "user Launch The Application",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "user Enter \"\u003cusername\u003e\" In Username Field",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "user Enter The \"\u003cpassword\u003e\" In Password Field",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "User Click The Login Button And It Navigates To Search Hotel Page",
  "keyword": "Then "
});
formatter.examples({
  "line": 10,
  "name": "",
  "description": "",
  "id": "hotel-booking-in-adactin-application;user-to-login;",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ],
      "line": 11,
      "id": "hotel-booking-in-adactin-application;user-to-login;;1"
    },
    {
      "cells": [
        "hfhgf",
        "3574@"
      ],
      "line": 12,
      "id": "hotel-booking-in-adactin-application;user-to-login;;2"
    },
    {
      "cells": [
        "pppp",
        "64893"
      ],
      "line": 13,
      "id": "hotel-booking-in-adactin-application;user-to-login;;3"
    },
    {
      "cells": [
        "prabhujj",
        "O300O6"
      ],
      "line": 14,
      "id": "hotel-booking-in-adactin-application;user-to-login;;4"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 12,
  "name": "user To Login",
  "description": "",
  "id": "hotel-booking-in-adactin-application;user-to-login;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 4,
      "name": "@smokeTest"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "user Launch The Application",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "user Enter \"hfhgf\" In Username Field",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "user Enter The \"3574@\" In Password Field",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "User Click The Login Button And It Navigates To Search Hotel Page",
  "keyword": "Then "
});
formatter.match({
  "location": "Step_Definition.user_Launch_The_Application()"
});
formatter.result({
  "duration": 4881918900,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "hfhgf",
      "offset": 12
    }
  ],
  "location": "Step_Definition.user_Enter_In_Username_Field(String)"
});
formatter.result({
  "duration": 632131100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "3574@",
      "offset": 16
    }
  ],
  "location": "Step_Definition.user_Enter_The_In_Password_Field(String)"
});
formatter.result({
  "duration": 223420000,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Click_The_Login_Button_And_It_Navigates_To_Search_Hotel_Page()"
});
formatter.result({
  "duration": 1070186200,
  "status": "passed"
});
formatter.scenario({
  "line": 13,
  "name": "user To Login",
  "description": "",
  "id": "hotel-booking-in-adactin-application;user-to-login;;3",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 4,
      "name": "@smokeTest"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "user Launch The Application",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "user Enter \"pppp\" In Username Field",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "user Enter The \"64893\" In Password Field",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "User Click The Login Button And It Navigates To Search Hotel Page",
  "keyword": "Then "
});
formatter.match({
  "location": "Step_Definition.user_Launch_The_Application()"
});
formatter.result({
  "duration": 826087800,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "pppp",
      "offset": 12
    }
  ],
  "location": "Step_Definition.user_Enter_In_Username_Field(String)"
});
formatter.result({
  "duration": 251301700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "64893",
      "offset": 16
    }
  ],
  "location": "Step_Definition.user_Enter_The_In_Password_Field(String)"
});
formatter.result({
  "duration": 199951500,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Click_The_Login_Button_And_It_Navigates_To_Search_Hotel_Page()"
});
formatter.result({
  "duration": 990331200,
  "status": "passed"
});
formatter.scenario({
  "line": 14,
  "name": "user To Login",
  "description": "",
  "id": "hotel-booking-in-adactin-application;user-to-login;;4",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 4,
      "name": "@smokeTest"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "user Launch The Application",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "user Enter \"prabhujj\" In Username Field",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "user Enter The \"O300O6\" In Password Field",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "User Click The Login Button And It Navigates To Search Hotel Page",
  "keyword": "Then "
});
formatter.match({
  "location": "Step_Definition.user_Launch_The_Application()"
});
formatter.result({
  "duration": 1074083200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "prabhujj",
      "offset": 12
    }
  ],
  "location": "Step_Definition.user_Enter_In_Username_Field(String)"
});
formatter.result({
  "duration": 1044198500,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "O300O6",
      "offset": 16
    }
  ],
  "location": "Step_Definition.user_Enter_The_In_Password_Field(String)"
});
formatter.result({
  "duration": 272509000,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Click_The_Login_Button_And_It_Navigates_To_Search_Hotel_Page()"
});
formatter.result({
  "duration": 2747807000,
  "status": "passed"
});
formatter.scenario({
  "line": 18,
  "name": "user To Search Hotel",
  "description": "",
  "id": "hotel-booking-in-adactin-application;user-to-search-hotel",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 17,
      "name": "@sanityTest"
    }
  ]
});
formatter.step({
  "line": 19,
  "name": "user Select The Location In Location Field",
  "keyword": "When "
});
formatter.step({
  "line": 20,
  "name": "user Select The Hotel IN Hotel Field",
  "keyword": "And "
});
formatter.step({
  "line": 21,
  "name": "user Select The Room Type In Room Field",
  "keyword": "And "
});
formatter.step({
  "line": 22,
  "name": "user Select The Number Of Room In Number Of Room Field",
  "keyword": "And "
});
formatter.step({
  "line": 23,
  "name": "user Enter The Check In Date In Check In Date Field",
  "keyword": "And "
});
formatter.step({
  "line": 24,
  "name": "user Enter The Check Out Date In Check Out Date Field",
  "keyword": "And "
});
formatter.step({
  "line": 25,
  "name": "user Select The Adult Per Room In Adult Per Room Field",
  "keyword": "And "
});
formatter.step({
  "line": 26,
  "name": "user Select The Children Per Room In Children Per Room Field",
  "keyword": "And "
});
formatter.step({
  "line": 27,
  "name": "user Click The Reset Button In Reset GUI Button",
  "keyword": "And "
});
formatter.step({
  "line": 28,
  "name": "user Click The Search Button And It Navigates To Select Hotel Page",
  "keyword": "Then "
});
formatter.match({
  "location": "Step_Definition.user_Select_The_Location_In_Location_Field()"
});
formatter.result({
  "duration": 4015319900,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Select_The_Hotel_IN_Hotel_Field()"
});
formatter.result({
  "duration": 3313052500,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Select_The_Room_Type_In_Room_Field()"
});
formatter.result({
  "duration": 3287095300,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Select_The_Number_Of_Room_In_Number_Of_Room_Field()"
});
formatter.result({
  "duration": 3243641500,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Enter_The_Check_In_Date_In_Check_In_Date_Field()"
});
formatter.result({
  "duration": 172042400,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Enter_The_Check_Out_Date_In_Check_Out_Date_Field()"
});
formatter.result({
  "duration": 198509500,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Select_The_Adult_Per_Room_In_Adult_Per_Room_Field()"
});
formatter.result({
  "duration": 6272737600,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Select_The_Children_Per_Room_In_Children_Per_Room_Field()"
});
formatter.result({
  "duration": 3259436400,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Click_The_Reset_Button_In_Reset_GUI_Button()"
});
formatter.result({
  "duration": 66400,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Click_The_Search_Button_And_It_Navigates_To_Select_Hotel()"
});
formatter.result({
  "duration": 1632994200,
  "status": "passed"
});
formatter.scenario({
  "line": 31,
  "name": "user Select The Hotel",
  "description": "",
  "id": "hotel-booking-in-adactin-application;user-select-the-hotel",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 30,
      "name": "@sanitytest"
    }
  ]
});
formatter.step({
  "line": 32,
  "name": "user Select The Hotel In Check Box",
  "keyword": "When "
});
formatter.step({
  "line": 33,
  "name": "user Click The Continue Button And It Navigates To Book Hotel Page",
  "keyword": "Then "
});
formatter.match({
  "location": "Step_Definition.user_Select_The_Hotel_In_Check_Box()"
});
formatter.result({
  "duration": 237436600,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Click_The_Continue_Button_And_It_Navigates_To_Book_Hotel_Page()"
});
formatter.result({
  "duration": 1321134800,
  "status": "passed"
});
formatter.scenario({
  "line": 36,
  "name": "user Book A Hotel",
  "description": "",
  "id": "hotel-booking-in-adactin-application;user-book-a-hotel",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 35,
      "name": "@sanitytest"
    }
  ]
});
formatter.step({
  "line": 37,
  "name": "user Enter The First Name In First Name Field",
  "keyword": "When "
});
formatter.step({
  "line": 38,
  "name": "user Enter The Last Name In Last Name Field",
  "keyword": "And "
});
formatter.step({
  "line": 39,
  "name": "user Enter The Billing Address In Billing Address Field",
  "keyword": "And "
});
formatter.step({
  "line": 40,
  "name": "user Enter The Credit Card Number In Credit Card Number Field",
  "keyword": "And "
});
formatter.step({
  "line": 41,
  "name": "user Select The Credit Card Type In Credit Card Type Field",
  "keyword": "And "
});
formatter.step({
  "line": 42,
  "name": "user Select The Credit Card Expiry Month In Expiry Date Field",
  "keyword": "And "
});
formatter.step({
  "line": 43,
  "name": "user Select The Credit Card Expiry Year In Expiry Date Field",
  "keyword": "And "
});
formatter.step({
  "line": 44,
  "name": "user Enter The Cvv Number In Cvv Number Field",
  "keyword": "And "
});
formatter.step({
  "line": 45,
  "name": "user Click The Book Now Button And It Navigates To Booking Conformation Page",
  "keyword": "Then "
});
formatter.match({
  "location": "Step_Definition.user_Enter_The_First_Name_In_First_Name_Field()"
});
formatter.result({
  "duration": 290222600,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Enter_The_Last_Name_In_Last_Name_Field()"
});
formatter.result({
  "duration": 262197900,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Enter_The_Billing_Address_In_Billing_Address_Field()"
});
formatter.result({
  "duration": 324024600,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Enter_The_Credit_Card_Number_In_Credit_Card_Number_Field()"
});
formatter.result({
  "duration": 264723500,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Select_The_Credit_Card_Type_In_Credit_Card_Type_Field()"
});
formatter.result({
  "duration": 3243826700,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Select_The_Credit_Card_Expiry_Month_In_Expiry_Date_Field()"
});
formatter.result({
  "duration": 9275625000,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Select_The_Credit_Card_Expiry_Year_In_Expiry_Date_Field()"
});
formatter.result({
  "duration": 24313318500,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Enter_The_Cvv_Number_In_Cvv_Number_Field()"
});
formatter.result({
  "duration": 222685500,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Click_The_Book_Now_Button_And_It_Navigates_To_Booking_Conformation_Page()"
});
formatter.result({
  "duration": 157743900,
  "status": "passed"
});
formatter.scenario({
  "line": 48,
  "name": "user Booking Conformation",
  "description": "",
  "id": "hotel-booking-in-adactin-application;user-booking-conformation",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 47,
      "name": "@sanitytest"
    }
  ]
});
formatter.step({
  "line": 49,
  "name": "user Click The My Itinerary Button And It Navigates To Booked Itinerary",
  "keyword": "Then "
});
formatter.match({
  "location": "Step_Definition.user_Click_The_My_Itinerary_Button_And_It_Navigates_To_Booked_Itinerary()"
});
formatter.result({
  "duration": 7397207500,
  "status": "passed"
});
formatter.scenario({
  "line": 52,
  "name": "show The Booked Itinerary",
  "description": "",
  "id": "hotel-booking-in-adactin-application;show-the-booked-itinerary",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 51,
      "name": "@regressiontest"
    }
  ]
});
formatter.step({
  "line": 53,
  "name": "user Select The Any Order Id In Order Id Check Box",
  "keyword": "When "
});
formatter.step({
  "line": 54,
  "name": "user Click The Cancel Selected And It Navigates To Alert Box",
  "keyword": "Then "
});
formatter.step({
  "line": 55,
  "name": "user Accpet The Cancel In Alert Box",
  "keyword": "And "
});
formatter.match({
  "location": "Step_Definition.user_Select_The_Any_Order_Id_In_Order_Id_Check_Box()"
});
formatter.result({
  "duration": 148600800,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Click_The_Cancel_Selected_And_It_Navigates_To_Alert_Box()"
});
formatter.result({
  "duration": 181040700,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Accpet_The_Cancel_In_Alert_Box()"
});
formatter.result({
  "duration": 45855100,
  "status": "passed"
});
});
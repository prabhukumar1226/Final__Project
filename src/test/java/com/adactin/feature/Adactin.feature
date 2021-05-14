Feature: Hotel Booking In Adactin Application
#background

@smokeTest
Scenario Outline: user To Login 
Given user Launch The Application
When user Enter "<username>" In Username Field 
And user Enter The "<password>" In Password Field 
Then User Click The Login Button And It Navigates To Search Hotel Page 
Examples:
	|username|password|
	|hfhgf|3574@|
	|pppp|64893|
	|prabhujj|O300O6|


@sanityTest
Scenario: user To Search Hotel
When user Select The Location In Location Field
And user Select The Hotel IN Hotel Field 
And user Select The Room Type In Room Field
And user Select The Number Of Room In Number Of Room Field 
And user Enter The Check In Date In Check In Date Field
And user Enter The Check Out Date In Check Out Date Field
And user Select The Adult Per Room In Adult Per Room Field
And user Select The Children Per Room In Children Per Room Field 
And user Click The Reset Button In Reset GUI Button 
Then user Click The Search Button And It Navigates To Select Hotel Page

@sanitytest
Scenario: user Select The Hotel 
When user Select The Hotel In Check Box 
Then user Click The Continue Button And It Navigates To Book Hotel Page 

@sanitytest
Scenario: user Book A Hotel 
When user Enter The First Name In First Name Field
And user Enter The Last Name In Last Name Field 
And user Enter The Billing Address In Billing Address Field 
And user Enter The Credit Card Number In Credit Card Number Field 
And user Select The Credit Card Type In Credit Card Type Field 
And user Select The Credit Card Expiry Month In Expiry Date Field 
And user Select The Credit Card Expiry Year In Expiry Date Field 
And user Enter The Cvv Number In Cvv Number Field 
Then user Click The Book Now Button And It Navigates To Booking Conformation Page 

@sanitytest
Scenario: user Booking Conformation 
Then user Click The My Itinerary Button And It Navigates To Booked Itinerary

@regressiontest
Scenario: show The Booked Itinerary
When user Select The Any Order Id In Order Id Check Box 
Then user Click The Cancel Selected And It Navigates To Alert Box  
And user Accpet The Cancel In Alert Box 
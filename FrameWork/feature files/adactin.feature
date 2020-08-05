Feature: Adactin application 
Scenario: To verify valid login details 
	Given Launch hotel reservation application using URL as in test data 
	When  Login to the application using username and password as in test data 
	
	
Scenario: 
	To check the check-out date field accepts a later date than checkin date 
	Given Launch hotel reservation application using URL as in test data 
	When Login to the application using username and password as in test data 
	Then Select location as in test data 
	Then Select hotel as in test data 
	Then Select room type as in test data 
	Then Select no-of-rooms as in test data 
	Then Enter check-in-date later than check-out-date 
	And Verify that system gives an error saying check-in-date should not be later than check-out-date 
	
Scenario: To check if error is reported if check-out date field is 
	Then Enter check-out-date as in test data 
	And Verify that application throws error message 
	
Scenario: 
	To verify whether locations in Select Hotel page are displayed according to the location selected in Search Hotel 
	Then getting the details of the hotel page 
	And Verify that hotel displayed is the same as selected in search Hotel form 
	
Scenario: 
	To verify whether no. of rooms entry in Select Hotel page is same as the Number of rooms selected in search hotel page 

	Then No-of-rooms should be displayed and match with number of rooms in search hotel page 
Scenario: To verify room types 
	Then verification of the rooms types should be same 
	
Scenario: 
	To verify whether the total price (excl.GST) is calculated as “price per night * no. of nights* no of rooms”. 

	Then verification of the total price 
	
Scenario: To check the final price amount inclu Gst 

	Then select hotel and click on continue button 
	And total price in last form 
Scenario: Verify Order number is generated in booking confirmation page 
	Given user is on final page of booking to enter the first name 
	Then last name is entered 
	Then entering billing address 
	Then entering credit card number 
	Then entering credit card type 
	Then user enters cvv number 
	Then user enters expiry date of the card 
	Then clickin on book now button 
	Then order number should be generated 
Scenario: To verify whether the booked itinerary details are not editable 
	When Click on My itinerary button 
	Then User should logout from the application 
	
	
Scenario: 
	To check “search order id” query is working and displaying the relevant details 

	Given login in the page again 
	When  Login to the application using username and password as in test data 
	Then click on booked itinery 
	Then entering order id 
	Then User should logout from the application 
	
Scenario: order cancelation 
	Given login in the page again 
	When  Login to the application using username and password as in test data 
	Then click on booked itinery 
	Then entering order id 
	And Click on Cancel Order Number 
	Then Click Yes on pop up which asks where to cancel order or not 
	Then entering order id 
	And verifying the cancelled order is no more exist 
	Then User should logout from the application 
Scenario: To Verify Title of every Page 
	Given login in the page again 
	When  Login to the application using username and password as in test data 
	Then verifying booking page title 
	Then Select location as in test data 
	Then Click on Search button 
	Then verifying hotel page title 
	
	
	
	
	
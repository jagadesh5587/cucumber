Feature: verify fb login 
@negative 
Scenario: login fb page 
	Given launch fb url 
	When enter user name and password 
	Then click login 
	@positive
Scenario Outline: login to fb page2 
	Given launch fb url 
	When enter "<surname>" and "<password>" 
	Then click login 
	Examples:
	   |surname|password|
	   |jagan|hari|
	   
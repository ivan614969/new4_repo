Feature: PestRoutes Web Application: New Subscription Feature 
	As a new customer I want to make a new Subscription for Recurring service and Schedule follow-up.

Scenario Outline: 
	New customers should get Recurring Service and Schedule follow-up on time. 
	Given a customer logged in using "<username>" and "<password>" 
	When customer clicks New Customer button 
	When user submits "<first_Name>" and "<last_Name>" 
	When user navigates to Subscription -> New Subscription 
	When customer choose Recurring Service Alternate Monthly 
	Then upcoming service should be Two months from now at "<Recurring_Date>"
	When customer choose Initial follow-up to be One month 
	Then upcoming service should be One month from now at "<Followup_Date>"
	
	Examples: 
		|username 		|password		 |first_Name		|last_Name	|Recurring_Date	|Followup_Date	|
		|qatest 		|Qatest1234      |Iva        		|Chy      	|4/27/20      	|3/27/20      	|
	  
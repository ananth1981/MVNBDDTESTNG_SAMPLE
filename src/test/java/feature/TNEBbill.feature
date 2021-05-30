Feature: TNEB to know Bill Detail of Monthly- Selenium with BDD
@TNEB
	Scenario: Launch TNEB Portal to know current Month Bill to pay
	Given Lauch TNEB portal
	When Region of the Service
	Then Enter from service number in three fields
	Then Enter Mobile Number
	Then enter Capcha
	Then Click Proceed Button
	And Displaying Current Month EB Bill details
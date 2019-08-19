Feature: Develop a RPN Calculator application in Java

	Scenario: Simple addition
		Given I have deployed the RPNCalculator SOAP api at URL "http://localhost:8080/rpncalculator-ws/services/RPNCalculator?wsdl"
		And the input is "10 15 +"
		When I invoke th SOAP api
		Then I expect the response as "25.0"
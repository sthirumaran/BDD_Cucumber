

Feature: Youtube Search validations	
@TestCase1
	Scenario: Youtube Search possitive scenarios
	Given Open chrome browser and enter url
	 When Enter search creteria
	Then Click on search button
	
	
	
	
  @tag2
  Scenario Outline: Title of your scenario outline
    Given I want to write a step with <name>
    When I check for the <value> in step
    Then I verify the <status> in step

    Examples: 
      | name  | value | status  |
      | name1 |     5 | success |
      | name2 |     7 | Fail    |

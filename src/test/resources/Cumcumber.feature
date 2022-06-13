
Feature: OrangeHrm site practice 
 Scenario: Verify the login page 
    Given User should be on loginpage
    When User enter valid id as userame and valid password 
    And User click login button
    Then The homepage should be displayed 

  
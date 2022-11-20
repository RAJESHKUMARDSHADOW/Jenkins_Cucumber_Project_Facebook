@Forget
Feature: To Validate facebook application login functionality

  Scenario: To Validate login functionality
    Given User have to enter facebook using chrome
    When User enters valid username and invalid password
    Then User have to receive the message as invalid credentials
    And User have to close the browser

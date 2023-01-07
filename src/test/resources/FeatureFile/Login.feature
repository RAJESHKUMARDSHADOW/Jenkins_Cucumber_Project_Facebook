@Facebook
Feature: To Validate facebook application login functionality

  @Login
  Scenario: To Validate login functionality
    Given User have to enter facebook using chrome
    When User enters valid username and invalid password
    Then User have to receive the message as invalid credentials
    And User have to close the browser

  @Forget
  Scenario: To validate forget password functionality
    Given User have to enter facebook using chrome
    When User enter forget password page
    Then User enter invalid username
    And User gets an invalid username displayed
    And User have to close the browser

@SmokeScenario
Feature: Invalid Login

  @SmokeTest1
  Scenario: Login with invalid data
    Given enter emailid
    When enter first name
    Then enter last name
    Then select checkbox
    Then click on signup button



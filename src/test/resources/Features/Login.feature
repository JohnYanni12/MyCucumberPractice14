Feature: Login Story
  Scenario: Valid credentials

    Given user is navigated to HRMS application
    When user enter username
   And user enter password
    And user clicks on login button
#    And  user is successfully logged in
  Then user close the browser
#  Scenario Outline: Invalid login functionality
#    When user enters different "<username>" and"<password>" and verify the "<error>" for it
#    Examples:
#    |username|password|error|
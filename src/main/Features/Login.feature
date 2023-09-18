@Smoke

Feature: user should be able to login with his username and password.

  #Scenario1
  Scenario: Admin-user logs-in with valid username and valid password
#    Given Admin-user navigates to login webpage, not needed cuz i use @Before from cucumber library
    When user inserts valid username "hamed+22a@parent.cloud"
    And inserts valid password "12345678"
    And clicks on submit button
    Then user is logged-in to his account
    And dashboard interface is displayed
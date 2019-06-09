@Automation @Login
Feature: Login
  Login of user in the system

  Scenario Outline: Valid login
    Given I accessed the login page
    When I type the email "<email>" password "<password>" and click the login button
    Then system should open the My Account page

    Examples:
      | email                        | password |
      | test.registration@mailcatch.com | 123456   |
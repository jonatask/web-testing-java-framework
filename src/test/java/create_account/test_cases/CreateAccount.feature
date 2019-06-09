@Automation @Client @CreateAccount
Feature: Create account
  Register a new account

  Scenario Outline: Valid account
    Given I accessed the registration page
    When register myself as "<first_name>" lastname "<lastname>" email "<email>" phone number "<phone>" password "<password>"
    Then system should save the registration

    Examples:
      | first_name | lastname | email                   | phone      | password |
      | Jonatas    | Kirsch   | test{random}@mailcatch.com | 1185859696 | 159753   |
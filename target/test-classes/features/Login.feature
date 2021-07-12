@all
Feature: Library App login feature
  User Story:
  As a user, I should be able to login with correct credentials to different accounts.And dashboard should be displayed.
  Accounts are: librarian, student, admin

@librarian
  Scenario: Login as librarian
    Given user is on the login page
    When user enters librarian username
    And user enters librarian password
    Then user should see the dashboard

@student
    Scenario: Login as student
      Given user is on the login page
      When user enters student username
      And user enters student password
      Then user should see the dashboard

      @admin
      Scenario: Login as admin
        Given user is on the login page
        When user enters the admin username
        And user enters the admin password
        Then user should see the dashboard




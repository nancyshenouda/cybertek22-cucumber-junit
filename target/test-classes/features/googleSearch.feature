
Feature: Google search functionality
  Agile Story: As a user, when I am on the google search page, I should be able to search whatever I want and see relevant information

  Scenario: User search page title verification
    Given User is on google home page
    Then User should see title is Google

    Scenario: User search title verification
      Given User is on google home page
      When user searches for "wooden spoon"
      Then User should see "wooden spoon" in the title

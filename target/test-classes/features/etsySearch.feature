Feature: Etsy search feature
  Agile story: user search for wooden spoon in Etsy search page

  Background: Assuming user is on the Etsy landing page
    Given user is on the Etsy landing page

  Scenario: Etsy default title verification
    Then user should see Etsy title as expected

    #expected title = Etsy - Shop for handmade, vintage, custom, and unique gifts for everyone


  @wip
  Scenario: Etsy Search Functionality Title Verification
    When user types wooden spoon in the search
    And user clicks to search button
    Then user sees title is Wooden spoon | Etsy



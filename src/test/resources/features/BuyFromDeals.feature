Feature: As a user I want to add new items to my cart

  @BuyDeals
  Scenario Outline:
    Given I am on the homepage
    Then I click to menu dropdown
    And I click to Weekly Ad
    Then I click to coke to add my cart
    And I add "<deals>" to my cart
    Then I close page
    And Click to Cart sign
    And Click to checkout button
    Examples:
      | deals               |
      | Dr Pepper Zero Cola |
      | Cherry Cola         |





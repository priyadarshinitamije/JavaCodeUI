#Author
#Date
#Description
@SmokeScenario
Feature: feature to check car listing in the TradeMe UsedCars category

  @SmokeTest
  Scenario: Check if there is at least one listing in UsedCars category
    Given User is on browser page
    When user enter usedcars in search box
    And clicks on enter button
    Then user should be able to view at least one listing in UsedCars category


#Author
#Date
#Description


@SmokeScenario
Feature: feature to check if Kia cars are displayed


@SmokeTest
Scenario: Check if "Kia" exists in the TradeMe UsedCars category
    Given user is on used cars page
    When user enters "Kia" in search box
    And clicks enter button
    Then user should be able to view "Kia" in UsedCars category

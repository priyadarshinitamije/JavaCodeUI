#Author
#Date
#Description

@SmokeScenario
Feature: feature to confirm the car details

@SmokeTest 
Scenario Outline: Check the car details matches with the displayed car
    Given user is on Usedcars page
    When user enters specific <Car Details> in the filter category
    And clicks on Enter button
    Then user should be able to confirm the given car details

      
      
      
Examples:
    |Number Plate|Kilometers|Body |Seats |Fuel Type|Engine|Transmission    |History        |Registration Expires|W0F Expires|Model Detail|
    |    LWT143  |   65,000 |Wagon|5 door|Diesel   |2200CC|Sports Automatic|Collision alert|   20/12/20         |04/06/21   |Kia Carnival 2019|
    
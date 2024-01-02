@smoke
Feature: User should be able to add and delete a record


  Scenario: User could add a record with valid data
    Given User navigates to the Fuel Tracker page
    When User enters the Car Number "123"
    And User enters the Fuel in Liters "5"
    And User enters the Fuel Cost "250"
    And User enters the Fuel Type "Test"
    And User enters the Date and Time "1020202202210a"
    And User enters the Customer Company Id "x11"
    And User press Add button
    Then The record will be added and the user can see the delete button and the data he entered for example company id "x11"

  Scenario: User could delete a record
    Given User navigates to the Fuel Tracker page
    When User enters the Car Number "111"
    And User enters the Fuel in Liters "5"
    And User enters the Fuel Cost "250"
    And User enters the Fuel Type "Test2"
    And User enters the Date and Time "1020202202210a"
    And User enters the Customer Company Id "x112"
    And User press Add button
    And User click on the Delete button
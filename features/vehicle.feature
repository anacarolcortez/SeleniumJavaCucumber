@Automobile
Feature: Send Vehicle Data Form

  Background:
    Given the user selected the Automobile Insurance menu

  Scenario: TC001 - Send Vehicle Data Form for automobile product
    And the user is in the Vehicle Data Form
    And the user submits Vehicle Form correctly
      | make        | Porsche    |
      | performance | 125        |
      | date        | 11/30/2021 |
      | number      | 4          |
      | type        | Gas        |
      | price       | 100000     |
      | mileage     | 200        |
    And the user presses the Next button in the Vehicle Page
    And the user is sent to the Insurant Data form
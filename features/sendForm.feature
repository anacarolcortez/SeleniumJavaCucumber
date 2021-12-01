#language: en
@vehicle
Feature: Send Automobile Insurance Form through Tricentis Site

  @AutomobileInsuranceForm
  Scenario: TC001 - Send Insurance form for Automobile product filling mandatory fields
    Given the user selected the Automobile Insurance menu
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
    And the user is redirected to the Insurant Data form
    And the user submits Insurant Form correctly
      | firstName   | Daenerys     |
      | lastName    | Targaryen    |
      | birthDate   | 04/15/2000   |
      | country     | Morocco      |
      | zipcode     | 1234         |
      | occupation  | Selfemployed |
      | hobbies     | Skydiving    |
    And the user presses the Next button in the Insurant Page
    And the user is redirected to the Product Data form
    And the user submits Product Form correctly
      | startDate   | 01/02/2022              |
      | sum         | 7000000                 |
      | merit       | Bonus 3                 |
      | damage      | Partial Coverage        |
      | optional    | Legal Defense Insurance |
      | courtesy    | Yes                     |
    And the user presses the Next button in the Product Page
    And the user is redirected to the Price Form
    And the user selects the option "Gold" for the insurance
    And the user presses the Next button in the Price Page
    And the user is redirected to the Quote Form
    And the user submits Quote Form correctly
      | email     | dtargaryen@dracarys.com |
      | username  | motherOfDragons         |
      | password  | MotherOfDragons3        |
    When the user presses the Send button in the Quote Form
    And the message "Sending e-mail success!" is displayed
    Then the user presses the OK button

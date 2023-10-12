#Data-Driven Testing
Feature: determine the position of the color in rainbow
  Scenario Outline: client selects valid input
    Given the client checks the service is up
    When the client calls GET /rainbow with selected color "<color>"
    Then the client receives position "<position>" for "<color>"
    Examples:
      |color   | position |
      |Red     |  7       |
      |Indigo  |  3       |
      |Yellow  |  5       |
      |Violet  |  1       |

  @SmokeTest
  Scenario Outline: client selects invalid input
    Given the client checks the service is up
    When the client calls GET /rainbow with selected color "<color>"
    Then the client receives position "<position>" for "<color>"
    Examples:
      |color   | position |
      |Magenta | 0        |
      |Burgundy| 0        |
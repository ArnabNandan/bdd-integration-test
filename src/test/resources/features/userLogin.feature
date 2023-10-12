#@UI
#Feature: checking user login flow
#  Scenario Outline: client selects valid input
#    Given user navigates to login page by opening Firefox
#    When user enters correct "<username>" AND "<password>" values
#    Then user gets directed to homepage
#    Examples:
#      | username | password |
#      | admin    |  admin   |
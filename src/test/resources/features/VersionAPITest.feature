Feature: retrieve API version
  Background: The API server is up and running
  Scenario: client makes call to GET /version
    When the client calls /version
    Then the client receives status code of 200
    And the client receives server response 1.0
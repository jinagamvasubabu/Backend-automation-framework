Feature: API Testing
  As a tester
  I want to ensure that the API endpoints return the expected responses

  Scenario: Validate API response for GET request
    Given the API endpoint "/tutorials/1"
    When I make a GET request
    Then the response status code should be 200
    And the title should contain "Master class by vasu"


  Scenario: Validate API response for GET request
    Given the API endpoint "/tutorials/3"
    When I make a GET request
    Then the response status code should be 404
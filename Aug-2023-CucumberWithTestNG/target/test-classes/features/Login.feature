Feature: Login functionality

  Scenario: Login to Leaftaps application
    When Enter the username as "rajkumar@testleaf.com"
    And Enter the password as "Leaf@123"
    And Click login button
    Then Home page is verified

  Scenario: Login to Leaftaps application
    When Enter the username as "lokesh@testleaf.com"
    And Enter the password as "Leaf@123"
    And Click login button
    Then Home page is verified
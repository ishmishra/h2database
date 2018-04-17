Feature: Trying to test h2 database

  Scenario: Insert data into h2 database
    Given I am connected to the database
    When I execute a select query
    Then I should get some result

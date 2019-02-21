Feature: This is my first Feature
  # whatever the comment is you cut here

  Scenario: Google search scenario
    When user goes to google application
    Then user searches for apple
    And  user should see apple related results

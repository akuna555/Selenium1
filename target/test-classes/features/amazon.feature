@amazon1
  Feature: Amazon search
    Background:User is on the amazon homepage
    Scenario: Amazon search test
      Given  User is on the amazon homepage
      When   User enters headphones keyword
      And    User clicks search button
      Then   User should see headphones in results

    Scenario: Amazon search test1
      Given  User is on the amazon homepage
      When   User enters headphones keyword
      And    User clicks search button
      Then   User should see headphones in results


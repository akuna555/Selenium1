@youtube
Feature: Youtube search feature
  Background: User is on the homepage and is able to see searchbox and search button
    Given user is on the youtube homepage
    And User is able to see the search box
    And User ckicks search button

  Scenario: Testing youtube search

    When User search for Funny CatVideos
    Then User should see results related to funny cact videos

    Scenario: Testing youtube search

      When User searches for FUNNY GOG Videos
      Then User should see results related to funny to funny cat videos

      Scenario: Testing youtube search

        When User searches for Funny Pet Videos
        Then User should see results related to funny cat videos
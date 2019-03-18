@login
  Feature: The Login Page
    As a returning customer
    I want to login to the application
    So that I can view my accountn balance
    Background:
      Given the user is on the login page

      Scenario: the user should be able to login with valid credentials
        When the user enters valid credentials
        Then the user should be able to view account balance

        Scenario: the user should not be able to login with bad credentials
        When the user enters bad credentials
        Then the use should not be able to login
        And user should get an invalid login message
      @login3
          Scenario: the user should be able to log in
            When user enters username as "tim@testmail.com"
            And  user enters password as "trpass"
            And  user clicks on login
            Then the user should be able to view account balance
        @login4
        Scenario Outline: the user  shouold be able to login
          When the user enters "<username>" and "<password>"
          Then the user should be able to view account balance
          Examples:
          |username         |password|
          |tim@testmail.com |trpass  |
          |lisa@testmail.com|lpass   |
    @login5
          Scenario: after a failed attempt, the user should be able to login again
            When the user enters set of "<username>" and "<password>"
            |username         |password|
            |lisa@testmail.com|lpass  |
            |tim@testmail.com |trpass |
            Then  the user should be able to iew account balance

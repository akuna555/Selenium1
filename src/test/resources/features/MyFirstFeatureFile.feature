@facebook
Feature: Create account of Facebook
  As a user u need to open faceBook home page and do the validations

  Scenario: Validate First Name field
    Given User need to be on the Facebook Page
    When User enters user first name
    Then User checks user first name is present

    Scenario: Validate create user miltiple fields
      Given User need to be on FaceBOOK Logi Page
      When User enters user first name
      And user enters username
      Then User checks user first anme is present
      But User Mobile field should be blank
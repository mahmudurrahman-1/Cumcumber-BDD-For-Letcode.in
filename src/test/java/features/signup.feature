Feature: This is Sign up Feature

  Scenario: 1st user Sign up
    Given Go to sign up page
    When Enter "1st" user informations
    Then Successful Registration

  Scenario: 2nd user Sign up
    Given Go to sign up page
    When Enter "2nd" user informations
    Then Successful Registration
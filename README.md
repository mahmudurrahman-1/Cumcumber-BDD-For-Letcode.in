# Cucumber Automation on letcode.in
Test automation with Cucumber, Gherkin, Selenium, Java, TestNG, Maven

# Gherkin
It provides a set of special keywords to give structure and meaning to executable specifications.The primary keywords are:
### The primary keywords are:
#### Feature
#### Rule (as of Gherkin 6)
#### Example (or Scenario)
#### Given, When, Then, And, But for steps (or *)
#### Background
#### Scenario Outline (or Scenario Template)
#### Examples (or Scenarios)

In this project i have used some of the keyword for different scenarios

# Login
### Feature: This is login feature
    # Scenario Outline: Test Login Module.
    # Given Go to login page
    # When Give input <email> and <password>
    # Then Successful login

# Registration
### Feature: This is Sign up Feature
    # Scenario: nth user Sign up
    # Given Go to sign up page
    # When Enter "nth" user informations
    # Then Successful Registration


### Gherkin Syntax: </br>
**Feature**: Title of the Scenario </br>
**Given** [Preconditions or Initial Context] </br>
**When** [Event or Trigger] </br>
**Then** [Expected output] </br>



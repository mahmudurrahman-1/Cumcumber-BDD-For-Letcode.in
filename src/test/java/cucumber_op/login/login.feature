#feature helps to define objective
Feature: Login into the application
# Scenario: tells us the testing type and it must contains database as Examples below
  Scenario Outline: Positive test validating for login
    #Given tells the place to navigate
    Given Goto login page
    #When tells something going to be happened
    When User give inputs as <email> and <password>
    # Tells this will happen
    Then Successfully logged in
    #related to Scenario outline
    Examples:
      | email                         | password      |
      | mahmudur.rahman.sqa@gmail.com | mahmudur@1234 |
      | mahmudurrahman887@gmail.com   | mahmudur@4321 |



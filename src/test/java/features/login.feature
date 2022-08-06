Feature: This login feature

  Scenario Outline: Test Login Module
    Given Go to login page
    When Give input <email> and <password>
    Then Successful login
    Examples:
      | email                         | password    |
      | mahmudur.rahman.sqa@gmail.com | Mahmudur0010 |
      | rthe1761@gmail.com            | Jawad0010    |
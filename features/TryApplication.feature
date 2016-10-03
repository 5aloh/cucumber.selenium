Feature: Test Facebook smoke scenario

  Scenario Outline: Test login with valid credentials
    Given Open Chrome and start application
    When I enter "<firstname>", "<lastname>", "<email>", "<reemail>" and "<password>"
    Then user should be able to login successfully

    Examples: 
      | firstname | lastname   | email              | reemail            | password  |
      | salomon1  | Hernandez1 | asokdas@gmail.com  | asokdas@gmail.com  | asdplqwe  |
      
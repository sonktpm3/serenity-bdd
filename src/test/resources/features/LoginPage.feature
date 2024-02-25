Feature: Login to HRM

  @ValidCredentials
  Scenario Outline: Login with valid credentials

    Given User is on Home page
    When User enters username as '<username>'
    And User enters password as '<password>'

    Examples:
      |username               |password |
      |standard_user          |secret_sauce    |
      |locked_out_user        |secret_sauce |
      |problem_user           |secret_sauce   |
      |performance_glitch_user| secret_sauce"%   |


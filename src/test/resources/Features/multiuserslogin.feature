Feature: Login with multiple user
  I want to verify login with multiple users

  Scenario Outline: Multiple users Login
    Given user navigates to sauce labs
    When I enter Username as "<username>" and Password as "<password>"
    Then login should be successful

    Examples: 
      | username        | password     |
      | standard_user   | secret_sauce |
      | locked_out_user | secret_sauce |
      | problem_user		|	secret_sauce |
      | performance_glitch_user| secret_sauce |
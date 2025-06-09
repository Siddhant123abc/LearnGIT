Feature: Title of your feature
  I want to use this template for my feature file

  @siddhant
  Scenario Outline: Title of your scenario
    Given I want to write a step with precondition
      | complete | action |
      | siddhant |    123 |
      | payal    |    456 |
      | testing  |    789 |
    And some other precondition
    When I complete action
      | complete | action |
      | siddhant |    123 |
      | payal    |    456 |
      | testing  |    789 |
    And some other action
      | complete | action |
      | siddhant |    123 |
      | payal    |    456 |
      | testing  |    789 |
    And yet another action
    Then I validate the outcomes
    And check more outcomes

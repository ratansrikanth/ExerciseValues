Feature: Calculation Functionality

  Scenario: Sum of values
    Given I am on the exercise1.com webpage
    When values are entered in the input boxes
      | 122365.24 |
      | 599.00    |
      | 850139.99 |
      | 23329.50  |
      | 566.27    |
    Then validate the sum of the values is 1000000.00
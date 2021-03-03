Feature: Fizz,buzz or fizzbuzz?


  Scenario Outline: check for answer fizz, buzz, fizzbuzz
    Given given number is <number>
    When I ask for answer
    Then I should be told <answer>
    Examples:
      | number | answer |
      | number three | "Fizz" |
      | number five | "Buzz" |
      | number fifteen | "FizzBuzz" |
      | number eight | "None" |

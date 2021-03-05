Feature: Cash Withdrawal
  Scenario: Succesful withdrawal from a wallet in credit
    Given I have deposited $200 in my wallet
    When I request $30
    Then $30 should be dispensed

Scenario: Fail to withdraw from wallet,
  Given I have deposited $50 in my wallet
  When I request $100
  Then Withdraw zero and get notification
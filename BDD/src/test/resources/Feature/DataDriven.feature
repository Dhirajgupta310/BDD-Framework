Feature: Testing Contact List Application

  Scenario Outline: Testing validity of creadenials
    Given User is on LoginPage
    When User is providing "<Username>" & "<Password>"
    Then User is clicking on Submit Button
    Then Verifying the Title of page

    Examples: 
      | Username          | Password    |
      | demo123@gmail.com |   123456789 |
      | demo456@gmail     |   000000000 |
      | mode123@gmail.com | 23334357564 |

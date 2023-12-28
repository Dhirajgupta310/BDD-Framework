Feature: 

  Scenario: Testing Login Functionality Using DataTable
    Given user on login Page
    When User Enters email and Password
      | demo123@gmail.com | 123456789 |
    Then User Click On Sumbit Button
    Then User Verifies The Title
    And User Click On Add New Contact Button
    Then User Enters Presonal Information
    
      | First Name       | Dhiraj              |
      | Last Name        | Gupta               |
      | Date of Birth    | 10/12/1999          |
      | Email            | demo123@gmail.com   |
      | Phone            |           777855492 |
      | Street Address 1 | Jumuna nager 431203 |
      | City             | Jalna               |
      | Country          | India               |

Feature: Testing Contact List App

  Background: 
    Given User is on LoginPage
    When User Clicks on Signup button

  Scenario: 1 Testing Signup Functionality(Fname , Lname)
    Then User enters Fname & Lname
    And User Clicks on Submit Button

  Scenario: 2 Testing Signup Functionality (email,password)
    Then User enters Email & Password
    Then Clicks on Cancel button

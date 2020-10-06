Feature: Test the login functionality

  Scenario: Validate that the user successfully logs in with valid credentials
   Given The browser is open
   And The user is on login page
   Then The user enters "kavitabansal_01@yahoo.co.in" and "Learncrm" and clicks on login button
   
   Then The user is navigated to home page
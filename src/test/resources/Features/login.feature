Feature: Test the login functionality

  #Scenario: Validate that the user successfully logs in with valid credentials
   # Given The browser is open
   #And The user is on login page
   #Then The user enters "kavitabansal_01@yahoo.co.in" and "Learncrm"
   #And The user clicks on login button
   # Then The user is navigated to home page
    
   Scenario Outline: Validate that the user successfully logs in with valid credentials
    Given The browser is open
    And The user is on login page
    Then The user enters <email> and <password> and clicks on login button
    Then The user is navigated to home page
    
    Examples:
    | email | password |
    | kavitabansal_01@yahoo.co.in | Learncrm |
    | raghav@yahoo.com | cute |
    
    
    

 
 
    

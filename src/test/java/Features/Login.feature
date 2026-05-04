Feature: Validate login Functionality.

Scenario Outline:Login Page

 Given User opens the Browser.
 And Navigate to the given URL.
 When User Enters "<UserName>" and "<Password>"
 And Click on the login button.
 Then  Validate the LoginPage Title "<ExpectedTitle>"
 
Examples:

|UserName  | Password |ExpectedTitle  |
|Admin     |admin123  |OrangeHRM      | 
|Admin     |admin123  |OrangeHRM      | 
|Admin     |admin123  |OrangeHRM      | 

  
                 
        

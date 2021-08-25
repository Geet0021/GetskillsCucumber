Feature: Login Functionality

  Scenario Outline: Login Testing
    Given User Navigate to Getskills website
    And Click on login button
    And enter valid Username <Username>
    And enter valid Password <Password>
    When click on the loginbutton user is inside the loginpage
    Examples:
      |Username|Password|
      |"gurjeetkaur0021@gmail.com"|"password"|

    


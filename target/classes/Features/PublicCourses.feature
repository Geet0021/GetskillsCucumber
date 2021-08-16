Feature: Choose courses from the given list

  Scenario: Login testing
    Given User Navigate to Getskills website
    And Click on login button
    And enter valid Username
    And Enter Password
    When click on the loginbutton user is inside the loginpage

  Scenario Outline: Courses  testing
    Given User is inside my classroom
    And Click on Public Courses button
    And Number of courses will be shown along with the Course,code,Subject,Topic,Description,price,action
    Then User click on join
    Then Payment form is on screen
    Examples:
      |  Username |Password
      |  gurjeetkaur0021@gmail.com|K@navjot1



Feature: Check Functionality inside My Classroom
Background: User is logged in
  Given user navigate to getskills website
  And User click on loginbutton
  When user enters valid username and password
  Then user navigated to homepage

  Scenario:Check Dashboard Link

    When User click on Dashboard button
    Then user can see MyClassroom Text

    Scenario: Check Test Functionality

      When User click on Test button
      Then Number of test displayed

      Scenario: Check Work Requests

        When User click on Work request button
        Then Work request sheet displayed


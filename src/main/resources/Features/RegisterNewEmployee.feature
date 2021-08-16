Feature: Go to getskills website
  Scenario: Create Register as NewEmployer.

    Given  User Navigate to Getskills website
    Given User click register as employer
    Then getskills user fill following fields with values
      |Company Name  | ABCD|
      |Description| The Given Values should be tested|
      |Address|Villa 1|
      |Email Address|abc@getskill.com|
      |First Name|Merelene|
      |Last Name |Hessing|
      |Mobile| 02040013000|
      |Password|abc@abc|
      |Confirm Password|abc@abc|
      |Enter Code  |1010|
     Then click on RegisterNow

















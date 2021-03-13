Feature: login validation

  Background:
  
    Given Open browser
    |chrome|
    |firefox|
    |ie|
    And navigate to url
    When user type userID in user text box
    And usertype userID in textbox
    And usertype password in textbox
    And user click on login button
    Then user should land in his profile page

@regression
Scenario Outline:  as a user using invalid credential should not be logged in
  
    Given Open browser
    And navigate to url
    When user type <"userid"> in user text box
    And usertype userID in textbox
    And usertype <"password"> in textbox
    And user click on login button
   Then user should not land in his profile page

   
   Examples:
   
   |userid|password|
   |user1|33223|
   |user2|hbsh|
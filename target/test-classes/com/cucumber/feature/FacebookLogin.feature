@fb
Feature: Facebook application automation script

Background: User launch the application
Given User launch the facebook application

  Scenario Outline: Verify the user username
    And User enter the "<UserName>" in the username feild
    And User enter the "<Password>" in the password feild
    Examples:
    |UserName			|Password	|
    |Divya				|1234			|
    |Sneha				|234567890|
    |Deepika			|234567		|


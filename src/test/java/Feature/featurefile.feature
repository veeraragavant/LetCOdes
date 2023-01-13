
@Regression
Feature: Practicing in Let Code
  
  Background:

 Given User is Launching the Browser
 And User is Opening the URL
 
  @TC-101
  Scenario Outline: Logging in Test Scenarios
  
    Given User is Launching the Browser
    And User is Opening the URL
    When User is Logging through emailid <Username>
    Then User is Logginng through password <Password>
    
    Examples:
|Username|Password|
|"ragavthiyagu@gmail.com"|"Tveera7@7"|
|"ragavthiyag@gmail.com"|"Tveer8@7"|
|"ragaviyagu@gmail.com"|"hgy@h"|


@TC-102

Scenario Outline: Selecting Multiple Dropdowns

 Given User is Launching the Browser
 And User is Opening the URL
 Then User is Selecting dropdownone <FirstDropdown>
 Then User is Selecting dropdowntwo <SecondDropdown>
 
 Examples:

|FirstDropdown|SecondDropdown|
|1|1|
|2|2|

 @TC-103
 
 Scenario: Testing Shopping Websites
 
 Given User is Calculating total Products in Page one
 
 @TC-104
 
 Scenario: Handling Multiple Windows
 
 Then User is Opening Another Window and Performing Actions there
 
 @TC-105
 
 Scenario: Frames Checking
 
 Then User is Selecting the Frame
 
 @TC-106
 
 Scenario: Webtables
 
 Then User is Fetching Data in WebTables
 
 @TC-107
 
 Scenario: Google Search
 
 Then User is Performing Google Dynamics
 









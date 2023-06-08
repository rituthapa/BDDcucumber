
#this feature file is written in simple non-technical language
#so it can be understood by user/clients/businessppl/allnon-technicalandtechnical ppl

Feature: Login for sauce demo
 As a user, I want to login to the website

  Scenario: login with valid login credentials
    Given I enter the url of saucedemo website
    When I enter valid username
    And I enter valid password
    And I enter login button
    Then I will reach the HomePage for products
   

 
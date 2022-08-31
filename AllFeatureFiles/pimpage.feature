Feature: test Orange HRM application

 Scenario: test login page Functionality
    Given user is on login page
    When user enter valid username and valid password

  Scenario: test Home Page Functionality
    Then validate home page title
    And validate home page url
    And validate home page logo

  Scenario: test PIM page Functionality
   
    When user click on pim link
    Then user will be pim page
    And user click on add button
   Then user enter firstname, middlename and last name
    And user click on save button
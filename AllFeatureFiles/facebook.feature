Feature: test facebook application

  Scenario Outline: test multiple login functionality
    Given user is on register page
    When user enter valid "<firstname>" ,"<lastname>","<mobOremailId>" and "<password>"
    Then user is on hopmepage

    Examples: 
      | firstname | lastname | mobOremailId  | password    |
      | saurabh   | arbuj    | abc@gmial.com | saurabh123  |
      | kanahaya  | birdar   | kb@gmial.com  | kanahaya123 |
      | digvijay  | mohite   | dm@gmial.com  | digvijay123 |

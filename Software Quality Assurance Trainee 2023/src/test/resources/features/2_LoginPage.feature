


Feature: Login page functionality
  Scenario: Login with valid phone number and password
    Given user is on login page
    When Click signin button
    And Enter valid email address "brainstation23@yopmail.com"
    And Enter valid password "Pass@1234"
    And Click on signIn button
    And Click on the menue option
    And Click on the sharelead
    And click on the continue button
    And Click on the set up a  sharebus
    And click on the from location "Oslo, Norway"
    And select the destination point "Kolbotn,Norway"
    And select starting datepiker
    And select starting time
    And select return date
    And select return time
    And Click on the continue
@smoke
Feature: Smoke testing BoA web app

  Background:
    Given User logged into their BoA account

  @PSM-01
  Scenario: User can see their accounts page
    And user clicks on "Accounts" tab
    Then user should see their account page

  @PSM-02
  Scenario: User can see their FICO score
    And user clicks on "Information" tab
    Then user should see their fico score

  @PSM-03
  Scenario: Testing browser on Jenkins
    And correct browser picked up

Feature: Buttons Test

  Scenario: Clicking the "Click Me" button
    Given the user is on the "https://demoqa.com/elements" page
    When the user clicks on the "Buttons" element
    And the user clicks on the "Click Me" button
    Then the user should see the message "Button has been clicked"

Feature: WebTables Test

  Scenario: Adding and Editing a Record in WebTables
    Given the user is on the "https://demoqa.com/webtables" page
    When the user clicks on the "ADD" button
    And the user enters the details for a new record
    And the user saves the new record
    And the user edits the added record
    Then the user should see the updated information for the record
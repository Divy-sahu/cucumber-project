Feature: Test Login Page

  # This feature verifies the login functionality for multiple sets of credentials.

  Scenario Outline: Test Login Page Functionality
    Given Open Browser Enter url
    Then enter "<Username>" and "<Password>" in step

    Examples:
      | Username | Password  |
      | Admin    | admin123  |
      | admin    | admin     |

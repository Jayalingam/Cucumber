Feature: To validate search box in automation Page

  Scenario Outline: To validate search box in automation practice website
    Given open automation page and maximize the screen
    Then pass a text into text box "<keyword>"
    Then click the search button
    And validate no result found error
    Then close the browser

    Examples:
      | keyword          |
      | sgdtytiaasdfsdf  |
      | arsfjergerogkero |


  Scenario Outline: To validate search box results in automation practice website
    Given open automation page and maximize the screen
    Then pass a text into text box "<keyword>"
    And click the search button
    Then validate the search results "<keyword>"

    Examples:
      | keyword |
      | Google  |

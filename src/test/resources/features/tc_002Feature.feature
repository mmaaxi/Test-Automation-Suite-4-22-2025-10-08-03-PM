Feature: Validate error for uploading file larger than 50MB

  Scenario: Attempt to upload file greater than 50MB
    Given I am on the file upload page
    When I try to upload a file larger than 50MB
    Then I should see an error message
    And the error message should indicate the file size exceeds the limit
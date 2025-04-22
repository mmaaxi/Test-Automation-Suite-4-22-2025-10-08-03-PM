Feature: Validate compressed document upload and decompression

  Scenario: Upload and decompress a valid compressed file
    Given I have a valid compressed file "documents.7z"
    When I upload the compressed file
    Then the system should accept the compressed file
    When I confirm the upload
    Then the system should decompress the file
    And the extracted files should be displayed for validation